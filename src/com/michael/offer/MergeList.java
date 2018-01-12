package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class MergeList {
    public static void main(String[] args) {
        // 1357
        // 2468

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node1.next = node3;
        node3.next = node5;
        node5.next = node7;

        node2.next = node4;
        node4.next = node6;
        node6.next = node8;

        List list1 = new List(node1);
        List list2 = new List(node2);

        List mergeList = mergeList(list1, list2);
        System.out.println("mergeList.root = " + mergeList.root.value);
        mergeList.printAll();

    }

    public static List mergeList(List l1, List l2) {
        if (l1 == null || l1.root == null) return l2;
        if (l2 == null || l2.root == null) return l1;

//        Node mergeNode = null;
        List mergeList = null;

        Node nodeA = l1.root;
        Node nodeB = l2.root;
        Node lastNode = null;
        Node tempNode = null;

        while (nodeA != null || nodeB != null) {
            if (nodeA == null) {
                tempNode = nodeB;
                nodeB = nodeB.next;
            } else if (nodeB == null) {
                tempNode = nodeA;
                nodeA = nodeA.next;
            } else {
                if ((int)nodeA.value <= (int)nodeB.value) {
                    tempNode = nodeA;
                    nodeA = nodeA.next;
                } else {
                    tempNode = nodeB;
                    nodeB = nodeB.next;
                }
            }

//            System.out.println("mergeNode.value = " + tempNode.value);

//            System.out.println("mergeNode = " + mergeNode);
//            lastNode = tempNode;
            if (mergeList == null && tempNode != null) {
                mergeList = new List(tempNode);
            } else {
                lastNode.next = tempNode;
            }
            lastNode = tempNode;


        }

        return mergeList;
    }





}
