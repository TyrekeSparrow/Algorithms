package com.michael.offer;

import com.michael.algorithm.fundamenal.Queue;

/**
 * Created by michael on 17-11-25.
 */
public class Tree {
    public static final class TreeNode<T> {
        public T value;
        public TreeNode parent;
        public TreeNode left;
        public TreeNode right;
        public TreeNode[] nodes;

        public TreeNode() {

        }

        public TreeNode(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value + "";
        }
    }

    public TreeNode root;

    public Tree(TreeNode node) {
        root = node;
    }

    private static final TreeNode EMPTY_NODE = new TreeNode(-1);

    public void printTreeBread() {
        Queue<TreeNode> nodes = new Queue<TreeNode>();
        nodes.enqueue(root);
        nodes.enqueue(EMPTY_NODE);

        TreeNode node = null;

        while ((node = nodes.dequeue()) != null) {
            if (node != EMPTY_NODE) {
                System.out.printf(node.value + " ");
                nodes.enqueue(node.left);
                nodes.enqueue(node.right);
            } else {
                System.out.println();
                if (!nodes.isEmpty()) {
                    nodes.enqueue(EMPTY_NODE);
                }
            }
        }
    }

    // p l r
    public Queue<TreeNode> preLeftRight() {
        if (root == null) return null;
        Queue<TreeNode> nodes = new Queue<TreeNode>();
        preLeftRight(nodes, root);
        return nodes;
    }

    public void preLeftRight(Queue<TreeNode> nodes, TreeNode node) {
        if (node == null) {
            nodes.enqueue(EMPTY_NODE);
        } else {
            nodes.enqueue(node);
        }
        if (node != null) {
            preLeftRight(nodes, node.left);
            preLeftRight(nodes, node.right);
        }
    }

    // p r l
    public Queue<TreeNode> preRightLeft() {
        if (root == null) return null;
        Queue<TreeNode> nodes = new Queue<TreeNode>();
        preRightLeft(nodes, root);
        return nodes;
    }

    private void preRightLeft(Queue<TreeNode> nodes, TreeNode node) {
        if (node == null) {
            nodes.enqueue(EMPTY_NODE);
        } else {
            nodes.enqueue(node);
        }
        if (node != null) {
            preRightLeft(nodes, node.right);
            preRightLeft(nodes, node.left);
        }
    }


}
