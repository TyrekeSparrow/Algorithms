package com.michael.offer;

public class MaxMargin {
    public static void main(String[] args) {
        final int[] prices = {9, 11, 8, 5, 7, 12, 16, 14};
        final int maxMargin = getMaxMargin(prices);
        System.out.println(maxMargin);
    }

    private static int getMaxMargin(int[] prices) {
//        int maxMargin = 0;
        int minPrice = prices[0];
        int maxPrice = prices[0];

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            if (price > minPrice) {
                int margin = price - minPrice;
//                if (margin > maxMargin) {
//                    maxMargin = margin;
//                }

                if (price > maxPrice) {
                    maxPrice = price;
                }
            }
        }

        System.out.println(minPrice);
        System.out.println(maxPrice);
        int maxMargin = maxPrice - minPrice;
        return maxMargin;
    }
}
