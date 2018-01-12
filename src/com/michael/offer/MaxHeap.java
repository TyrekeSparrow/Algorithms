package com.michael.offer;

public class MaxHeap<Key extends Comparable<Key>> {

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 6, 2, 7, 3, 8};

        MaxHeap<Integer> heap = new MaxHeap<Integer>(array.length);
        for (int i : array) {
//            System.out.println("i = " + i);
            heap.insert(i);
        }

        Object max;
        while ((max = heap.delMax()) != null) {
            int i = (int) max;
            System.out.println(i);
        }







    }

    private Key[] pq;

    private int size;

    public MaxHeap(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1];
    }

    public boolean isFull() {
        if (size == pq.length - 1) {
            return true;
        }

        return false;
    }

//    public boolean isEmpty() {
//        return size == 0;
//    }

    public void delAllMax() {
        Object max;
        while ((max = delMax()) != null) {
            int i = (int) max;
            System.out.println(i);
        }
    }

    public int capacity() {
        return pq.length - 1;
    }

    public void insert(Key key) {
        pq[++size] = key;
        swim(size);

//        for (Key k : pq) {
//            System.out.println(k);
//        }
//        System.out.println();
    }

    public Key getMax() {
        if (size > 0) {
            return pq[1];
        }
        return null;
    }

    public Key delMax() {
        if (pq != null && pq.length > 1 && size > 0) {

            Key max = pq[1];
//            System.out.println("max = " + max);


            if (size > 1) {
//                System.out.println("pq[size] = " + pq[size]);
                pq[1] = pq[size];
                size--;
                pq[size + 1] = null;
                sink(1);
            } else {
                pq[size--] = null;
            }


            return max;


        }
        return null;
    }

    public void swim(int i) {
        if (i > 1) {
            if (less(i / 2, i)) {
                exchange(i, i / 2);
                swim(i / 2);
            }
        }
    }

    public void sink(int i) {
        if (i >= 1 && i <= size / 2) {
            // get max index
            int maxIndex = i * 2;
            if (maxIndex + 1 <= size) {
                if (less(maxIndex, maxIndex + 1)) {
                    maxIndex = maxIndex + 1;
                }
            }

            if (less(i, maxIndex)) {
                exchange(i, maxIndex);
                sink(maxIndex);
            }
        }
    }

    public boolean less(int i, int j) {
        if (pq[i].compareTo(pq[j]) < 0) {
            return true;
        }
        return false;
    }

    public void exchange(int i , int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }






}
