package com.michael.offer;

public class ContinuousArray {
    public static void main(String[] args) {
        final int[] array = {4, 0, 7, 5, 3, 1, 6};
        final boolean isContinuous = isContinuous(array);
        System.out.println(isContinuous);
    }

    private static boolean isContinuous(int[] array) {
        // insert sort
        // count 0
        // check continuous

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.printf(" " + i);
            System.out.println();
        }

        int count0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count0++;
                continue;
            }

            if (i == 0) {
                continue;
            }

            int value = array[i] - array[i - 1] - 1;
            while (value > 0 && value <= count0) {
                value--;
                count0--;
            }

            if (value > 0) {
                return false;
            }
        }

        return true;
    }


}




