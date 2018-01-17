package com.michael.offer;

import com.michael.algorithm.fundamenal.Queue;

/**
 * Created by michael on 17-10-8.
 */
public class TreeLevel {
    public static void main(String[] args) {


//        8 6 10 5 7 9 11
        Node n5 = new Node(5);
        Node n7 = new Node(7);
        Node n9 = new Node(9);
        Node n11 = new Node(11);
        Node n6 = new Node(6);
        Node n10 = new Node(10);
        Node n8 = new Node(8);
        n6.left = n5;
        n6.right = n7;
        n10.left = n9;
        n10.right = n11;
        n8.left = n6;
        n8.right = n10;

//        printAllNode(n8);



//        String s1 = "sd";
//        String s = "y";
//        String s2 = "ttt";
//
//        Queue<String> strings = new Queue<String>();
//        strings.enqueue(s1);
//        strings.enqueue(s);
//        strings.enqueue(s2);
//        strings.enqueue(s);
//        strings.enqueue(s1);
//
//        String dequeueStr = null;
//
//        while((dequeueStr = strings.dequeue()) != null) {
//            System.out.println(dequeueStr);
//
//        }


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);
        Node node14 = new Node(14);
        Node node15 = new Node(15);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node4.right = node9;
        node5.left = node10;
        node5.right = node11;
        node6.left = node12;
        node6.right = node13;
        node7.left = node14;
        node7.right = node15;

















    }

    private static void printAllNode(Node n8) {
        Queue<Node> queue = new Queue<Node>();
        Node newLineNode = new Node(-1);

        queue.enqueue(n8);
        queue.enqueue(newLineNode);

        Node dequeueNode = null;
        while ((dequeueNode = queue.dequeue()) != null) {
            if (dequeueNode == newLineNode) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.enqueue(newLineNode);
                }
                continue;
            }

            // print node
            System.out.printf(" " + dequeueNode.value);

            // enqueue child
            Node left = dequeueNode.left;
            Node right = dequeueNode.right;
            if (left != null) {
                queue.enqueue(left);
            }
            if (right != null) {
                queue.enqueue(right);
            }
        }

    }


    static class Node {
        final int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }






}
