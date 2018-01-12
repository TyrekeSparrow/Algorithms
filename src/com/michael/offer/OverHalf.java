package com.michael.offer;

public class OverHalf {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 3, 3, 2, 3, 3, 7, 3, 8, 3, 3, 3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        int value = getOverHalfNumber(array);
        System.out.println("value = " + value);
    }

    public static int getOverHalfNumber(int[] array) {
        int value = -1;
        int times = 0;

        for (int i = 0; i < array.length; i++) {
            if (value == -1) {
                value = array[i];
                times++;
            } else if (array[i] == value) {
                times++;
            } else {
                times--;
            }

            if (times == 0) {
                value = -1;
            }
        }

        return value;
    }



}
