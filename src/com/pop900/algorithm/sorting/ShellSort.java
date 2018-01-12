package com.pop900.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class ShellSort extends ClientSort {
    public static void sort(Comparable[] a) {
        // get steps
        // for every step, SORT_ARRAY is sorted
        // title step == 1
        // N == 16;
        // get maximum step

        final int N = a.length;
        int h = 1;
        while (h < N/3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {

            // sortTD every step h
            for (int i = h; i < N; i++) {
                // before i, every step is sorted
                for (int j = i; j >= h && less(a[j], a[j - h]); j-= h) {
                    // sortTD every step
                    exch(a, j, j- h);
                }
            }

            h /= 3;
        }


    }












}
