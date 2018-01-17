package com.michael.algorithm.searching;

/**
 * Created by michael on 16-8-10.
 */
public class SequentialSearchST<Key, Value> {
    private static final String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {
        final SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();

        final int N = VALUES.length;
        for (int i = 0; i < N; i++) {
            // get key value
            // put to the tables
            final String key = VALUES[i];
            final int value = i;
            st.put(key, value);
        }
        st.showAll();
    }


    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public Node first;

    public void put(Key key, Value value) {
        // search for key, if found update value
        // , else add new value
        for (Node node = first; node != null; node = node.next) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        first = new Node(key, value, first);
    }

    public Value get(Key key) {
        // search for key
        for (Node x  = first; x != null; x = x.next) {
            if (x.key.equals(key)) {
                return x.value;
            }
        }
        return null;
    }

    public void showAll() {
        for (Node x = first; x != null; x = x.next) {
            System.out.printf("" + x.key + x.value + "-");
        }
        System.out.println();
    }


}
