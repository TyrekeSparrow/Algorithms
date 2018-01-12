package com.michael.offer;

public class SameNode {
    public static void main(String[] args) {
        // 12367
        //  4567
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node6.next = node7;

        node4.next = node5;
        node5.next = node6;

        List list1 = new List(node1);
        List list2 = new List(node4);

        Node sameNode = getSameNode(list1, list2);
        System.out.println("sameNode = " + sameNode.value);
    }

    private static Node getSameNode(List list1, List list2) {
        int length1 = getLength(list1);
        int length2 = getLength(list2);

        Node one = list1.root;
        Node another = list2.root;

        if (length1 > length2) {
            for (int step = length1 - length2; step > 0; step--) {
                one = one.next;
            }
        } else if (length2 > length1) {
            for (int step = length2 - length1; step > 0; step--) {
                another = another.next;
            }
        } else {
            // same length, do nothing
        }


        while ((one = one.next) != null) {
            another = another.next;
            if (another != null && one == another) {
                return another;
            }
        }

        return null;
    }

    private static int getLength(List list) {
        if (list == null) return -1;
        int length = 0;
        for (Node node = list.root; node != null; node = node.next) {
            length++;
        }
        return length;
    }


}
