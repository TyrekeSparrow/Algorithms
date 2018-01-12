package com.pop900.algorithm.searching;

import com.pop900.algorithm.fundamenal.BinarySearch;

/**
 * Created by michael on 16-8-10.
 */
public class BinarySearchST<Key extends  Comparable<Key>, Value> {
    private static final String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {
        // instantiate
        // put all values
        // show all
        // rank P
        // rank Q


        final int N = VALUES.length;
        final BinarySearchST<String, Integer> st = new BinarySearchST<String, Integer>(N);
        for (int i = 0; i < N; i++) {
            final String key = VALUES[i];
            final int value = i;
            System.out.printf(key + " " + value + " ");
            st.put(key, value);
        }


        st.showAll();

        final int rankP = st.rank("P");
        System.out.println("rankP = " + rankP);
        final int rankQ = st.rank("Q");
        System.out.println("rankQ = " + rankQ);















    }

    // keys
    // values
    // size

    // construct
    // put
    // get
    // rank
    // getSize


    private Key[] keys;
    private Value[] vals;
    private int N;

    public BinarySearchST(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        vals= (Value[]) new Comparable[capacity];
    }

    public void put(Key key, Value value) {
        // if key is found, update value
        // else grow table
        // add key, add value
        // size++
        final int i = rank(key);
        System.out.println(i + " ");
        if (i < N && keys[i].compareTo(key) == 0) {
            vals[i] = value;
            return;
        }
        for (int j  = N; j > i; j--) {
            keys[j] = keys[j - 1];
            vals[j] = vals[j - 1];
        }
        keys[i] = key;
        vals[i] = value;
        N++;
    }

    public Value get(Key key) {
        // get rank
        // if found return value
        // else return null

        if (N == 0) return null;

        final int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return vals[i];
        else return null;




    }

    public int rank(Key key) {
        // binary search
        // left right mid
        int lo = 0;
        int hi = N - 1;
        while (lo <= hi) {
            // get mid
            // compare mid
            final int mid = lo + (hi - lo) / 2;
            final int cmp = key.compareTo(keys[mid]);
            if (cmp < 0 ) {
                hi = mid - 1;
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
//            System.out.printf(lo + " " + hi + " " + mid);
        }
        return lo;
    }

    public int size() {
        return N;
    }

    public void showAll() {
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.printf(keys[i] + " ");

        }

        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.printf(vals[i] + " ");

        }


    }







}
