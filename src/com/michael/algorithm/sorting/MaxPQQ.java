package com.michael.algorithm.sorting;

import java.util.ArrayList;

/**
 * Created by michael on 17-9-29.
 */
public class MaxPQQ<Key extends Comparable<Key>> {
//    private static final String[] INSERT = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
    private static final String TEXT = "SORTEXAMPLE";

    public static void main(String[] args) {

        // build MAX PQ
        // null no max
        int length = TEXT.length();
        MaxPQQ<Character> maxPQQ = new MaxPQQ<Character>(length);
        for (int i = 0; i < length; i++) {
            char c = TEXT.charAt(i);
//            System.out.println("insert char = " + c);
            maxPQQ.insert(c);
        }

        ArrayList<Character> characters = new ArrayList<Character>(length);

        Character maxChar;
        while ((maxChar = maxPQQ.deleteMax()) != null) {
            System.out.printf(" " + maxChar);
            characters.add(maxChar);
        }

//        maxChar = maxPQQ.deleteMax();
//        System.out.println("maxChar = " + maxChar);


        int size = characters.size();
//        System.out.println("size = " + size);

        for (int i = characters.size() - 1; i >= 0; i--) {
            System.out.printf(" " + characters.get(i));
        }
    }

    private Key[] pq;
    private int N = 0;

    public MaxPQQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public void insert(Key key) {
        pq[++N] = key;
        swim(N);
    }

    public Key deleteMax() {
        if (N == 0) return null;
        if (N == 1) {
            Key max = pq[1];
            pq[1] = null;
            N = 0;
            return max;
        }

        // N > 1
        Key max = pq[1];
        pq[1] = pq[N--];
        sink(1);
        return max;
    }

    public boolean less(int i, int j) {
        Key ki = pq[i];
        Key kj = pq[j];
        int result = ki.compareTo(kj);
        if (result < 0) {return true;}
        return false;
    }

    public void exchange(int i, int j) {
        Key temp = pq[j];
        pq[j] = pq[i];
        pq[i] = temp;
    }

    public void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exchange(k/2, k);
            k = k/2;
        }
    }

    public void sink(int k) {
        while (2 * k <= N) {
            int maxIndex = k;
            if (less(k, 2 * k)) {
                maxIndex = 2 * k;
            }
            if (2 * k + 1 <= N && less(maxIndex, 2 * k + 1)) {
                maxIndex = 2 * k + 1;
            }
            if (maxIndex != k) {
                exchange(k, maxIndex);
                k = maxIndex;
            } else {
                break;
            }
        }
    }








}
