package com.michael.offer;

import com.pop900.algorithm.fundamenal.Stack;

public class MaxSum {
    public static void main(String[] args) {
        final int row = 4;
        final int column = 4;
        int[][] array = {
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5},
        };

        // {1, 12, 5, 7, 7, 16, 5} 53
        Stack maxValueStack = getMaxValue(array, row, column);
//        System.out.println("maxValue = " + maxValue);

        Object gift = null;
        while ((gift = maxValueStack.pop()) != null) {
            System.out.println(gift);
        }
    }

    private static Stack<Integer> getMaxValue(int[][] array, int row, int column) {
//        int[] maxValues = new int[column];
        int[][] maxValues = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
//                setMaxValueAtPosition(array, i, j, maxValues);
                setMaxValueAtPosition(array, i, j, maxValues);
            }
        }

//        return maxValues[column - 1];
//        return maxValues[row - 1][column - 1];
        Stack<Integer> stack = new Stack<Integer>();

        int i = row - 1;
        int j = column - 1;
        stack.push(array[i][j]);

        while (i > 0 || j > 0) {
            if (i == 0) {
                stack.push(array[i][--j]);
                continue;
            }

            if (j == 0) {
                stack.push(array[--i][j]);
            }

            if (i != 0 && j != 0) {
                int max = (array[i][j - 1] > array[i -1][j] ? array[i][--j] : array[--i][j]);
                stack.push(max);
            }
        }

//        if (i == 0 && j == 0) {
//            maxValueStack.push(maxValues[i][j]);
//        }

        return stack;
    }


    /**
     * get max value at (i, j)
     * @param array
     * @param row
     * @param column
     * @param maxValues
     * @return
     */
    private static void setMaxValueAtPosition(int[][] array, int row, int column, int[][] maxValues) {
        if (row == 0 && column == 0) {
            maxValues[row][column] = array[0][0];
            return;
        }

        if (row == 0 && column != 0) {
            maxValues[row][column] = maxValues[row][column - 1] + array[row][column];
            return;
        }

        if (column == 0 && row != 0) {
            maxValues[row][column] = maxValues[row - 1][column] + array[row][column];
            return;
        }

        if (row != 0 && column != 0) {
            int previousMaxValue = (maxValues[row][column - 1] > maxValues[row - 1][column] ? maxValues[row][column - 1] : maxValues[row - 1][column]);
            maxValues[row][column] = previousMaxValue + array[row][column];
            return;
        }
    }


}
