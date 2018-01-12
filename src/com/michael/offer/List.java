package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class List {
    public Node root;

    public List() {

    }

    public List(Node node) {
        root = node;
    }

    public void printAll() {
        Node n = root;
        while(n != null) {
            System.out.printf("" + n.value);
            n = n.next;
        }
        System.out.println();
    }

    public void removeNode(Node node) {
        Node next = node.next;
        if (next != null) {
            node.value = next.value;
            node.next = next.next;
        }
    }
}
