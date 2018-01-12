package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class HasCircle {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        List list = new List();
        list.root = node1;

        // 123456 3


        // hasCircle
        // circleLength
        // entryNode
        Node entry = getCircleEntry(list);
        System.out.println("entry = " + entry.value);


    }

    public static Node getCircleEntry(List list) {
        if (list == null) return null;
        if (list.root == null) return null;
        if (list.root.next == null) return null;
        if (list.root.next == list.root) {
            System.out.println("list.root = " + list.root);
            return list.root;
        }

        Node n1 = list.root;
        Node n2 = list.root;

        int length = 0;
        boolean hasCircle = false;
        while (n1.next != null) {
            n1 = n1.next;
            n2 = n2.next;
            if (n2 != null) {
                n2 = n2.next;
            } else {
                System.out.println("no circle");
                return null;
            }
            length++;
            if (n2 == n1) {
                System.out.println("circle length = " + length);
                hasCircle = true;
                break;
            }
        }

        if (!hasCircle) return null;

        int count = 0;
        Node head = list.root;
        Node trail = list.root;

        while (head != null) {
            head = head.next;
            count++;
            if (count == length) break;
        }

        if (count == length) {
            while (head.next != null) {
                head = head.next;
                if (trail.next != null) {
                    trail = trail.next;
                }

                if (head == trail) {
                    return trail;
                }
            }
        }

        return null;
    }




}
