//package com.michael.offer;
//
///**
// * Created by michael on 17-10-15.
// */
//public class Tree {
//
//    public static final class Node<T> {
//        final T value;
//        Node parent;
//        Node left;
//        Node right;
//
//        public Node(T value) {
//            this.value = value;
//        }
//
//        @Override
//        public String toString() {
//            return value + "";
//        }
//    }
//
//    Node root;
//
//
//    public Tree(Node node) {
//        root = node;
//    }
//
//
//    public Node getNextInSortNode(Node<Character> node) {
//        if (node == null) return null;
//        // in sort next right
//
//        // right child != null, get next right child
//        // right root != null, get next right root
//
//        if (node.right != null) {
//            return getMostLeftChild(node.right);
//        }
//        if (node.parent != null) {
//            return getMostLeftParent(node);
//        }
//
//        // it is the most right node, there is no next right node
//        return null;
//    }
//
//    private Node getMostLeftParent(Node node) {
//        if (node == null) return null;
//
//        Node parent = node.parent;
//        if (parent != null) {
//            if (parent.left == node) {
//                return parent;
//            } else {
//                return getMostLeftParent(parent);
//            }
//        }
//
//        return null;
//    }
//
//    private Node getMostLeftChild(Node node) {
//        if (node == null) return null;
//
//        if (node.left != null) {
//            return getMostLeftChild(node.left);
//        } else {
//            return node;
//        }
//    }
//
//}
