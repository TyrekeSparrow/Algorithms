package com.michael.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class QuickSort extends ClientSort {
    // sortTD
    // partition
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        final int j = partition(a, lo ,hi);
        System.out.println(j);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // scan left, if i = hi, break, get value smaller than v
        // scan right, if j  = lo, break get value bigger than v
        // exchange i, j
        // exchange lo, j
        // return j


        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];

        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while(less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;


























    }


}
