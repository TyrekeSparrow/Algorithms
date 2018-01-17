package com.michael.algorithm.others;

import com.michael.algorithm.util.SortUtil;

/**
 * Created by michael on 16-8-18.
 */
public class InsertionSort {
    public static final String[] SORT_ARRAY = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {



        SortUtil.show(SORT_ARRAY);
        sort(SORT_ARRAY);
        SortUtil.show(SORT_ARRAY);










    }

    public static void sort(Comparable[] a) {
        // 0 1 is sorted
        // 0 1 2 is sorted
        // 0 1 2 3 is sorted
        // ...
        // 0 1 2 3 ... N is sorted




        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                // compare next to previous, if less, exchange them
                if (SortUtil.less(a[j], a[j - 1])) {
                    SortUtil.exchange(a, j, j - 1);
                }
            }
        }














    }














}
