package com.michael.offer;

public class NumberTimes {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
        int k = 3;
        int times = getTimes(array, 3);
        System.out.println("times = " + times);
    }

    private static int getTimes(int[] array, int k) {

        int firstIndex = getFirstIndex(k, array, 0, array.length - 1);
        int lastIndex = getLastIndex(k, array, 0, array.length - 1);
        System.out.println(firstIndex);
        System.out.println(lastIndex);

        int times = lastIndex - firstIndex + 1;
        return times;
    }

    private static int getLastIndex(int k, int[] array, int begin, int end) {
        if (array == null || array.length == 0) return -1;
        if (begin < 0 || begin >= array.length) return -1;
        if (end < 0 || end >= array.length) return -1;
        if (end < begin) return -1;

        int middle = (begin + end) / 2;
        int lastK = -1;
        if (array[middle] == k) {
            if (middle < array.length - 1) {
                if (array[middle + 1] == k) {
                    lastK = getLastIndex(k, array, middle + 1, end);
                } else {
                    return middle;
                }
            } else {
                return middle;
            }
        } else if (k > array[middle]) {
            lastK = getLastIndex(k, array, middle + 1, end);
        } else if (k < array[middle]) {
            lastK = getLastIndex(k, array, begin, middle - 1);
        } else {
            // no else
        }
        return lastK;
    }

    private static int getFirstIndex(int k, int[] array, int begin, int end) {
        if (array == null || array.length == 0) return -1;
        if (begin < 0 || begin >= array.length) return -1;
        if (end < 0 || end >= array.length) return -1;
        if (end < begin) return -1;

        int middle = (begin + end) / 2;
        int firstK = -1;
        if (array[middle] == k) {
            if (middle > 0) {
                if (array[middle - 1] == k) {
                    firstK = getFirstIndex(k, array, begin, middle - 1);
                } else {
                    return middle;
                }
            } else {
                return middle;
            }
        } else if (k > array[middle]) {
            firstK = getFirstIndex(k, array, middle + 1, end);
        } else if (k < array[middle]) {
            firstK = getFirstIndex(k, array, begin, middle - 1);
        } else {
            // no else
        }
        return firstK;
    }


}
