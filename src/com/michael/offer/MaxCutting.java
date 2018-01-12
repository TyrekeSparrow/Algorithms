package com.michael.offer;

/**
 * Created by michael on 17-11-22.
 */
public class MaxCutting {
    public static void main(String[] args) {
        // 8, 2 3 3, 18
        double result = getMaxCutting(8);
        System.out.println("result = " + result);
    }

    public static double getMaxCutting(int length) {
        // length > 1
        // cutting > 1
        if (length == 2) return 1;
        if (length == 3) return 2;
        if (length == 4) return 4;

        // length >= 5
        int count = length / 3;
        int append = length % 3;

        double result = Math.pow(3, count) * append;
        return result;
    }
}
