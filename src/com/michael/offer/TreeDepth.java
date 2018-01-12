package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

public class TreeDepth {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node5.left = node7;

        Tree tree = new Tree(node1);
        int depth = getTreeDepth(tree);
        System.out.println(depth);
    }

    private static int getTreeDepth(Tree tree) {
        if (tree == null) return -1;
        if (tree.root == null) return 0;

        int depth = getTreeDepth(tree.root);
        return depth;
    }

    private static int getTreeDepth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = 0;
        if (node.left != null) {
            leftDepth = getTreeDepth(node.left);
        }
        int rightDepth = 0;
        if (node.right != null) {
            rightDepth = getTreeDepth(node.right);
        }

        final int maxDepth = Math.max(leftDepth, rightDepth);
        final int depth = maxDepth + 1;

        return depth;
    }


}
