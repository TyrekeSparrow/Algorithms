package com.michael.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class SelectionSort extends ClientSort {
    public static void sort(Comparable[] a) {
        // for each index, get minimum value
        final int N = a.length;
        for (int i = 0; i < N; i++) {
            // get minimum index
            // exchange value
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
