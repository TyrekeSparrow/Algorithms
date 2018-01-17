package com.michael.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class ClientSort {
    public static void sort(Comparable[] a) {
//        SelectionSort.sortTD(SORT_ARRAY);
//        InsertionSort.sortTD(SORT_ARRAY);
//        ShellSort.sortTD(SORT_ARRAY);
//        MergeTD.sortTD(SORT_ARRAY);
//        MergeBU.sortTD(SORT_ARRAY);
        QuickSort.sort(a);








    }

    public static Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        System.out.println(lo + " " + hi);
        // clone SORT_ARRAY to aux
        // get bigger from aux
        int i = lo;
        int j = mid + 1;


        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        final Comparable comparable = a[i];
        a[i] = a[j];
        a[j] = comparable;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

//    private static final String[] SORT_ARRAY = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
//    private static final String[] SORT_ARRAY = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
//    private static final String[] SORT_ARRAY = {"M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
    private static final String[] a = {"Q", "U", "I", "C", "K", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {
        show(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
















}
