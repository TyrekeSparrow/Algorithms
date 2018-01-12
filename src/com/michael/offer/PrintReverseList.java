//package com.michael.offer;
//
///**
// * Created by michael on 17-10-15.
// */
//public class PrintReverseList {
//
//
//    public static void main(String[] args) {
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//        List list = new List(node1);
//        list.printReverseList();
//
//
//
//
//    }
//}
//
//final class Node {
//    public final int value;
//    public Node next;
//
//    public Node(int value) {
//        this.value = value;
//    }
//}
//
//final class List {
//    private final Node root;
//
//    public List(Node root) {
//        this.root = root;
//    }
//
//    public void printReverseList() {
//        printReverseNode(root);
//    }
//
//    public void printReverseNode(Node node) {
//        if (node == null) return;
//        if (node.next != null) {
//            printReverseNode(node.next);
//        }
//
//        System.out.printf(" " + node.value);
//    }
//}
