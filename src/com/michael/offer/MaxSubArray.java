package com.michael.offer;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};

        int maxValue = getMaxSubArrayValue(array);
        System.out.println("maxValue = " + maxValue);



    }

    public static int getMaxSubArrayValue(int[] array) {
        int maxArrayValue = 0;
        int arrayValue = 0;
        int beginIndex = 0;
        int endIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (arrayValue + array[i] >= 0) {
                arrayValue = arrayValue + array[i];
                endIndex = i;
                if (arrayValue > maxArrayValue) {
                    maxArrayValue = arrayValue;
                    maxIndex = endIndex;
                }
            } else {
                arrayValue = 0;
                maxArrayValue = 0;
                beginIndex = i + 1;
                endIndex = i + 1;
                maxIndex = 0;
            }
        }

        System.out.println("beginIndex = " + beginIndex);
        System.out.println("maxIndex = " + maxIndex);
        if (maxArrayValue > 0 && beginIndex < array.length && maxIndex < array.length && beginIndex <= maxIndex) {
            return maxArrayValue;
        }



        return 0;
    }



}
