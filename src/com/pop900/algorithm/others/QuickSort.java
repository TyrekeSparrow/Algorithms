package com.pop900.algorithm.others;

import com.pop900.algorithm.util.SortUtil;

/**
 * Created by michael on 16-8-19.
 */
public class QuickSort {
//    private static final String[] a = {"Q", "U", "I", "C", "K", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
    private static final String[] a = {"K", "R", "A", "T", "E", "L", "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};

    public static void main(String[] args) {


        // length 16
        System.out.println("a length = " + a.length);
        SortUtil.show(a);
        sort(a);
        SortUtil.show(a);






    }

    public static void sort(Comparable[] a) {

        sort(a, 0, a.length - 1);

    }

    public static void sort(Comparable[] a, int lo, int hi) {

        if (lo >= hi) {
            return;
        }
        System.out.println(lo + " " + hi + " ");

        int pivot = partition(a, lo, hi);
        sort(a, lo, pivot - 1);
        sort(a, pivot + 1, hi);

    }

    public static int partition(Comparable[] a, int lo, int hi) {

        // KRATELEPUIMQCXOS
        // K lo is pivot position
        // rATELEPUIMQcXOS      i = lo + 1, j = hi - 3
        // CAtELEPUiMQRXOS      i = lo + 3, j = hi -6
        // CAIElePUTMQRXOS      i = l,      j = e
        // CAIEELPUTMQRXOS      if (j > i): exchange lo j

        // partition [0, 15] lo hi
        // for each partition
        // partition 0
        // left is less
        // right is more
        // left [lo, ?]
        // right [hi + 1, ]
        // exchange i j
        // after exchange
        // i and left of i is less then pivot
        // j and right of j is more than pivot
        // pivot == j (when j <= i)


        int i = lo; // less
        int j = hi + 1; // more
        while (i <= hi && j > lo) {

            // get more position in left
            while (i <= hi) {
                if (SortUtil.less(a[lo], a[++i])) {
                    break;
                }
            }
            // get less position in right
            while (j > lo) {
//                System.out.println(j);
                if (SortUtil.less(a[--j], a[lo])) {
                    break;
                }
            }
//                    System.out.printf("i = " + i + " ");
//                    System.out.println("j = " + j);

            // exchange them

            // if (j > i) break
            // j is pivot
            if (j < i) {
                // exchange pivot before more
                SortUtil.exchange(a, lo, j);
                break;
            } else {
                // exchange less and more
                SortUtil.exchange(a, i, j);
            }
        }
        return j;
    }




}
