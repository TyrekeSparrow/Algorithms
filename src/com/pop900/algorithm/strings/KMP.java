package com.pop900.algorithm.strings;

/**
 * Created by michael on 17-8-22.
 */
public class KMP {
    public static void main(String[] args) {
        final String pattern = "ABABAC";
        final String text = "BCBAABACAABABACAA";

//        int i = 'A';
//        int j = 'C';
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
        final KMP kmp = new KMP(pattern);
        int match = kmp.search(text);
        System.out.println("match = " + match);



    }

    // -----------------------------------------------------------------------------------------------------------------

    private String pat;
    private int[][]dfa;


    public KMP(String pat) {
        this.pat = pat;

        // Compute dfa
        int M = pat.length();
        int R = 'C' - 'A' + 1;
        dfa = new int[R][M];
        dfa[pat.charAt(0) - 'A'][0] = 1;
        for (int X = 0, j = 1; j < M; j++) {
            // Copy mismatch cases
            for (int c = 'A'; c <= 'C'; c++) {
                dfa[c- 'A'][j] = dfa[c - 'A'][X];
            }
            // Set match case
            dfa[pat.charAt(j) - 'A'][j] = j + 1;
            // Update restart state
            X = dfa[pat.charAt(j) - 'A'][X];
        }
    }

    public int search(String txt) {
        int i = 0;
        int j = 0;
        int M = pat.length();
        int N = txt.length();

        for (; i < N && j < M; i++) {
            j = dfa[txt.charAt(i) - 'A'][j];
        }

        if (j == M) return i - M;
//        else return N;
        else return -1;
    }







}
