package com.pop900.algorithm.others;

import com.pop900.algorithm.util.SortUtil;

/**
 * Created by michael on 16-8-18.
 */
public class ShellSort {
    private static final String[] SORT_ARRAY = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {

        SortUtil.show(SORT_ARRAY);
        int l = SORT_ARRAY.length;
        System.out.println("length = " + l);
        sort(SORT_ARRAY);
        SortUtil.show(SORT_ARRAY);




    }




    public static void sort(Comparable[] a) {
        // TODO
        // every step is sorted
        // final step is 1
        // get step


        int step = 1;

        while (step < a.length / 3) {
            step = step * 3 + 1;
        }

        while (step > 0) {
            System.out.println("step = " + step);


            // 13 step
                // 0 13 is sorted
                // 1 14 is sorted
            // 4 step
                // 0 4 is sorted
                // 1 5
                // 2 6
                // 4 8
                // i >= step, <l
            // 1 step

            // selection sortTD
            for (int i = step; i < a.length; i++) {
                // before i is sorted
                for (int j = i; j >= step; j -= step) {
                    // is next is less then previous, exchange them
                    if (SortUtil.less(a[j], a[j- step])) {
                        SortUtil.exchange(a, j, j - step);
                    }
                }
            }


            step = step / 3;
        }
















    }
}
