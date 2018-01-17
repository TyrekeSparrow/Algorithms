package com.michael.algorithm.fundamenal;

import java.util.Iterator;

/**
 * Created by michael on 16-8-8.
 */
public class Queue<Item> implements Iterable<Item> {
    private static final String[] StdIn = {"to", "be", "or", "not", "to", "", "be", "", "", "that", "", "", "", "is"};

    public static void main(String[] args) {
        final Queue<String> q = new Queue<String>();
        final int l = StdIn.length;
        for (int i = 0; i < l; i++) {
            final String value = StdIn[i];
            if (!value.equals("")) {
                // enqueue
                q.enqueue(value);
                System.out.println(value);
            } else {
                // dequeue
                final String dequeueValue = q.dequeue();
                System.out.println("            " + dequeueValue);
            }
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private Node last;
    private int N;

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(Item item) {
        final Node oldLast = last;
        last  = new Node();
        last.item = item;
        if (oldLast != null) {
            oldLast.next = last;
        }
        if (first == null) {
            first = last;
        }
//        System.out.println("first = " + first);
//        System.out.println("last = " + last);
        N++;
    }

    public Item dequeue() {
        if (first != null) {
            final Item item = first.item;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return item;
        }
        N--;
        return null;
    }

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

    public void showAll() {
        for (Item i : this) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }




}
