package com.michael.offer;

import com.michael.algorithm.fundamenal.Queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by michael on 17-10-8.
 */
public class PrintABC {
    public static void main(String[] args) {
        String s = "abc";
//        printAll(s);

        printAllContent(s);

        Set<StringContent> set = new HashSet<>();
//        StringContent content1 = new StringContent();
//        content1.content = "abc";
//        StringContent content2 = new StringContent();
//        content2.content = "acb";
//        set.add(content1);
//        if (set.contains(content2)) {
//            System.out.println("contains");
//
//        } else {
//            System.out.println("not contains");
//        }




    }

    static class StringContent {
        String content;

        @Override
        public int hashCode() {
//            return super.hashCode();
            int sum = getSum(content.toCharArray()) + 10000 * content.length();
            return sum;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StringContent) {
                StringContent newContentObj = (StringContent) obj;
                String newContent = newContentObj.content;
                return contentEquals(content, newContent);
            }
            return false;

        }

        private static boolean contentEquals(String content, String another) {
//            System.out.println("content = " + content);
//            System.out.println("another = " + another);
            char[] oneChars = content.toCharArray();
            char[] anotherChars = another.toCharArray();

            if (oneChars.length == anotherChars.length && getSum(oneChars) == getSum(anotherChars)) {
//                System.out.printf("equals");
                return true;
            }
//            System.out.println("not equals");
            return false;
        }

        private static int getSum(char[] chars) {
            int sum = 0;
            for (char c : chars) {
                int i = c;
                sum = sum + i;
            }
            return sum;
        }
    }

    private static void printAllContent(String s) {

        char[] chars = s.toCharArray();

        HashSet<StringContent> set = new HashSet<StringContent>();
        Queue<StringContent> queue = new Queue<StringContent>();

        for (char c : chars) {
            StringContent content = new StringContent();
            content.content = "" + c;
            queue.enqueue(content);
        }

        StringContent dStr = null;
        while ((dStr = queue.dequeue()) != null) {
//            System.out.println("dStr content = " + dStr.content);
            if (!set.contains(dStr)) {
                set.add(dStr);
                if (dStr.content.length() < s.length()) {
                    for (char c : chars) {

                        boolean isEqual = false;
                        char[] dArray = dStr.content.toCharArray();
                        for (char dc : dArray) {
                            if (c == dc) isEqual = true;
                        }

                        if (!isEqual) {
                            StringContent content2 = new StringContent();
                            String newStr = dStr.content + c;
                            content2.content = newStr;
                            queue.enqueue(content2);

                        }


                    }
                }
            }
        }

        for (StringContent content : set) {
            System.out.println(" " + content.content);

        }






            








    }

    private static void printAll(String s) {
        char[] chars = s.toCharArray();
        int l  = chars.length;
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < l; i++) {
            char c1 = chars[i];
            for (int j = 0; j < l; j++) {
                if (j != i) {
                    char c2 = chars[j];
                    for (int k = 0; k < l; k++) {
                        if (k != i && k != j) {
                            char c3 = chars[k];
                            String total = "" + c1 + c2 + c3;
                            arrayList.add(total);
                        }
                    }
                }
            }
        }

//        for (Object total : arrayList) {
//            System.out.println(total);
//
//
//        }
        




    }


}
