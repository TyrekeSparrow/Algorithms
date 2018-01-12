package com.pop900.algorithm.test;

import java.util.ArrayList;

/**
 * Created by michael on 17-10-1.
 */
public class Clockwise {


    /* input
         1  2  3  4
         5  6  7  8
         9  10 11 12
         13 14 15 16
        */
    /* output
     1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    */
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13,14,15,16 }
        };

        Clockwise clockwise = new Clockwise(array);
        clockwise.printPointsClockwise();


    }

    // ==============================================================================================================

    private static final class Direction {
        public final int i;
        public final int j;

        public Direction(int i, int j) {
            this.i = i;
            this.j = j;
        }

        // {right down left up}
        /*
        right   (0, 1);
        down    (1, 0);
        left    (0, -1);
        up      (-1, 0);
        */

        private static final Direction[] TURN_DIRECTION = {
                new Direction(0, 1),
                new Direction(1, 0),
                new Direction(0, -1),
                new Direction(-1, 0)
        };

        public static Direction turnDirection(Direction direction) {
            if (direction == null) return null;

            for (int i = 0; i < TURN_DIRECTION.length; i++) {
                if (TURN_DIRECTION[i].equals(direction)) {
                    int nextIndex = i + 1;
                    if (nextIndex == TURN_DIRECTION.length) {
                        nextIndex = 0;
                    }

                    Direction turnDirection = TURN_DIRECTION[nextIndex];
//                    System.out.println("turnDirection = " + turnDirection);
                    return turnDirection;
                }
            }
            return null;
        }

        public static boolean isDirectionOpposite(Direction inputDirection, Direction currentDirection) {
            if (inputDirection != null && currentDirection != null && inputDirection != currentDirection) {
                if (inputDirection.i == currentDirection.i && inputDirection.j == (0 - currentDirection.j)) {
                    return true;
                } else if (inputDirection.i == (0 - currentDirection.i) && inputDirection.j == currentDirection.j) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == null) return false;
            if (obj == null) return false;
            if (! (obj instanceof Direction)) return false;

            Direction newDirection = (Direction) obj;
            if (this.i == newDirection.i && this.j == newDirection.j) {
                return true;
            }

            return false;
        }

        @Override
        public String toString() {
            if (this != null) {
                return "" + i + j;
            }
            return null;
        }
    }

    private static final class Point {
        public final int row;
        public final int column;


        public Point(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == null) return false;
            if (obj == null) return false;
            if (! (obj instanceof Point)) return false;

            Point newPoint = (Point) obj;
            if (this.row == newPoint.row && this.column == newPoint.column) {
                return true;
            }

            return false;
        }

        public static Point getNextPoint(Point inputPoint, Direction nextDirection) {
            if (inputPoint == null) return null;
            if (nextDirection == null) return null;

            int newRow = inputPoint.row + nextDirection.i;
            int newColumn = inputPoint.column + nextDirection.j;
            Point nextPoint = new Point(newRow, newColumn);

            return nextPoint;
        }

        @Override
        public String toString() {
            if (this != null) {
                return "" + row + column;
            }
            return null;
        }
    }

    private static final class Arrow {
        public final Direction direction;
        public final Point point;

        public Arrow(Direction direction, Point point) {
            this.direction = direction;
            this.point = point;
        }
    }
    // ==============================================================================================================

    private final int[][] mInputArray;
    private final ArrayList<Point> mPointsClockwise;

    public Clockwise(int[][] inputArray) {
        mInputArray = inputArray;
        mPointsClockwise = new ArrayList<Point>(inputArray.length * inputArray[0].length);
        getPointsClockwise();
    }

    private boolean isPointOverflow(Point point) {
        if (point != null) {
            if (point.row >= 0 && point.row < mInputArray.length) {
                if (point.column >= 0 && point.column < mInputArray[point.row].length) {
                    return false;
                }
            }
        }
        return true;
    }

    private void getPointsClockwise() {
        Direction direction = new Direction(0, 1);
        Point point = new Point(0, 0);
        Arrow firstArrow = new Arrow(direction, point);
        Arrow nextArrow = firstArrow;
        mPointsClockwise.add(nextArrow.point);

        while ((nextArrow = getNextArrow(nextArrow)) != null) {
            mPointsClockwise.add(nextArrow.point);
        }
    }

    private Arrow getNextArrow(Arrow inputArrow) {
        // next direction = input direction
        // next point = null
        // do
        // if next direction opposite input direction, next direction = null, break;
        // get next point
        // next point is not overflow && is new, break
        // while next direction = turn(next direction) != null
        // return next arrow

        Direction nextDirection = inputArrow.direction;
        Point nextPoint = null;

        do {
//            System.out.println("nextDirection = " + nextDirection);
            if (Direction.isDirectionOpposite(inputArrow.direction, nextDirection)) {nextDirection = null; break;}
            nextPoint = Point.getNextPoint(inputArrow.point, nextDirection);
            if (nextPoint != null && !isPointOverflow(nextPoint) && !mPointsClockwise.contains(nextPoint)) break;
            else nextPoint = null;
        } while((nextDirection = Direction.turnDirection(nextDirection)) != null);

//        System.out.println("nextDirection = " + nextDirection);
//        System.out.println("nextPoint = " + nextPoint);
//        System.out.println();

        if (nextDirection != null && nextPoint != null) {
            Arrow nextArrow = new Arrow(nextDirection, nextPoint);
            return nextArrow;
        }

        return null;
    }

    public void printPointsClockwise() {
        if (mPointsClockwise != null && mPointsClockwise.size() > 0) {
            System.out.println("mPointsClockwise size = " + mPointsClockwise.size());
            for (Point point: mPointsClockwise) {
                int value = mInputArray[point.row][point.column];
                System.out.printf(" " + value + " ");
            }
        }
    }



}
