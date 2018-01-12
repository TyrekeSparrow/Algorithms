package com.michael.offer;

/**
 * Created by michael on 17-11-22.
 */
public class PrintMaxNDigits {
    public static void main(String[] args) {
        // 3 [1, 999]

        int n = 3;
        printMaxNDigits(n);
    }

    private static int[] numbers;
    public static void printMaxNDigits(int n) {
        if (n < 1) return;

        numbers = new int[n];
        printNDigits(0);
    }



    public static void printNDigits(int index) {
        for (int i = 0; i < 10; i++) {
            numbers[index] = i;
            if (index == numbers.length - 1) {
                printNumber();
            } else {
                printNDigits(index + 1);
            }
        }

    }

    private static void printNumber() {
        boolean start0 = true;
        for (int i = 0 ; i < numbers.length; i++) {
            int value = numbers[i];
            if (value != 0) {
                start0 = false;
                System.out.printf(value + "");
            } else if (!start0) {
                System.out.printf(value + "");
            } else {
                // value == 0 && start0
                // do not print
            }
        }
        System.out.println();
    }


}
