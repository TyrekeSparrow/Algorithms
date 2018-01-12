package com.michael.offer;

/**
 * Created by michael on 17-10-8.
 */
public class StringInteger {
    public static void main(String[] args) {
//        n  = 3
//        0 1 2 3 .... 999

        printAll(3);






    }

    public static void printAll(int n) {
        // get string max
        String maxString = "";
        for (int i = 0; i < n; i++) {
            maxString = maxString + "9";
        }
        System.out.println("max = " + maxString);

        // print all string number
        // 1
        // 2
        // 3

        // print 1

//        n [0, 9]

        for (int i = 0; i < n; i++) {


            printALLNumbers(i);

            
        }











    }

    private static void printALLNumbers(int n) {
//        [0, 9][0, 9]


        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < 10; j++) {
                System.out.printf("" + j);

            }
        }






    }




    private static void stringIncrease(StringBuffer buffer, int index) {
        int l = buffer.length();

        if (l == 0 ) {
            buffer.append("1");
            return;
        }

        char c = buffer.charAt(index);
        int ic = Integer.parseInt(c + "");
        if (ic < 9) {
            char newc = ((ic + 1) + "").charAt(0);
            buffer.setCharAt(index, newc);
        } else if (ic >= 9) {


        } else {
            // do nothing
        }














    }



}
