package com.michael.algorithm.sorting;

/**
 * Created by michael on 16-8-9.
 */
public class MaxPQ<Key extends  Comparable<Key>> {
//    private static final String[] INSERT = {"P", "Q", "E", null, "X", "A", "M", null, "P", "L", "E", null};
    private static final String[] INSERT = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {
        // construct heap
        // insert ... and remove max ...
        // print heap
        final int l = INSERT.length;
        final MaxPQ<String> maxPQ = new MaxPQ<String>(l);
        for (int i = 0; i < l; i++) {
            final String s = INSERT[i];
            if (s == null) {
                // remove
                maxPQ.delMax();
            } else {
                // insert
                maxPQ.insert(s);
            }
//            maxPQ.show();
        }
        maxPQ.show();


        // get max
        // exchange 1 and max
        // show sorted pq


        for (int i = 0; i < l; i++) {
            maxPQ.delMax();
        }

        maxPQ.showAll();

























    }

    private Key[] pq; // heap ordered
    private int N; // size


    public void showAll() {
        for (int i = 0; i < pq.length; i++) {
            System.out.printf(pq[i] + " ");
        }
    }

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    public Key delMax() {
        final Key max = pq[1];
        exch(1, N--);
//        pq[N + 1] = null;
        pq[N + 1] = max;
        sink(1);
        return max;
    }

    private boolean less(int i, int j) {
//        System.out.println(i + ": " + pq[i]);
//        System.out.println(j + ": " + pq[j]);
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        final Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swim(int k) {
        while(k > 1 && less(k / 2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) {
                j++;
            }
//            System.out.printf(j + " " + k);
//            System.out.println();
            if (less(j, k)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    public void show() {
        for (int i = 1; i <= N; i++) {
            System.out.printf(pq[i] + "");
        }
        System.out.println();
    }




}
