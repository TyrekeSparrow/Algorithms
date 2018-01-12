package com.pop900.algorithm.strings;

/**
 * Created by michael on 17-9-29.
 */
public class KMPPP {
    public static void main(String[] args) {

        final String pattern = "ABABAC";
        final String text = "BCABABABXYZBAABACAABABACAA";

        KMPPP kmppp = new KMPPP(pattern);
        int result  = kmppp.search(text);
        System.out.println("result  = " + result);









    }

    private static final int R = 256;
    private String pattern;
    private int[][] dfa;

    public KMPPP(String pattern) {
        // get dfa
        // ABABAC

        this.pattern = pattern;
        int M = pattern.length();
        dfa = new int[R][M];


        /*
        dfa[][j] = dfa[][X];
        dfa[pattern.charAt(j)][j] = j + 1;
        X = dfa[pattern.charAt(j)][X];
        */

        dfa[pattern.charAt(0)][0] = 1;
        for (int X = 0, j = 1; X < M && j < M; j++) {
            for (int i = 0; i < R; i++) {
                dfa[i][j] = dfa[i][X];
            }
            dfa[pattern.charAt(j)][j] = j + 1;
            X = dfa[pattern.charAt(j)][X];
        }
    }

    public int search(String text) {
        int M = pattern.length();
        int N = text.length();
        int i = 0;
        int j = 0;
        for (; i < N && j < M; i++) {
            // dfa
            j = dfa[text.charAt(i)][j];
        }
        if (j == M) {
            return i - M;
        } else {
            return -1;
        }
    }


}
