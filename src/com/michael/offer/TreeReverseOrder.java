package com.michael.offer;

import com.pop900.algorithm.fundamenal.Queue;
import com.pop900.algorithm.fundamenal.Stack;

/**
 * Created by michael on 17-10-8.
 */
public class TreeReverseOrder {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
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


        printInReverseOrder(node1);




    }


    private static final int rightDirection = 10000;
    private static final int leftDirection = -10000;

    private static void printInReverseOrder(Node node) {
        Queue<Node> queue = new Queue<Node>();
        Stack<Node> printLeftStack = new Stack<Node>();
        int direction = rightDirection;
        Node newLine = new Node(direction);

        queue.enqueue(newLine);
        queue.enqueue(node);

        Node dNode = null;
        while ((dNode = queue.dequeue()) != null) {
            if (dNode == newLine) {
                // get direction
                direction = dNode.value;
                if (direction == rightDirection) {
                    popStack(printLeftStack);
                }
                System.out.println();
                // set new line
                if (!queue.isEmpty()) {
                    int newDirection = 0 - direction;
                    newLine.value = newDirection;
                    queue.enqueue(newLine);
                }
                continue;
            }



            Node left = dNode.left;
            Node right = dNode.right;
            if (left != null) {
                queue.enqueue(left);
            }
            if (right != null) {
                queue.enqueue(right);
            }
//            System.out.println("dNode value = " + dNode.value);
//            System.out.println("direction = " + direction);
            if (direction == rightDirection) {
                System.out.printf(" " + dNode.value);
            } else if (direction == leftDirection) {
                if (dNode != null) {
                    printLeftStack.push(dNode);
                }
            } else {
                // do nothing
            }
        }


    }

    private static void popStack(Stack<Node> printLeftStack) {
//        System.out.println("popStack");
        Node pNode = null;
        while ((pNode = printLeftStack.pop()) != null) {
            System.out.printf(" " + pNode.value);
        }
    }


}
