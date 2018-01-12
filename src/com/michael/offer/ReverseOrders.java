package com.michael.offer;

public class ReverseOrders {
    public static void main(String[] args) {
        // 7564
//        int[] array = {7, 5, 6, 4, 8, 9, 10, 11};
//        int[] array = {7, 5, 6, 4, 8, 9, 10};
        int[] array = {7, 5, 6, 4, 8};
        int count = countInverseOrders(array);
        System.out.println("count: " + count);
    }

    private static int countInverseOrders(int[] array) {
        int[] another = new int[array.length];
        int count = 0;

        for (int i = 1; Math.pow(2, i) <= array.length; i++) {
            final int step = (int) Math.pow(2, i);
            for (int j = 0; j < array.length; j+=step) {
                int end = j + step - 1;
                end = Math.min(end, array.length - 1);
//                System.out.println(step);
//                System.out.printf("begin = " + j);
//                System.out.printf(" end = " + end);
//                System.out.println();
//                System.out.println("before sort");
                int number = sort(array, j, end, step/2, another);
//                System.out.println(number);
                System.out.println();
                count += number;
            }
        }

        return count;
    }

    private static int sort(int[] array, int begin, int end, int step, int[] another) {
        if (begin == end) return 0;

        for (int i = begin; i <= end; i++) {
            another[i] = array[i];
        }

        int count = 0;

        int begin1 = begin;
        int end1 = begin1 + step - 1;
        int begin2 = begin1 + step;
        int end2 = end;

        for (int i = end; i >= begin; i--) {
            if (end1 < begin1 && end2 < begin2) {
                break;
            }

            if (end1 >= begin1 && end2 >= begin2) {
                if (another[end1] > another[end2]) {
                    array[i] = another[end1--];
                    int number = end2 - begin2 + 1;
                    for (int j = end2; j >= begin2; j--) {
                        System.out.println(array[i] + " " + another[j]);
                    }
                    count += number;
                } else {
                    array[i] = another[end2--];
                }
            } else if (end1 >= begin1 && end2 < begin2) {
                array[i] = another[end1--];
            } else if (end2 >= begin2 && end1 < begin1) {
                array[i] = another[end2--];
            // end1 < begin1 && end2 < begin2
            } else {
                // has been break
            }
        }

        return count;
    }


}
