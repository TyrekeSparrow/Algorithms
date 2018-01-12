package com.michael.offer;

/**
 * Created by michael on 17-10-13.
 */
public class ReverseList {
    private static final class Node {
        char value;
        Node next = null;

        public Node(char value) {
            this.value = value;
        }

        public void printAll() {
            Node current = this;
            while (current != null) {
                System.out.printf(" " + current.value);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Node nodeA = new Node('a');
        Node nodeB = new Node('b');
        Node nodeC = new Node('c');
        Node nodeD = new Node('d');
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        nodeA.printAll();
        reverseList(nodeA);
        nodeD.printAll();
    }

    private static void reverseList(Node head) {
        if (head == null) return;

        Node current = head;
        Node next = head.next;
        head.next = null;
        Node nextNext = null;

        while (next != null) {
            nextNext = next.next;
            next.next = current;

            current = next;
            next = nextNext;
        }
//        System.out.println(" reverse end");
    }






}


