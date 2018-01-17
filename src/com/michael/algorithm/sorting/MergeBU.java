package com.michael.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class MergeBU extends ClientSort {
    public static void sort(Comparable[] a) {
        final int N = a.length;
        aux = new Comparable[N];


        // double merge from 1
        for (int sz = 1; sz < N; sz += sz) {
            // merge every double size
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min((lo + sz + sz -1), N-1));
            }
        }









    }



}
