package com.michael.offer;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created by michael on 17-10-13.
 */
public class RestoreTree {
    private static final class Tree{


        private static final class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {
                this.value = value;
            }
        }

        Node root;

        public Tree(Node root) {
            this.root = root;
        }

        public Tree() {

        }

        public void printInPreOrder() {
            if (root != null) {
                printPreOrder(root);
            }
            System.out.println();
        }

        private void printPreOrder(Node node) {
            if (node == null) return;

            System.out.printf(" " + node.value);
            if (node.left != null) printPreOrder(node.left);
            if (node.right != null) printPreOrder(node.right);
        }

        public void printInOrder() {
            if (root != null) {
                printInOrder(root);
            }
        }

        private void printInOrder(Node node) {
            if (node == null) return;

            if (node.left != null) printInOrder(node.left);
            System.out.printf(" " + node.value);
            if (node.right != null) printInOrder(node.right);
        }

        private int[] preorder;
        private int[] inorder;

        public void restoreTree(int[] preorder, int[] inorder) {
            if (preorder == null || preorder.length == 0) return;
            if (inorder == null || inorder.length == 0) return;

            this.preorder = preorder;
            this.inorder = inorder;
            root = restoreNode(0, preorder.length - 1, 0, inorder.length - 1);
        }

        private Node restoreNode(int preStart, int preStop, int inStart, int inStop) {
//            System.out.println();
//            System.out.printf(" preStart = " + preStart);
//            System.out.printf(" preStop = " + preStop);
//            System.out.printf(" inStart = " + inStart);
//            System.out.printf(" inStop = " + inStop);
            // invalid area
            if (preStart < 0 || preStop > preorder.length - 1 || preStart > preStop) return null;
            if (inStart < 0 || inStop > inorder.length - 1 || inStart > inStop) return null;

            // get root value
            int rootValue = preorder[preStart];
            System.out.println(rootValue);

            // get rootNode
            Node root  = new Node(rootValue);

            // only one node
            if ((preStart == preStop) && (inStart == inStop)) {
                return new Node(rootValue);
            }

            // get inIndex
            int inIndex = getInIndex(rootValue, inStart);
            // >= 2 nodes
            if (inIndex == inStart) {
                root.left = null;
                int rightPreStart = preStart + 1;
                int rightPreStop = preStop;
                int rightInStart = inStart + 1;
                int rightInStop = inStop;
                System.out.println(rootValue + " right");
                root.right = restoreNode(rightPreStart, rightPreStop, rightInStart, rightInStop);
            } else if (inIndex == inStop) {
                root.right = null;
                int leftPreStart = preStart + 1;
                int leftPreStop = preStop;
                int leftInStart = inStart;
                int leftInStop = inIndex - 1;
                System.out.println(rootValue + " left");
                root.left = restoreNode(leftPreStart, leftPreStop, leftInStart, leftInStop);
            } else {
                int leftLength = inIndex - inStart;

                int leftPreStart = preStart + 1;
                int leftPreStop = preStart + leftLength;
                int leftInStart = inStart;
                int leftInStop = inIndex - 1;
                System.out.println(rootValue + " left");
                root.left = restoreNode(leftPreStart, leftPreStop, leftInStart, leftInStop);

                int rightPreStart = leftPreStop + 1;
                int rightPreStop = preStop;
                int rightInStart = inIndex + 1;
                int rightInStop = inStop;

                System.out.println(rootValue + " right");
                root.right = restoreNode(rightPreStart, rightPreStop, rightInStart, rightInStop);
            }

            /*
            int leftInStart = inStart;
            int leftInStop = inIndex - 1;

            int leftPreStart = preStart + 1;
            int leftPreStop = preStart + (leftInStop - leftInStart + 1);

            root.left = restoreNode(leftPreStart, leftPreStop, leftInStart, leftInStop);

            int rightPreStart = leftPreStop + 1;
            int rightPreStop = preStop;
            int rightInStart = inIndex + 1;
            int rightInStop = inStop;
            root.right = restoreNode(rightPreStart, rightPreStop, rightInStart, rightInStop);
            */

            return root;
        }

        private int getInIndex(int inValue, int inStart) {
            int inIndex = inStart;
            for (; inIndex < inorder.length; inIndex++) {
                if (inorder[inIndex] != inValue) {
                    continue;
                } else {
                    break;
                }
            }
            return inIndex;
        }
    }

    public static void main(String[] args) {
        // preorder {1, 2, 4, 7, 3, 5, 6, 8}
        // inorder {4, 7, 2, 1, 5, 3, 8, 6}

        /*
        Tree.Node node1 = new Tree.Node(1);
        Tree.Node node2 = new Tree.Node(2);
        Tree.Node node3 = new Tree.Node(3);
        Tree.Node node4 = new Tree.Node(4);
        Tree.Node node5 = new Tree.Node(5);
        Tree.Node node6 = new Tree.Node(6);
        Tree.Node node7 = new Tree.Node(7);
        Tree.Node node8 = new Tree.Node(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.right = node7;
        node3.left = node5;
        node3.right = node6;
        node6.left = node8;

        Tree tree = new Tree(node1);
        tree.printInPreOrder();
        tree.printInOrder();
        */

        // restore tree
        // preorder {1, 2, 4, 7, 3, 5, 6, 8}
        // inorder {4, 7, 2, 1, 5, 3, 8, 6}
        final int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        final int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        Tree restoreTree = new Tree();
        restoreTree.restoreTree(preorder, inorder);
        System.out.println();
        restoreTree.printInPreOrder();
        restoreTree.printInOrder();
    }






}
