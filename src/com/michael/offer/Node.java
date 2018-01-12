package com.michael.offer;

/**
 * Created by michael on 17-11-23.
 */
public class Node<Type> {
    public Type value;
    public Node previous;
    public Node next;

    public Node(Type value) {
        this.value = value;
    }
}
