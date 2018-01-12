package com.pop900.algorithm;

/**
 * Created by michael on 16-11-9.
 */
public class GetMin {
    private static int[] a1 = {1, 3, 7};
    private static int[] a2 = {2, 6, 9};

    public static void main(String[] args) {
        int p = 0;
        int q = 0;

        final int l3 = a1.length + a2.length;
        final int[] a3 = new int[l3];

        for (int i = 0; i < a3.length; i++) {
            // 1 get min
//            final int m3 =
            System.out.println("p = " + p);
            System.out.println("q = " + q);
            System.out.println();


            int m1 = Integer.MAX_VALUE;
            int m2 = Integer.MAX_VALUE;
            if (p < a1.length) {
                m1 = a1[p];
            }
            if (q < a2.length) {
                m2 = a2[q];
            }
            
            int m3 = Math.min(m1, m2);
            if (m1 < m2) {
                p++;
            } else if (m2 < m1) {
                q++;
            } else {
                // m1 == m2
                // do nothing
            }

            a3[i] = m3;
        }


        for (int j = 0; j < l3; j++) {
            System.out.printf(" " + a3[j]);


        }







    }


}
