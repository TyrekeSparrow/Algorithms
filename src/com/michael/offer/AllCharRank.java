package com.michael.offer;

import java.util.*;
import java.util.List;

public class AllCharRank {
    public static void main(String[] args) {
        // abc
        // input: String "abc"
        // permutation output: "abc", "acb"|, "baa", "bca"|, "cab", "cba"

        String s = "abc";
        char[] array =  s.toCharArray();
        System.out.println(array);
        System.out.println();


//        HashSet<Character> set = new HashSet<>();
//        for (char c : array) {
//            set.add(c);
//        }


        permutation(array);

//        combination(array);



//        System.out.println();
//        System.out.println(array);



//        Swap swap1 = new Swap(1, 2);
//        Swap swap2 = new Swap(2, 1);
//
//        if (swap1.equals(swap2)) {
//            System.out.println("equals");
//        } else {
//            System.out.println("not equals");
//        }
//        System.out.println();
//
//        HashSet hashSet = new HashSet();
//        hashSet.add(swap1);
//        if (hashSet.contains(swap2)) {
//            System.out.println("contains");
//        } else {
//            System.out.println("not contains");
//        }







    }


    public static void permutation(char[] array) {
        if (array == null) return;
        if (array.length == 0) return;

        permutation(array, 0);
    }

    public static void permutation(char[] array, int begin) {
        // over end, print array
        if (begin >= array.length) {
            System.out.println(array);
        // not over end, get permutation
        } else {
            for (int index = begin; index < array.length; index++) {
                // change begin char
                if (index != begin) {
                    swap(array, begin, index);
                }

                // get begin+1 permutation
                permutation(array, begin + 1);

                // restore begin char
                if (index != begin) {
                    swap(array, begin, index);
                }
            }
        }
    }

    private static void swap(char[] array, int index1, int index2) {
        if (array == null) return;
        if (array.length == 0) return;
        if (index1 < 0 || index1 >= array.length) return;
        if (index2 < 0 || index2 >= array.length) return;
        if (index1 == index2) return;

        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

//    public static void combination(char[] array) {
//        LinkedList<char[]> combinationList = new LinkedList<>();
//        for (int l = 1; l <= array.length; l++) {
//            combination(combinationList, array, 0, l);
//        }
//    }

//    static class Swap {
//        private int index1;
//        private int index2;
//
//        public Swap(int index1, int index2) {
//            this.index1 = index1;
//            this.index2= index2;
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            if (obj == null) return false;
//
//            Swap another = (Swap) obj;
//            if (index1 == another.index2 && index2 == another.index1) {
//                return true;
//            }
//
//            if (index1 == another.index1 && index2 == another.index2) {
//                return true;
//            }
//
//            return false;
//
//        }
//
//        @Override
//        public int hashCode() {
//            return index1 + index2;
//        }
//    }



//    public static void combination(LinkedList<char[]> combinationList, char[] array, int begin, final int length) {
//        //  print length combination
//        if (begin >= length) {
//            printCombination(array, length);
////            collectArray(combinationList, array, length);
//
//
//        //  < length, get combination
//        } else {
////            HashSet<Swap> swaps = new HashSet<>();
//            for (int index = begin; index < array.length; index++) {
//                // change begin char
//                if (index != begin) {
//                    if (begin == 0 || array[begin - 1] < array[index]) {
//                        swap(array, begin, index);
//                    }
//                }
//
//                // get begin+1 permutation
//                combination(combinationList, array, begin + 1, length);
//
//                // restore begin char
//                if (index != begin) {
//                    if (array[begin - 1] < array[begin]) {
//                        swap(array, begin, index);
//                    }
//                }
//            }
//        }
//    }

//    private static void collectArray(LinkedList<char[]> combinationList, char[] array, int length) {
//        char[] newArray = new char[length];
//        for (int i = 0; i < length; i++) {
//            newArray[i] = array[i];
//        }
//
//
//
//        combinationList.add(newArray);
//
//
//
//
//    }

//    private static boolean contains(LinkedList<char[]> combinationList, char[] array, int length) {
//        for (char[] combinationArray: combinationList) {
//            if (combinationArray != null && combinationArray.length == length) {
//
//
//
//            }
//
//
//        }
//
//        return false;
//    }


//    private static void printCombination(char[] array, int length) {
//        for (int i = 0; i < length; i++) {
//            System.out.printf(array[i] + "");
//        }
//        System.out.println();
//    }









}
