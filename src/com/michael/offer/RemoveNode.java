package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class RemoveNode {
    public static void main(String[] args) {
        Node<Integer> root = new Node<Integer>(3);
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(7);

        root.next = node1;
        node1.next = node2;

        List list = new List();
        list.root = root;

        list.printAll();
        list.removeNode(node1);
        list.printAll();









    }








}
