package com.pop900.algorithm.sorting;

import java.lang.annotation.Annotation;

/**
 * Created by michael on 16-8-9.
 */
public class InsertionSort extends ClientSort {
    public static void sort(Comparable[] a) {
        // sorted
        // 0...1
        // 0...2
        // 0...3

        final int N = a.length;
        for (int i = 1; i < N; i++) {
            // for each, exchange j to sorted index
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }




















}
