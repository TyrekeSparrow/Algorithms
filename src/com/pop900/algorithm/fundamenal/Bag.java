package com.pop900.algorithm.fundamenal;

import java.util.Iterator;

/**
 * Created by michael on 16-8-8.
 */
public class Bag<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;


        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {


        }
    }

    public class Node {
        public Item item;
        public Node next;
    }

    public Node first;


    // Node first
    // construct
    // add

    public void add(Item item) {
        final Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
























}
