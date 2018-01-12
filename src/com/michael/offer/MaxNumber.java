package com.michael.offer;

public class MaxNumber {
    public static void main(String[] args) {
        // {3, 32, 321}
        // 321323

        int[] array = {3, 32, 321};
        int number = getMinNumber(array);
        System.out.println("number = " + number);
    }

    private static int getMinNumber(int[] array) {
        String min = "";

        for (int i : array) {
            min = getMinPermutation(min, i + "");
        }

        int number = Integer.valueOf(min);
        return number;
    }

    private static String getMinPermutation(String one, String another) {
        if (one == null) return null;
        if (another == null) return null;
        if (one.length() == 0) return another;
        if (another.length() == 0) return one;

        String onePermutation = one + another;
        String anotherPermutation = another + one;

        String minPermutation = min(onePermutation, anotherPermutation);
        return minPermutation;
    }

    private static String min(String one, String another) {
        if (one.equals(another)) return one;

        char[] arrayOne = one.toCharArray();
        char[] arrayAnother = another.toCharArray();

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] < arrayAnother[i]) {
                return one;
            } else if (arrayOne[i] > arrayAnother[i]) {
                return another;
            } else {
                continue;
            }
        }
        return one;
    }


}
