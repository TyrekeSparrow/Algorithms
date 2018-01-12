package com.pop900.algorithm.others;

import com.pop900.algorithm.util.SortUtil;

/**
 * Created by michael on 16-9-23.
 */
public class MinPQ<Key extends  Comparable<Key>> {
    private static final String[] INSERT = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {
        int l = INSERT.length;
        System.out.println("l = " + l);
        MinPQ<String> pq = new MinPQ<String>(l);
        // insert each
        for (String s: INSERT) {
            pq.insert(s);
        }
        // delMin
        int count = 0;
        while (pq.size() != 0) {
            Object o = pq.delMin();
            if (o != null) {
                count++;
                System.out.printf(" " + o);
            }
        }
        System.out.println("end");
        System.out.println("count = " + count);
    }

    // pq
    private Key[] pq;
    // N
    private int N = 0;

    // construct
    public MinPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public MinPQ() {
        new MinPQ(30);
    }

    // is empty
    public boolean isEmpty() {
        return N == 0;
    }

    // size
    public int size() {
        return N;
    }

    // insert
    public void insert(Key v) {
        pq[++N]  = v;
        swim(N);
    }

    // delete min
    public Key delMin(){
        if (N == 0) return null;
        Key min = pq[1];
        exchange(1, N--);
        pq[N + 1] = null;
        sink(1);
        return min;
    }

    // less
    public boolean less(int i, int j) {
        return SortUtil.less(pq[i], pq[j]);
    }

    // exchange
    public void exchange(int i, int j) {
        SortUtil.exchange(pq, i, j);
    }

    // swim
    public void swim(int k) {
//        while (k > 1 && less(k, k / 2)) {
//            exchange(k / 2, k);
//            k = k / 2;
//        }
        if (k > 1) {
            int p  = k / 2;
            if (less(k, p)) {
                exchange(k, p);
                swim(p);
            }
        }
    }

    // sink
    public void sink(int k) {
        int j = k;
        int l = 2 * k;
        int r = 2 * k + 1;
        // compare with left
        if (l <= N && less(l, k)) {
            j = l;
        }
        // compare with right
        if (r <= N && less(r, j)) {
            j = r;
        }
        // exchange with minimum
        if (j != k) {
            exchange(k, j);
            sink(j);
        }
    }







}
