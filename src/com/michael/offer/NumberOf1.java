package com.michael.offer;

/**
 * Created by michael on 17-11-22.
 */
public class NumberOf1 {
    public static void main(String[] args) {
        // 9 1001 2
//        int i = 9;

        // 13 1101 3
//        int i  = 13;
        // 12 1100 2
        int i  = 12;

//        int count = count1(9);
//        System.out.println("count = " + count);

        int countAnother = count1Another(i);
        System.out.println("countAnother = " + countAnother);



    }

    public static int count1Another(int input) {
        // 1101 - 1 = 1100, 1101 & 1100 = 1100
        // 1100 - 1 = 1011, 1100 & 1011 = 1000

        int count = 0;
        while (input != 0) {
            count++;
            input = input & input - 1;
        }

        return count;
    }

    public static int count1(int input) {
        int count = 0;
        while (input != 0) {
            // 1001 & 1
            int result = input & 1;
            if (result == 1) {
                count++;
            } else {
                // do nothing
            }

            input = input >> 1;
        }

        return count;
    }
}
