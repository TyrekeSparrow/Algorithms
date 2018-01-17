package com.michael.offer;

import com.michael.algorithm.fundamenal.Queue;

/**
 * Created by michael on 17-10-7.
 */
public class FragStep {
    /*
    length = n;
    step = 1/2;
    how to get n
    */

    public static void main(String[] args) {
//        int count = FragStep.getN(5);
//        System.out.println("count = " + count);

        int i  = 9;
        int j = i >> 1;
//        int j = i << 1;
        System.out.println("j = " + j);

    }

    private static final int[] steps = {1, 2};

    public static int getN(int n) {
        Queue<Integer> lengths = new Queue<Integer>();

        int count = 0;
        Integer l = 0;
        lengths.enqueue(l);
        while ((l = lengths.dequeue()) != null) {
            if (l == n) {
                count++;
                continue;
                // do not enqueue
            }

            if (l < n) {
                // enqueue
                for (int step : steps) {
                    int nextL = l + step;
                    if (nextL <= n) {
                        lengths.enqueue(nextL);
                    }
                }
            } else {
                // do nothing
            }
        }

        return count;

    }











}
