package com.pop900.algorithm.strings;

/**
 * Created by michael on 17-8-23.
 */
public class BoyerMoore {
    public static void main(String[] args) {
        final String pat = "NEEDLE";
        final String txt = "FINDINAHAYSTACKNEEDLEINA";

        BoyerMoore boyerMoore = new BoyerMoore(pat);
        int index = boyerMoore.search(txt);
        System.out.println("index = " + index);


    }

    private final String pat;
    private final int[] right;

    public BoyerMoore(String pat) {
        this.pat = pat;
        int R = 256;
        int M = pat.length();

        right = new int[R];

        // init right
        for (int c = 0; c < R; c++) {
            right[c] = -1;
        }
        // rightmost position in pattern
        for (int j = 0; j < M; j++) {
            right[pat.charAt(j)] = j;
        }
    }

    public int search(String txt) {
        int N = txt.length();
        int M = pat.length();

        int skip = 0;
        for (int i = 0; i <= N - M; i = i + skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = j - right[txt.charAt(i + j)];
                    if (skip < 1) skip = 1;
                    break;
                }
            }
            if (skip == 0) return i;

        }

        return -1;
    }


}
