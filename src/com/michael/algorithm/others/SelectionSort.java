package com.michael.algorithm.others;

import com.michael.algorithm.util.SortUtil;

/**
 * Created by michael on 16-8-18.
 */
public class SelectionSort {
    public static final String[] SORT_ARRAY = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};


    public static void main(String[] args) {




        SortUtil.show(SORT_ARRAY);
        sort(SORT_ARRAY);
        SortUtil.show(SORT_ARRAY);


















    }

    public static void sort(Comparable[] a) {
        // less
        // exchange
        // sortTD
        // show
        // for each get the minimum position, then exchange
        for (int i = 0; i < a.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < a.length; j++) {
                // get the min position
                if (SortUtil.less(a[j], a[minPosition])) {
                    minPosition = j;
                }
            }
            // if minPosition != i, exchange value
            if (minPosition != i) {
                SortUtil.exchange(a, i, minPosition);
            }
        }
    }












}
