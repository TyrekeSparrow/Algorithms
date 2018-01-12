package com.pop900.algorithm.strings;

/**
 * Created by michael on 17-8-22.
 */
public class KMPP {
    public static void main(String[] args) {
        final String pattern = "ABABAC";
        final String text = "BCBAABACAABABACAA";

//        int iA = 'A';
//        int iC = 'C';
//        System.out.println("A = " + iA);
//        System.out.println("C = " + iC);

        final KMPP kmpp = new KMPP(pattern, 'A', 'C');
        int index = kmpp.search(text);

        System.out.println("match index = " + index);



    }





    // --------------------------------------------------------------------------------------

    private final String pat;
    private final int[][] dfa;

    public KMPP(String pat, int startChar, int endChar) {
        this.pat = pat;
        final int M = pat.length();
        final int R = endChar + 1;
//        System.out.println("M = " + M);
//        System.out.println("R = " + R);

        dfa = new int[R][M];
        // Compute dfa
        dfa[pat.charAt(0)][0] = 1;
        for (int X = 0, j = 1; j < M; j++) {
            // Copy mismatch cases.
            for (int c = startChar; c < R; c++) {
//                System.out.println("c = " + c);
//                System.out.println("j = " + j);
                dfa[c][j] = dfa[c][X];
            }
            // Set match case.
            dfa[pat.charAt(j)][j] = j + 1;
            // Update restart state;
            X = dfa[pat.charAt(j)][X];
        }
    }

    public int search(String txt) {
        int i = 0;
        int j = 0;

        final int M = pat.length();
        final int N =txt.length();

        for (; i < N && j < M; i++) {
            j = dfa[txt.charAt(i)][j];
        }

        if (j == M) return i - M;
        else return -1;
    }



}
