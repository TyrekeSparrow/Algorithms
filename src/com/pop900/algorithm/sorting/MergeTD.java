package com.pop900.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class MergeTD extends ClientSort {
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);




    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        // sortTD left and right
        // merge them
        final int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }


}
