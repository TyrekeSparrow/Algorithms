package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

public class IsBSTPost {
    public static void main(String[] args) {
        /**
         * 8
         * 6        10
         * 5 7      9 11
         */
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        node6.left = node5;
        node6.right = node7;

        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        TreeNode node10 = new TreeNode(10);
        node10.left = node9;
        node10.right = node11;

        TreeNode node8 = new TreeNode(8);
        node8.left = node6;
        node8.right = node10;

        // {5, 7, 6, 9, 11, 10, 8}

        int[] array = {2, 7 , 6, 9, 1111, 10, 8};
        boolean isPost = isPost(array);
        System.out.println("isPost = " + isPost);

    }

    private static boolean isPost(int[] array) {
        boolean isPost = isBSTPost(array, 0, array.length - 1);
        return isPost;
    }

    private static final boolean isBSTPost(int[] array, int startIndex, int stopIndex) {
        if (array == null) return false;
        if (array.length == 0) return false;
        if (startIndex < 0 || startIndex >= array.length) return false;
        if (stopIndex < 0 || stopIndex >= array.length) return false;
        if (startIndex > stopIndex) return false;
        if (startIndex == stopIndex) return true;
        if (startIndex + 1 == stopIndex) return true;

        boolean isPost = true;

        int middleValue = array[stopIndex];
        int rightStart = stopIndex;
        while (--rightStart >= startIndex) {
            if (array[rightStart] > middleValue) {
                continue;
            } else {
                rightStart++;
                break;
            }
        }

        int leftStart = rightStart;
        while (--leftStart >= startIndex) {
            if (array[leftStart] < middleValue) {
                continue;
            } else {
                return false;
            }
        }



        boolean isLeftPost = isBSTPost(array, startIndex, rightStart - 1);
        boolean isRightPost = isBSTPost(array, rightStart, stopIndex - 1);



        isPost = isPost && isLeftPost && isRightPost;




        return isPost;


    }


}
