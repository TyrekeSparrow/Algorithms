package com.michael.offer;

public class NumbersAppearOnce {
    public static void main(String[] args) {
        // 6 4
        int[] array = {2, 4, 3, 6, 3, 2, 5, 5};
        int[] numbersOnce = getNumbersOnce(array);
        for (int number : numbersOnce) {
            System.out.println(number);
        }
    }

    private static int[] getNumbersOnce(int[] array) {
        int[] numbersOnce = new int[2];

        int result = 0;
        for (int number : array) {
            result ^= number;
        }

        int bit1Index = findBit1Index(result);
        for (int number : array) {
            if (isBit1(number, bit1Index)) {
                numbersOnce[0] ^= number;
            } else {
                numbersOnce[1] ^= number;
            }
        }

        return numbersOnce;
    }

    private static boolean isBit1(int number, int index) {
        boolean isBit1 = ((number >> index) & 1) == 1;
        return isBit1;
    }

    private static int findBit1Index(int result) {
        int index = 0;

        while (index < 32 && (result & 1) == 0) {
            result = result >> 1;
            index++;
        }

        return index;
    }


}
