package com.michael.offer;

/**
 * Created by michael on 17-11-25.
 */
public class PrintMatrixClockwise {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int rows = 4;
        int cols = 4;
        printClockwise(array, rows, cols);
//        int[][] ii = new int[2][9];
//        System.out.println("ii length = " + ii.length);

    }



    private static final class Coordinate {
        public static final int RIGHT = 1;
        public static final int DOWN = 2;
        public static final int LEFT = 3;
        public static final int UP = 4;

        public int direction;
        public int row;
        public int col;

        public Coordinate(int direction, int row, int col) {
            this.direction = direction;
            this.row = row;
            this.col = col;
        }

        private static int getNextDirection(int direction) {
            if (direction == RIGHT) return DOWN;
            if (direction == DOWN) return LEFT;
            if (direction == LEFT) return UP;
            if (direction == UP) return RIGHT;
            return 0;
        }

        public static Coordinate getNextCoordinate(Coordinate coordinate) {
            int currentDirection = coordinate.direction;
            int currentRow = coordinate.row;
            int currentCol = coordinate.col;

            return getCoordinate(currentDirection, currentRow, currentCol);
        }

        public static Coordinate turnDirection(Coordinate coordinate) {
            int currentDirection = getNextDirection(coordinate.direction);
            int currentRow = coordinate.row;
            int currentCol = coordinate.col;

            return getCoordinate(currentDirection, currentRow, currentCol);
        }

        private static Coordinate getCoordinate(int currentDirection, int currentRow, int currentCol) {
            int row = -1;
            int col = -1;
            if (currentDirection == RIGHT) {
                row = currentRow;
                col = currentCol + 1;
            } else if (currentDirection == DOWN) {
                row = currentRow + 1;
                col = currentCol;
            } else if (currentDirection == LEFT) {
                row = currentRow;
                col = currentCol - 1;
            } else if (currentDirection == UP) {
                row = currentRow - 1;
                col = currentCol;
            } else {
                return null;
            }
            return new Coordinate(currentDirection, row, col);
        }


    }



    public static void printClockwise(int[][] array, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];

        int direction = Coordinate.RIGHT;
        Coordinate current = new Coordinate(direction, 0, 0);

        visited[current.row][current.col] = true;
        int value = array[current.row][current.col];
        System.out.printf(value + " ");

        while ((current = getNextCoordinate(visited, rows, cols, current)) != null) {
            visited[current.row][current.col] = true;
            value = array[current.row][current.col];
            System.out.printf(value + " ");
        }
    }

    public static Coordinate getNextCoordinate(boolean[][] visited, int rows, int cols, Coordinate current) {
        Coordinate c1 = Coordinate.getNextCoordinate(current);
        if (isValid(visited, rows, cols, c1)) return c1;

        Coordinate c2 = Coordinate.turnDirection(current);
        if (isValid(visited, rows, cols, c2)) return c2;

        Coordinate c3 = Coordinate.turnDirection(c2);
        if (isValid(visited, rows, cols, c3)) return c3;

        Coordinate c4 = Coordinate.turnDirection(c3);
        if (isValid(visited, rows, cols, c4)) return c4;

        return null;
    }

    public static boolean isValid(boolean[][] visited, int rows, int cols, Coordinate coordinate) {
        if (coordinate.row < 0) return false;
        if (coordinate.row >= rows) return false;
        if (coordinate.col < 0) return false;
        if (coordinate.col >= cols) return false;

        if (visited[coordinate.row][coordinate.col]) {
            return false;
        }

        return true;
    }

}
