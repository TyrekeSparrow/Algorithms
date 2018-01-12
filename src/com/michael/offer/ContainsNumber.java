package com.michael.offer;

/**
 * Created by michael on 17-10-15.
 */
public class ContainsNumber {

    // input 5
    /*
    {   {1, 2, 8, 9},
        {2, 4, 9, 12},
        {4, 7, 10 ,13},
        {6, 8, 11, 15}
    }
    */

    // output
    // false

    public static void main(String[] args) {

        int[][] array = {
                            {1, 2, 8, 9},
                            {2, 4, 9, 12},
                            {4, 7, 10 ,13},
                            {6, 8, 11, 15}
                        };
        ContainsNumber containsNumber = new ContainsNumber(array);
//        boolean contains = containsNumber.contains(5);
        boolean contains = containsNumber.contains(7);
        System.out.println("contains = " + contains);
    }

    private final int[][] array;

    public ContainsNumber(int[][] array) {
        this.array = array;
    }

    public boolean contains(int target) {
        if (array == null || array.length == 0) return false;

        int row = 0;
        int column = array[row].length - 1;
        int value;

        while (row >= 0 && row < array.length && column >= 0 && column < array[row].length) {
//            System.out.printf(" " + row);
//            System.out.printf(" " + column);
            System.out.println();
            value = array[row][column];

            if (target < value) {
                column--;
            } else if (target > value) {
                row++;
            } else {
                // equals
                break;
            }


        }

        if (row >= 0 && row < array.length && column >= 0 && column < array[row].length) {
            System.out.println("row = " + row);
            System.out.println("column = " + column);
            return true;
        }

        return false;
    }






}
