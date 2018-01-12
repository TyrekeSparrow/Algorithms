package com.michael.offer;

public class SomeMinimums {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 6, 2, 7, 3, 8};
        // 4 min

        int count = 4;

        MaxHeap<Integer> heap = new MaxHeap<Integer>(count);

        for (int i = 0; i < array.length; i++) {
            if (!heap.isFull()) {
                System.out.println("insert " + array[i]);
                heap.insert(array[i]);
            } else {
                if (array[i] < heap.getMax()) {
                    heap.delMax();
                    heap.insert(array[i]);
                }
            }
        }

        heap.delAllMax();








    }










}
