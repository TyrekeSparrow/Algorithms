package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

public class BST2Deque {
    public static void main(String[] args) {
        /**
         * 10
         * 6    14
         * 4 8  12 16
         */

        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node6 = new TreeNode(6);
        node6.left = node4;
        node6.right = node8;

        TreeNode node12 = new TreeNode(12);
        TreeNode node16 = new TreeNode(16);
        TreeNode node14 = new TreeNode(14);
        node14.left = node12;
        node14.right = node16;

        TreeNode node10 = new TreeNode(10);
        node10.left = node6;
        node10.right = node14;

        Tree tree = new Tree(node10);

        toDeque(tree);

    }

    private static void toDeque(Tree tree) {
        if (tree == null) return;
        if (tree.root == null) return;

        TreeNode node = inOrder(null, tree.root);

        while (node != null) {
            System.out.println(node.value);
            node = node.left;
        }

    }

    // return last node
    private static TreeNode inOrder(TreeNode lastNode, TreeNode node) {
        if (node == null) return null;

        // is leaf
        if (node.left == null && node.right == null) {
            if (lastNode != null) {
                lastNode.right = node;
                node.left = lastNode;
            }
            return node;
        // is not leaf
        } else {
            // left
            if (node.left != null) {
                lastNode = inOrder(lastNode, node.left);
            }
            // node
            if (lastNode != null) {
                lastNode.right = node;
                node.left = lastNode;
            }
            lastNode = node;
            // right
            if (node.right != null) {
                lastNode = inOrder(lastNode, node.right);
            }
            return lastNode;
        }

    }
























}
