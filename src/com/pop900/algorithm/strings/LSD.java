package com.pop900.algorithm.strings;

/**
 * Created by michael on 16-10-12.
 */
public class LSD {
    public static void main(String[] args) {
        String[] a = {
                "4PGC938",
                "2IYE230",
                "3CIO720",
                "1ICK750",
                "1OHV845",
                "4JZY524",
                "1ICK750",
                "3CIO720",
                "1OHV845",
                "1OHV845",
                "2RLA629",
                "2RLA629",
                "3ATW723",
        };

        // W = 7
        int W = a[0].length();
        System.out.println("N = " + a.length);
        // [0, R)
        int R = 'Z' + 1;
        System.out.println("R = " + R);
        sort(a, W, R);
        for (String s : a) {
            System.out.println("s = " + s);
        }

//        String s =  "3ATW723";
//        char cc = s.charAt(1);
//        System.out.println("cc = " + cc);








    }

    public static void sort(String[] a, int W, int R) {

        // aux
        String[] aux = new String[a.length];

        for (int d = W - 1; d >= 0; d--) {
            int[] count = new int[R + 1];

            // compute frequency count
//            System.out.println("compute frequency");
            for (int i = 0; i < a.length; i++) {
                System.out.println("a[" + i + "] = " + a[i]);
//                System.out.println("a[i].charAt(d) = " + a[i].charAt(d));
                int c = a[i].charAt(d);
                count[c + 1]++;
            }
            // transform counts to indices
//            System.out.println("transform to indices");
            for (int r = 0; r < R; r++) {https://zhuanlan.zhihu.com/p/23220764
                count[r + 1] += count[r];
            }
            // distribute data
//            System.out.println("distribute data");
            for (int i = 0; i < a.length; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }
            // copy back
            for (int i = 0; i < a.length; i++) {
                a[i] = aux[i];
            }
        }

    }


}
