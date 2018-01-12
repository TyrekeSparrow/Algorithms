package com.michael.offer;

public class NumbersWithSum {
    public static void main(String[] args) {
        // sum = 15
        final int[] array = {1, 2, 4, 7, 11, 15};
        final int sum = 15;
        int[] numbers = getNumbers(array, sum);
        for (int number : numbers) {
            System.out.printf(" " + number);
        }
    }

    private static int[] getNumbers(int[] array, int sum) {
        if (array == null) return null;
        if (array.length == 0) return null;

        final int[] numbers = new int[2];

        int beginIndex = 0;
        int endIndex = array.length - 1;

        while (array[beginIndex] + array[endIndex] != sum) {
            if (array[beginIndex] + array[endIndex] > sum) {
                endIndex--;
            } else if (array[beginIndex] + array[endIndex] < sum) {
                beginIndex++;
            } else {
                // no else
            }
        }

        if (array[beginIndex] + array[endIndex] == sum) {
            numbers[0] = array[beginIndex];
            numbers[1] = array[endIndex];
            return numbers;
        } else {
            return null;
        }
    }
}
