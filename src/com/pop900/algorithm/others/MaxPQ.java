package com.pop900.algorithm.others;

import com.pop900.algorithm.util.SortUtil;

/**
 * Created by michael on 16-8-19.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private static final String[] INSERT = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
//    private static final String[] INSERT = {"P", "Q", "E", null, "X", "A", "M", null, "P", "L", "E", null};
//    private static final String[] INSERT = {"P", "Q", "E"};

    public static void main(String[] args) {

        // construct max pq
        // print pq

        System.out.println(INSERT.length);
        MaxPQ<String> maxPQ = new MaxPQ<String>(DEFAULT_CAPACITY);
        for (int i = 0; i < INSERT.length; i++) {
            if (INSERT[i] != null) {
                maxPQ.insert(INSERT[i]);
            } else {
                maxPQ.deleteMax();
            }
        }
        // PMLAEE
        maxPQ.showAll();
        // del max
        // heap sort


        // construct heap {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        // X T S P L R A M O E E
        // sort from min to max
        // A E E L M O P R S T X

        // remove all max to right
        final int pqSize = maxPQ.size;
        System.out.println("maxPQ size = " + pqSize);

        for (int j = 1; j <= pqSize; j++) {
            maxPQ.exchangeMaxWithLast();
        }

        maxPQ.showSome(pqSize);















//        maxPQ.showAll();





    }


    // pq array
    // pq size
    private Key[] pq;
    // 0 1
    //     2 3
    //         4 5 6 7
    private int size;




    private static final int DEFAULT_CAPACITY = 30;


    // construct with max size
    public MaxPQ(int maxSize) {
        pq = (Key[]) new Comparable[maxSize + 1];
    }

    public MaxPQ() {
        new MaxPQ(DEFAULT_CAPACITY);
    }

    public void showAll() {
        for (int i = 1; i <= size && i < pq.length ; i++) {
            System.out.printf(pq[i] + " ");
        }
        System.out.println();
    }

    public void showSome(int size) {
        // show all
        for (int i = 1; i <= size; i++) {
            System.out.printf(pq[i] + " ");

        }
        System.out.println();
    }





    // insert
    // delete max
    public void insert(Key key) {
        pq[++size] = key;
        // append to tail
        // size++
        // swim up
        swimUp(size);
    }

    // return size before exchange
    public void exchangeMaxWithLast() {
        if (size == 0) {
            return;
        }

        Key max = pq[1];
        // set max = last size--
        pq[1] = pq[size--];
        // set last null
        pq[size + 1] = max;
        if (size > 1) {
            sink(1);
        }
        return;


    }


    public Key deleteMax() {
        // set first to last
        // set last null
        // sink down


        // delete max

        if (size == 0) {
            return null;
        }

        Key max = pq[1];
        // set max = last size--
        pq[1] = pq[size--];
        // set last null
        pq[size + 1] = null;
        if (size > 1) {
            sink(1);

        }
        return max;

    }


    // swimUp
    // sinkDown

    public void swimUp(int position) {
        if (position <= 1) {
            return;
        }
        // for each node is larger than its parent
        // exchange with its parent
        // next its parent
        for (int p = position; p > 1 && SortUtil.less(pq[p / 2], pq[p]); p = p / 2) {
            // exchange with its parent
            SortUtil.exchange(pq, p, p / 2);
        }
    }

    public void sink(int p) {
        while (2 * p <= size) {
            // get next sink position and exchange
            int left = 2 * p;
            int right = 2 * p + 1;
            int ep = left;
            if (right <= size && SortUtil.less(pq[left], pq[right])) {
                ep = right;
            }
            if (SortUtil.less(pq[p], pq[ep])) {
                SortUtil.exchange(pq, p, ep);
                p = ep;

            } else {
                break;
            }
        }
    }


    // get size
    // is empty

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }












}
