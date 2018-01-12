package com.michael.offer;

import com.pop900.algorithm.fundamenal.Queue;

public class Combination {
    public static void main(String[] args) {
        String s = "abc";
        char[] array = s.toCharArray();

        printAllCombinations(array);



    }

    private static void printAllCombinations(char[] array) {
        char arrayLastChar = array[array.length - 1];

        Queue<char[]> queue = new Queue<>();
        for (char c : array) {
            char[] combinationArray = {c};
            queue.enqueue(combinationArray);
        }
        // abcd
        char[] popCombination = null;
        while ((popCombination = queue.dequeue()) != null) {
            System.out.println(popCombination);
            // ab
            char lastChar = popCombination[popCombination.length - 1];
            if (lastChar < array[array.length - 1]) {
                // abc
                // abd
                for (char c = (char) (lastChar + 1); c <= arrayLastChar; c++) {
                    char[] newCombination = new char[popCombination.length + 1];
                    // copy pop combination content
                    for (int i = 0; i < popCombination.length; i++) {
                        newCombination[i] = popCombination[i];
                    }

                    // append new char
                    newCombination[popCombination.length] = c;
                    queue.enqueue(newCombination);
                }
            }
        }
    }

}
