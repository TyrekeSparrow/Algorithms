package com.michael.offer;

public class NumberAtIndex {
    public static void main(String[] args) {
        // 1001 370 7

        int index = 1001;
        int number = getNumber(1001);
        System.out.println("number = " + number);




    }

    private static int getNumber(int n) {
        if (n < 0) return -1;

        // [0, 9], [10 ,99], [100, 999], [1000, 9999]
        if (n <= 9) return n;






        // 1001 - 10 = 991
        final int count1 = 10;
        n = n - count1;

        // 991 - 180 = 211
        int length = 2;
        while (n >= getCountLength(length)) {
            int count = getCountLength(length);
            System.out.println("count = " + count);
            if (n > count) {
                n = n - count;
                System.out.println("n = " + n);
            }
            length++;
        }
        // length = 3;
        System.out.println("length = " + length);

        // 811 - 300 - 300 = 211
        int i = 1;
        while (i <= 9) {
            int count = (int) (length * Math.pow(10, length - 1));
            if (n >= count) {
                n = n - count;
                System.out.println("n = " + n);
            } else {
                break;
            }
            i++;
        }
        // i = 3
        System.out.println("i = " + i);

        // n = 211
        // length = 3;
        // q = 70
        // r = 1
        int q = n / length;
        int r = n % length;
        System.out.println("q = " + q);
        System.out.println("r = " + r);

        // 10 * 10 * 3 + 70
        int value = (int) (Math.pow(10, length - 1) * i + q);
        char[] array = String.valueOf(value).toCharArray();


        if (array != null && array.length > 0) {
            char c = array[r];
            int number = Integer.parseInt(c + "");
            return number;
        }

        return -1;
    }

    private static int getCountLength(int length) {
        int countLength = (int) (length * Math.pow(10, length - 1) * 9);
        return countLength;
    }




}
