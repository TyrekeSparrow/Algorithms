package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class FindKth2Trail {
    public static void main(String[] args) {
        // 1 2 3 4 5 6
        // 3
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

        List list = new List();
        list.root = node1;



        int k = 7;
        Node nodeK = findKth2Trail(list, k);
        if (nodeK != null) {
            System.out.println("value = " + nodeK.value);
        } else {
            System.out.println(nodeK);
        }
    }

    private static Node findKth2Trail(List list, int k) {
        // 1 2 3 4 5 6
        // 3

        if (list == null) return null;
        if (list.root == null) return null;
        if (k < 1) return null;

        int count = 0;
        Node nHead = list.root;
        Node nTrail = null;

        while (nHead != null) {
            if (count == k - 1) {
                nTrail = list.root;
            } else if (count > k - 1) {
                nTrail = nTrail.next;
            }
            nHead = nHead.next;
            count++;
        }

        if (count >= k - 1) {
            return nTrail;
        } else {
            return null;
        }
    }


}
