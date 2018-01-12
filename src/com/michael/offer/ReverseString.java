package com.michael.offer;

public class ReverseString {
    public static void main(String[] args) {
        final String s = "I am a student.";
        String inverseStr = reverseString(s);
        System.out.println(inverseStr);
    }

    private static final char BLANK = ' ';
    private static String reverseString(String s) {
        if (s == null) return null;
        if (s.length() == 0 || s.length() == 1) return s;

        char[] array = s.toCharArray();
        reverseCharArray(array, 0, array.length - 1);
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != BLANK) {
                continue;
            } else {
                endIndex = i - 1;

                reverseCharArray(array, beginIndex, endIndex);
                beginIndex = i + 1;
            }
        }

        String inverseStr = String.valueOf(array);
        return inverseStr;
    }

    private static void reverseCharArray(char[] array, int beginIndex, int endIndex) {
        if (array == null || array.length <= 1) return;
        if (beginIndex < 0 || beginIndex >= array.length) return;
        if (endIndex < 0 || endIndex >= array.length) return;
        if (beginIndex >= endIndex) return;

        char temp;

        while (beginIndex < endIndex) {
            temp = array[beginIndex];
            array[beginIndex] = array[endIndex];
            array[endIndex] = temp;

            beginIndex++;
            endIndex--;
        }
    }


}
