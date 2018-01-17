package com.michael.algorithm.others;

import com.michael.algorithm.util.SortUtil;

/**
 * Created by michael on 16-8-18.
 */
public class MergeSort {
    private static final String[] SORT_ARRAY = {"M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};





    public static void main(String[] args) {
        SortUtil.show(SORT_ARRAY);
//        sortTD(SORT_ARRAY);
        sortBU(SORT_ARRAY);
        SortUtil.show(SORT_ARRAY);








    }

    public static void sortTD(Comparable[] a) {
        // to sortTD o ~ (l -1)


        sortTD(a, 0, a.length - 1);













    }

    public static void sortBU(Comparable[] a) {
        // 01 23 45 67 8        size 1
        // 0123 4567 8          size 2
        // M E R G E S O R T
        // ME RG

        // every double size is sorted
        // size [1, N]
        // size  = size + size

        // "M" is sorted
        // merge sorted
        // double size and merge


        for (int size = 1; size < a.length; size = size + size) {
            // every double size, step is double size
            // offset [0, a,length) step = double sizes

            System.out.println("size = " + size);


            for (int offset = 0; offset < a.length; offset = offset + size * 2) {
                // merge
                // lo = offset
                // hi = min(offset + size * 2, a.length - 1)
                // mid = min((offset - 1 + size, a.length - 1))
                int lo = offset;
                int hi = Math.min((offset - 1 + size * 2), (a.length - 1));
                int mid = Math.min((offset - 1 + size), (a.length - 1));
                System.out.println(lo + " " + mid + " " + hi + "");
                merge(a, lo, mid, hi);
            }










        }

















    }





    public static void sortTD(Comparable[] a, int lo, int hi) {
        System.out.printf("sortTD " + lo + " " + hi + " ");
        System.out.println();
        int mid = lo + (hi - lo) / 2;
        if (mid > lo) {
            sortTD(a, lo, mid);
        }
        if (mid + 1 < hi) {
            sortTD(a, mid + 1, hi);
        }
        merge(a, lo, mid, hi);

    }


    private static final Comparable[] TEMP_ARRAY = new Comparable[SORT_ARRAY.length];

    public static void merge(Comparable[] a, int lo, int mid, int hi) {


        if (lo >= hi) {
            return;
        }
        if (mid < lo || mid > hi) {
            return;
        }

        for (int i = lo; i <= hi; i++) {
            TEMP_ARRAY[i] = SORT_ARRAY[i];
        }

        // 3567 2489
        // 23456789
        // get the minimum from left and right
        // assign to position


        // RG
        // [lo, mid]
        int v = lo;
        // [mid + 1, hi]
        int w = mid + 1;
        for (int j = lo; j <= hi; j++) {

            // get a[j] from temp[v] and temp[w]
            if (v > mid) {
                a[j] = TEMP_ARRAY[w++];
                continue;
            }
            if (w > hi) {
                a[j] = TEMP_ARRAY[v++];
                continue;
            }
            if (SortUtil.less(TEMP_ARRAY[v], TEMP_ARRAY[w])) {
                a[j] = TEMP_ARRAY[v++];
            } else {
                a[j] = TEMP_ARRAY[w++];
            }

        }

    }








}
