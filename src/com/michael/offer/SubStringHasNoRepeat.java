package com.michael.offer;

public class SubStringHasNoRepeat {
    public static void main(String[] args) {
        // arabcacfr
        // acfr

        String str = "arabcacfr";
        String longestSubString = getLongestSubString(str);
        System.out.println("longestSubString = " + longestSubString);
    }

    private static String getLongestSubString(String str) {
        int longestBegin = 0;
        int longestEnd = 0;

        char[] array = str.toCharArray();
        // arabcacfr
        // indexes['r'] = 1;
        // indexes['r'] = 8;
        int[] indexes = new int['z' - 'a' + 1];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = -1;
        }

        int currentBegin = 0;
        for (int index = 0; index < array.length; index++) {
//            System.out.printf(index + " ");
            // get current begin
            if (index == 0) {
                currentBegin = 0;
            } else {
//                System.out.printf(array[index] - 'a' + " ");
                int lastIndex = indexes[array[index] - 'a'];
                System.out.printf(lastIndex + " ");
                if (lastIndex != -1 && lastIndex >= currentBegin) {
                    currentBegin = lastIndex + 1;
                }
            }
            indexes[array[index] - 'a'] = index;
            System.out.printf("" + array[index] + " " + currentBegin + " " + index);

            // get current length
            // update longest indexes
            int currentLength = index - currentBegin + 1;
            System.out.printf(" " + currentLength);
            if (currentLength >= (longestEnd - longestBegin + 1)) {
                longestBegin = currentBegin;
                longestEnd = index;
            }
            System.out.printf(" ");
            for (int i = longestBegin; i <= longestEnd; i++) {
                System.out.printf("" + array[i]);
            }
            System.out.println();
        }

        String longestSubString = String.valueOf(array, longestBegin, longestEnd - longestBegin + 1);
        return longestSubString;
    }


}
