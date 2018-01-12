package com.pop900.algorithm.fundamenal;

import java.util.Iterator;

/**
 * Created by michael on 16-8-8.
 */
public class Stack<Item> implements Iterable<Item>{
    private static final String[] StdIn = {"to", "be", "or", "not", "to", "", "be", "", "", "that", "", "", "", "is"};
//    private static final String[] StdOut = {"", "", "", "", "", "to", "", "be", "not", "", "that", "or", "be"};

    public static void main(String[] args) {
        final Stack<String> s = new Stack<String>();
        // for each in, push
        // for each out pop
        final int l = StdIn.length;
        for (int i = 0; i < l; i++) {
            final String value = StdIn[i];
            if (!value.equals("")) {
                // push
                s.push(StdIn[i]);
                System.out.println(value);
            } else {
                // pop
                final String popValue = s.pop();
                System.out.println("            " + popValue);
            }
            /*
            if (!StdOut[i].equals("")) {
                // pop
                System.out.printf("            pop" + StdOut[i]);
            }
            */
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    private Node first;

    public void push(Item item) {
        final Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Item pop() {
        if (first != null) {
            final Item item = first.item;
            first = first.next;
            return item;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
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
    }











}
