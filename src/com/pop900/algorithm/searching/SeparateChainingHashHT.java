package com.pop900.algorithm.searching;

/**
 * Created by michael on 16-8-11.
 */
public class SeparateChainingHashHT<Key, Value> {
    private static final String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};


    // test
    public static void main(String[] args) {
        // for each put
        // show all
        final SeparateChainingHashHT<String, Integer> ht = new SeparateChainingHashHT<String, Integer>();
        final int N = VALUES.length;
        for (int i = 0; i < N; i++) {
            final String key = VALUES[i];
            final int val = i;
            ht.put(key, val);
        }

        ht.showAll();





    }











    // size
    // hash table size
    // ST array

    private static final int DEFAULT_TABLE_SIZE = 997;
    private int N;
    private int M;
    private SequentialSearchST<Key, Value>[] st;


    // construct with table size
    // hash
    // put
    // get
    // showAll
    public SeparateChainingHashHT() {
        this(DEFAULT_TABLE_SIZE);
    }

    public SeparateChainingHashHT(int M) {
        this.M = M;
        st = (SequentialSearchST<Key, Value>[])new SequentialSearchST[M];
        for (int i = 0; i < M; i++) {
            st[i] = new SequentialSearchST<Key, Value>();
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void put(Key key, Value value) {
        final int hash = hash(key);
        System.out.println(key + " " + hash);
        st[hash].put(key, value);
    }

    public Value get(Key key) {
        return st[hash(key)].get(key);
    }

    public void showAll() {
        final int N = st.length;
        for (int i = 0; i < N; i++) {
            SequentialSearchST<Key, Value> s = st[i];

            if (s.first != null) {
                s.showAll();
            };





            
        }



    }


























}
