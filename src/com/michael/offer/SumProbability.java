package com.michael.offer;

public class SumProbability {
    public static void main(String[] args) {
        // 1 2 3 4 5 6
        // n

        int n = 3;
        printProbability(n);
    }

    private static void printProbability(int n) {
        if (n == 0) return;

        int[] numbers = new int[n];
        printNumbers(numbers, 0);
    }

    private static void printNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            printAllNumber(numbers);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            numbers[index] = i;
            printNumbers(numbers, index + 1);
            numbers[index] = 0;
        }
    }

    private static void printAllNumber(int[] numbers) {
        for (int number : numbers) {
            System.out.printf(" " + number);
        }
        System.out.println();
    }


}
