package com.michael.offer;

import java.util.HashSet;

/**
 * Created by michael on 17-10-15.
 */
public class DuplicateNumber {
    // input
    // {2, 3, 1, 0, 2, 5, 3}
    // output
    // 2/3

    public static void main(String[] args) {

        int[] array = {2, 3, 1, 0, 2, 5, 3};
        DuplicateNumber duplicateNumber = new DuplicateNumber();
//        int i = duplicateNumber.getDuplicateNumber(array);
//        System.out.println("duplicateNumber = " + i);
        int i = duplicateNumber.getDuplicateNumberSort(array);
        System.out.println("duplicateNumber = " + i);
    }

    public int getDuplicateNumber(int[] array) {
        if (array == null || array.length == 0) return -1;

        HashSet<Integer> set = new HashSet<Integer>(array.length);
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            System.out.println("value = " + value);
            if (set.contains(value)) {
                return value;
            } else {
                set.add(value);
            }
        }
        return -1;
    }

    public int getDuplicateNumberSort(int[] array) {
        if (array == null || array.length == 0) return -1;

        int i = 0;
        while (i < array.length) {
            int value = array[i];
            if (value > array.length - 1) return -2;
            if (value == i) {
                i++;
                continue;
            } else {
                int valueValue = array[value];
                if (valueValue == value) {
                    return value;
                } else {
                    exchange(array, i, value);
                }
            }
        }
        return -1;
    }

    private static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
