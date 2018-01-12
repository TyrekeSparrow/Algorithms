package com.michael.offer;

public class Int2Str {
    public static void main(String[] args) {
        // 12258
        // bccfi bwfi bczi mcfi mzi
        // [0, 25] [a, z]
        int i = 12258;
        printAllStr(i);
    }

    private static void printAllStr(int i) {
        String str = String.valueOf(i);
        char[] array = str.toCharArray();

        printTranslations(array, 0);
    }

    private static void printTranslations(char[] array, int beginIndex) {
//        System.out.println("beginIndex = " + beginIndex);
        if (beginIndex >= array.length) {
//            System.out.printf("ttttttttt ");
//            System.out.println(array);
            for (char c : array) {
                if (c != '0') {
                    System.out.printf(c + "");
                }
            }
            System.out.println();
            return;
        }

        // [0, 2] [3, 9]
        // [0, 2]
        String str1 = translation(array, beginIndex, false);
        printTranslations(array, beginIndex + 1);
        recovery(array, beginIndex, false, str1);

        if (toInt(array[beginIndex]) >= 0 && toInt(array[beginIndex]) <= 2) {
            String str2 = translation(array, beginIndex, true);
            printTranslations(array, beginIndex + 2);
            recovery(array, beginIndex, true, str2);

        } else {
        }



    }

    private static int toInt(char c) {
        int i = Integer.valueOf("" + c);
        return i;
    }


    // beginIndex str
    // d[378] 3[378]
    // z0[378] 25[378]
    private static void recovery(char[] array, int beginIndex, boolean hasNext, String str) {
        char[] chars = str.toCharArray();

        array[beginIndex] = chars[0];
        if (hasNext) {
            array[beginIndex + 1] = chars[1];
        }
    }

    private static String translation(char[] array, int index, boolean hasNext) {

        String str = "";
        str = str + array[index];
        if (hasNext) {
            str = str + array[index + 1];
        }
        int n = Integer.valueOf(str);
        char c = (char) ('a' + n);

        array[index] = c;
        if (hasNext) {
            array[index + 1] = '0';
        }

        return str;
    }

    /*
    private static char translation(int n) {
        // 0 a
        char c = (char) ('a' + n);
        return c;
    }
    */

}
