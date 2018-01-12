package com.michael.offer;

import java.util.ArrayList;

public class UglyNumber {
    public static void main(String[] args) {
        // 1: 1, 1500?
        int n = 1500;
//        int n = 15;

        int uglyNumber = getUglyNumber(n);
        System.out.println("uglyNumber = " + uglyNumber);

//        Solution solution = new Solution();
//        int number = solution.GetUglyNumber_Solution(n);
//        System.out.println("number = " + number);



    }


    private static final int UGLY1 = 1;

    private static int getUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int baseIndex2 = 0;
        int baseIndex3 = 0;
        int baseIndex5 = 0;

        for (int uglyIndex = 1; uglyIndex < n; uglyIndex++) {
            int ugly2 = uglyNumbers[baseIndex2] * 2;
            int ugly3 = uglyNumbers[baseIndex3] * 3;
            int ugly5 = uglyNumbers[baseIndex5] * 5;
            int min = min(ugly2, ugly3, ugly5);
            System.out.printf(ugly2 + " ");
            System.out.printf(ugly3 + " ");
            System.out.printf(ugly5 + " ");
            System.out.println(min);
            System.out.println("------------------------");
            uglyNumbers[uglyIndex] = min;

            if (min == ugly2) {
                baseIndex2++;
            }
            if (min == ugly3) {
                baseIndex3++;
            }
            if (min == ugly5) {
                baseIndex5++;
            }
        }

        return uglyNumbers[uglyNumbers.length - 1];
    }

    private static int min(int ugly2, int ugly3, int ugly5) {
        int min23 = (ugly2 < ugly3 ? ugly2 : ugly3);
        int min235 = (min23 < ugly5 ? min23 : ugly5);
        return min235;
    }

}

class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }
        ArrayList<Integer> uglys = new ArrayList<>();
        uglys.add(1);
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < index; i++) {
            int num2 = uglys.get(index2) * 2;
            int num3 = uglys.get(index3) * 3;
            int num5 = uglys.get(index5) * 5;
            int min = Math.min(num2, Math.min(num3, num5));
            System.out.printf(num2 + " ");
            System.out.printf(num3 + " ");
            System.out.printf(num5 + " ");
            System.out.println(min);
            System.out.println("------------------------");
            uglys.add(min);
            // 当为6时，index2与index3都要变化
            if (min == num2) {
                index2++;
            }
            if (min == num3) {
                index3++;
            }
            if (min == num5) {
                index5++;
            }
        }
        return uglys.get(index - 1);
    }
}

