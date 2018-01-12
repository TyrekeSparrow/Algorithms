package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

public class KthNode {
    public static void main(String[] args) {
        // 3, 4
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        Tree tree = new Tree(node5);

        node5.left = node3;
        node5.right = node7;

        node3.left = node2;
        node3.right = node4;

        node7.left = node6;
        node7.right = node8;

        int k = 3;
        TreeNode node = getKthNode(tree, k);
        System.out.println(node.value);
    }

    private static TreeNode getKthNode(Tree tree, int k) {
        int n = 0;
        TreeNode node = inOrder(tree.root, k);
        return node;
    }

    private static int n = 0;

    private static TreeNode inOrder(TreeNode node, int k) {
        if (node.left != null) {
            TreeNode nodeLeft = inOrder(node.left, k);
            if (nodeLeft != null) {
                return nodeLeft;
            }
        }
        n++;
        if (n == k) {
            return node;
        }
        if (node.right != null) {
            TreeNode nodeRight = inOrder(node.right, k);
            if (nodeRight != null) {
                return nodeRight;
            }
        }

        return null;
    }


}
