package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class ReorderOdd {
    public static void main(String[] args) {
        // {1, 2, -3, -4, 5, 6, 7, -9}
        // 奇数在前 偶数在后
        // 负数在前 非负数在后
        // 被三整除在前 不能整除
        int[] array = {1, 2, -3, -4, 5, 6, 7, -9};
        reorderOdd(array);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
    }

    public static void reorderOdd(int[] array) {
        if (array == null) return;
        if (array.length == 0) return;
        if (array.length == 1) return;

        int iStart = 0;
        int iStop = array.length - 1;
        while (iStart < iStop) {
            while (iStart < iStop && isValid(array, iStart)) {
                iStart++;
            }
            while (iStart < iStop && !isValid(array, iStop)) {
                iStop--;
            }

            if (iStart < iStop) {
                int temp = array[iStart];
                array[iStart] = array[iStop];
                array[iStop] = temp;
            }
        }
    }

    private static boolean isValid(int[] array, int index) {
//        boolean isValid = isOdd(array, index);
//        boolean isValid = isNegative(array, index);
        boolean isValid = is3S(array, index);
        return isValid;
    }

    // 奇数在前 偶数在后
    private static boolean isOdd(int[] array, int index) {
        if (array == null) return false;
        boolean isOdd = (array[index] & 1) == 1;
        return isOdd;
    }

    // 负数在前 非负数在后
    private static boolean isNegative(int[] array, int index) {
        if (array == null) return false;
        boolean isNegative = array[index] < 0;
        return isNegative;
    }

    // 被三整除在前 不能整除
    private static boolean is3S(int[] array, int index) {
        if (array == null) return false;
        boolean is3S = array[index] % 3 == 0;
        return is3S;
    }
}
