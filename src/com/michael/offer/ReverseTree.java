package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

/**
 * Created by michael on 17-11-25.
 */
public class ReverseTree {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);

        TreeNode node6 = new TreeNode(6);
        TreeNode node10 = new TreeNode(10);

        TreeNode node8 = new TreeNode(8);

        node8.left = node6;
        node8.right = node10;

        node6.left = node5;
        node6.right = node7;

        node10.left = node9;
        node10.right = node11;

        Tree tree = new Tree(node8);
        tree.printTreeBread();
        reverseTree(tree);
        tree.printTreeBread();

    }

    public static void reverseTree(Tree tree) {
        if (tree == null) return;
        if (tree.root == null) return;

        reverseNode(tree.root);
    }

    public static void reverseNode(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) return;

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null) {
            reverseNode(node.left);
        }
        if (node.right != null) {
            reverseNode(node.right);
        }
    }




}
