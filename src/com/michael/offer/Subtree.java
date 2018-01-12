package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

/**
 * Created by michael on 17-11-25.
 */
public class Subtree {
    public static void main(String[] args) {
        Tree.TreeNode treeNode4 = new Tree.TreeNode(4);
        Tree.TreeNode treeNode7 = new Tree.TreeNode(7);
        Tree.TreeNode treeNode2 = new Tree.TreeNode(2);
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode7;
        Tree.TreeNode treeNode9 = new Tree.TreeNode(9);
        Tree.TreeNode treeNode8111111 = new Tree.TreeNode(800);
        treeNode8111111.left = treeNode9;
        treeNode8111111.right = treeNode2;
        Tree.TreeNode treeNode77 = new Tree.TreeNode(7);
        Tree.TreeNode<Integer> root = new Tree.TreeNode(8);
        root.left = treeNode8111111;
        root.right = treeNode77;

        Tree tree = new Tree(root);

        Tree.TreeNode<Integer> treeNode99 = new Tree.TreeNode(9);
        Tree.TreeNode<Integer> treeNode22 = new Tree.TreeNode(2);
        Tree.TreeNode<Integer> treeNode8888888 = new Tree.TreeNode(800);

        treeNode8888888.left = treeNode99;
        treeNode8888888.right = treeNode22;

        Tree subtree = new Tree(treeNode8888888);

        final boolean isSubTree = isSubTree(tree, subtree);
        System.out.println(isSubTree);

//        System.out.println(subtree.root.left);
//        System.out.println(subtree.root.right);
    }

    public static boolean isSubTree(Tree parentTree, Tree subtree) {
        if (parentTree == null) return false;
        if (parentTree.root == null) return false;
        if (subtree == null) return false;
        if (subtree.root == null) return false;

        TreeNode parentNode = isSubNode(parentTree.root, subtree.root);
//        System.out.println("parentNode = " + parentNode);
        if (parentNode != null) return true;
        else return false;
    }

    private static final TreeNode NULL_NODE = new TreeNode();

    public static TreeNode isSubNode(TreeNode parentNode, TreeNode subNode) {
//        System.out.println("parentNode value = " + (parentNode != null ? parentNode.value : "null"));
//        System.out.println("subNode value = " + (subNode != null ? subNode.value : "null"));
//        System.out.println();

        if (subNode == null) {
            if (parentNode != null) {
                return parentNode;
            } else {
                return NULL_NODE;
            }
        } else {
            if (parentNode == null) return null;
        }

        // parent != null && sub != null
//        System.out.println("parentNode.value = " + parentNode.value);
//        System.out.println("subNode.value = " + subNode.value);
//        System.out.println();
        if ((int)parentNode.value == (int)subNode.value) {
//            System.out.println("subNode.left = " + subNode.left);
//            System.out.println("subNode.right = " + subNode.right);
//            System.out.println();
            if (isSubNode(parentNode.left, subNode.left) != null && isSubNode(parentNode.right, subNode.right) != null) {
//                System.out.println("sameNode.value = " + parentNode.value);
//                System.out.println();
                return parentNode;
            } else {
//                System.out.println("not same value = " + parentNode.value);
//                System.out.println();
                return null;
            }
        } else {
            if (isSubNode(parentNode.left, subNode) != null) {
                return parentNode.left;
            } else if (isSubNode(parentNode.right, subNode) != null) {
                return parentNode.right;
            } else {
                return null;
            }
        }
    }







}
