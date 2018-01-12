package com.michael.offer;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxInWindows {
    public static void main(String[] args) {
        final int[] array = {2, 3, 4, 2, 6, 2, 5, 1};
        final int length = 3;
        LinkedList<Integer> maxList = getMaxNumbers(array, length);
        for (int number : maxList) {
            System.out.printf(" " + number);
        }
    }

    private static LinkedList<Integer> getMaxNumbers(int[] array, int length) {
        LinkedList<Integer> maxList = new LinkedList<Integer>();
        Deque<Integer> maxIndexes = new LinkedList<Integer>();

        int l = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxIndexes.size() != 0) {
                int maxIndex = maxIndexes.getFirst();
                if (i - maxIndex >= length) {
                    maxIndexes.poll();
                    if (maxIndexes.size() > 0) {
                        maxIndex = maxIndexes.getFirst();
                    }
                }

                if (array[i] >= array[maxIndex]) {
                    while (maxIndexes.size() > 0 && maxIndexes.getFirst() != null) {
                        maxIndexes.poll();
                    }
                }

                if (maxIndexes.size() > 0 && array[i] >= array[maxIndexes.getLast()]) {
                    maxIndexes.removeLast();
                }

            }
            maxIndexes.add(i);

            if (l < 3) {
                l++;
            }

            if (l == 3) {
                l--;
                // get max
                if (maxIndexes.size() > 0) {
                    maxList.add(array[maxIndexes.getFirst()]);
                }
            } else {
                // no else
            }

        }
        return maxList;
    }
}
