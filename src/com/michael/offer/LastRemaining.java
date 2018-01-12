package com.michael.offer;

public class LastRemaining {
    public static void main(String[] args) {
        // 0 1 2 3 4
        // 3
        // n = 5, m = 3, remaining = 3

        final int n = 5;
        final int m = 3;
        int lastRemaining = getLastRemaining(n, m);
        System.out.println(lastRemaining);
    }

    private static int getLastRemaining(int n, int m) {
        if (n < 1) return -1;
        if (m < 1) return -1;

        if (n == 1) return 0;

        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }


}
