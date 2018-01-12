package com.pop900.algorithm.others;

import com.pop900.algorithm.util.SortUtil;

/**
 * Created by michael on 16-9-26.
 */
public class IndexMinPQ<Key extends Comparable<Key>> {
    private static final String[] INSERT = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {
        int l = INSERT.length;
        IndexMinPQ<String> pq = new IndexMinPQ<String>(l);
//        IndexMinPQ<String> pq = new IndexMinPQ<>();
        for (int i = 0; i < l; i++ ) {
            pq.insert(i, INSERT[i]);
        }
//        pq.change(5, "H");
//        System.out.println("insert 7 = " + INSERT[7]);
//        pq.insert(7, "G");

//        pq.delete(7);
//        System.out.println("contains 7 = " + pq.contains(7) + " " + pq.item(7));

        while (pq.size() > 0) {
            pq.delMin();
        }



        System.out.println();
    }

    // number of elements on pq
    private int N;
    // binary heap using 1-based indexing
    private int[] pq;
    // inverse qp
    private int[] qp;
    // items with priorities
    private Key[] keys;

    public IndexMinPQ() {
        new IndexMinPQ(30);
    }

    // construct
    public IndexMinPQ(int maxN) {
        keys = (Key[]) new Comparable[maxN + 1];
        pq = new int[maxN + 1];
        qp = new int[maxN + 1];
        for (int i = 0; i <= maxN; i++) {
            qp[i] = -1;
        }
    }

//    public void showAll() {
//        for (int i = 1; i <= N; i++) {
//            System.out.printf(" " + keys[pq[i]]);
//        }
//    }

    // insert
    public void insert(int k, Key key) {
        N++;
        qp[k] = N;
        pq[N] = k;
        keys[k] = key;
        swim(N);
    }

    // change
    public void change(int k, Key key) {
        keys[k] = key;
        int i = qp[k];
        swim(i);
        sink(i);
    }

    // contains
    public boolean contains(int k) {
        return qp[k] != -1;
    }

    // delete
    public void delete(int k) {
        exchange(qp[k], N--);
        int i = qp[k];
        swim(i);
        sink(i);
        keys[pq[N + 1]] = null;
        qp[pq[N + 1]] = -1;
    }

    // min
    public Key min() {
        return keys[pq[1]];
    }

    // minIndex
    public int minIndex() {
        return pq[1];
    }

    // delMin
    public int delMin() {
        if (N == 0) return -1;
        int i = pq[1];
        exchange(1, N--);
        sink(1);
//        System.out.printf(" " + keys[pq[N + 1]]);
        keys[pq[N + 1]] = null;
        qp[pq[N + 1]] = -1;
        pq[N + 1] = 0;
        return i;
    }

    // isEmpty
    public boolean isEmpty() {
        return N == 0;
    }

    // size
    public int size() {
        return N;
    }

    // less
    public boolean less (int i, int j) {
        int v = pq[i];
        int w = pq[j];
        return SortUtil.less(keys[v], keys[w]);
    }

    // exchange
    public void exchange(int i, int j) {
        int t = pq[i];
        pq[i] = pq[j];
        qp[pq[j]] = i;
        pq[j] = t;
        qp[t] = j;
    }

    // swim
    public void swim(int k) {
        if (k > 1) {
            int p  = k / 2;
            if (less(k, p)) {
                exchange(k , p);
                swim(p);
            }
        }
    }

    public Key item(int k) {
        Key item = keys[k];

        return item;
    }

    // sink
    public void sink(int k) {
        int j = k;
        int l = 2 * k;
        int r = 2 * k + 1;
        if (l <= N && less(l, j)) {
            j = l;
        }
        if (r <= N && less(r, j)) {
            j = r;
        }
        if (j != k) {
            exchange(k, j);
            sink(j);
        }
    }





}
