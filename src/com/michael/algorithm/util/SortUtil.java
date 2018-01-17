package com.michael.algorithm.util;

/**
 * Created by michael on 16-8-18.
 */
public class SortUtil {
//    public static final String[] SORT_ARRAY = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (Comparable c : a) {
            System.out.printf(c + " ");
        }
        System.out.println();

    }






}
