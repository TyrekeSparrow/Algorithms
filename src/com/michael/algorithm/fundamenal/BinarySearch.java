package com.michael.algorithm.fundamenal;

import java.util.Arrays;

/**
 * Created by michael on 16-8-8.
 */
public class BinarySearch {
    private static final int[] tinyW = {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 48, 33, 16, 77, 11, 29};
    private static final int[] tinyT = {23, 50, 10, 99, 18, 23, 98, 84, 11, 10, 48, 77, 13, 54, 98, 77, 77, 68};

    public static void main(String[] args) {
        // if T's value is present in w, print value and key
        // else print value and notify other
        // sortTD w
        Arrays.sort(tinyW);
        for (int i: tinyW) {
            System.out.printf(" " + i);
        }
        System.out.println();
        for (int key : tinyT) {
//            int key = 98;
            final int position = rank(key, tinyW);
            // result -1 and >0
            if (position == -1) {
//                System.out.println("!!! " + key + " is not present in w");
                    } else {
                System.out.println(key + " position is " + position);
            }
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
//            System.out.println("lo = " + lo + " hi = " + hi + " mid = " + mid);
//            System.out.printf(" mid = " + mid);
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
