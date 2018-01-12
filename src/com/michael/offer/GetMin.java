package com.michael.offer;

/**
 * Created by michael on 17-11-22.
 */
public class GetMin {
    public static void main(String[] args) {
        // input: {3, 4, 5, 1, 2}
        // output 1

        int[] input = {3, 4, 5, 1, 2};
        int min = getMin(input);
        System.out.println("min = " + min);

    }

    public static int getMin(int[] input) {
        System.out.println("getMin");
        // null
        if (input == null) return -1;
        // length == 0
        if (input.length == 0) return -1;
        // length == 1
        if (input.length == 1) return input[0];
        // length == 2
        if (input.length == 2) {
            if (input[0] <= input[1]) {
                return input[0];
            } else {
                return input[1];
            }
        }

        int iStart = 0;
        int iStop = input.length - 1;

        while (iStart + 1 < iStop) {
            int[] newIndices = getNewIndices(input, iStart, iStop);
            iStart = newIndices[0];
            iStop = newIndices[1];
        }

        System.out.println("iStart = " + iStart);
        System.out.println("iStop = " + iStop);

        return input[iStop];
    }

    private static int[] INDICES = new int[2];

    private static int[] getNewIndices(int[] input, int iStart, int iStop) {
        if (iStart + 1 == iStop) {
            INDICES[0] = iStart;
            INDICES[1] = iStop;
            return INDICES;
        }

        int iMiddle = (iStart + iStop) / 2;
        if (input[iStart] < input[iMiddle]) {
            INDICES[0] = iMiddle;
            INDICES[1] = iStop;
            return INDICES;
        } else if (input[iMiddle] < input[iStop]) {
            INDICES[0] = iStart;
            INDICES[1] = iMiddle;
            return INDICES;
        } else {
            return null;
        }
    }

}
