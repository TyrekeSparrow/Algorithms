package com.michael.offer;

import com.pop900.algorithm.fundamenal.Queue;
import com.pop900.algorithm.fundamenal.Stack;
import com.michael.offer.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class PathValue {
    public static void main(String[] args) {
        /**
         * 10
         * 5    12
         * 4 7
         */


        final int value = 22;

        Queue<TreeNode> nodeQueue;

        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        node5.left = node4;
        node5.right = node7;

        TreeNode node12 = new TreeNode(12);
        TreeNode node10 = new TreeNode(10);
        node10.left = node5;
        node10.right = node12;

        TreeNode node3 = new TreeNode(3);
        node4.left = node3;

        Tree tree = new Tree(node10);


        getPath(tree, value);



//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(1);
//        deque.add(2);
//        deque.add(3);
//        deque.add(5);
//        deque.removeLast();
//        deque.addLast(4);
//
//        for (int i : deque) {
//            System.out.println(i);
//
//        }















    }

    public static LinkedList<Queue<TreeNode>> getPath(Tree tree, int value) {
        if (tree == null) return null;
        if (value == 0) return null;

        LinkedList<Queue<TreeNode>> pathList = new LinkedList<>();




        preOrder(tree.root, value);






        return pathList;


    }

//    private static Stack<TreeNode> nodeStack = new Stack<>();
    private static Deque<TreeNode> nodeDeque= new ArrayDeque<>();
    private static int pathValue = 0;

    // TODO capture?
    private static void preOrder(/*LinkedList<Queue<TreeNode>> pathList, */ TreeNode node, int requireValue) {
        if (node == null) return;
//        if (pathList == null) return;
        if (requireValue <= 0) return;

        int value = (int) node.value;

        if (node.left == null && node.right == null) {
            // is leaf
            if (value == requireValue) {
//                nodeStack.push(node);
                nodeDeque.addLast(node);
                // TODO capture queue
                getPath();
//                nodeStack.pop();
                nodeDeque.removeLast();
            }
        } else {
            // is not leaf
            if (value < requireValue) {
//                nodeStack.push(node);
                nodeDeque.addLast(node);

                int newRequireValue = requireValue - value;
                if (node.left != null) {
                    preOrder(node.left, newRequireValue);
                }

                if (node.right != null && newRequireValue > value) {
                    preOrder(node.right, newRequireValue);
                }

//                nodeStack.pop();
                nodeDeque.removeLast();
            }
        }

    }

    private static void getPath() {
        for (TreeNode node: nodeDeque) {
            System.out.printf(" " + node.value);
        }
        System.out.println();
    }


//    private static void pushStack(TreeNode node) {
//        nodeStack.push(node);
//    }


}
