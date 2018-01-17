package com.michael.algorithm.others;

/**
 * Created by michael on 16-8-24.
 */
public class SequentialSearchST<Key, Value> {
    private static final String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};


    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();
        System.out.println("values length = " + VALUES.length);

        for (int i = 0; i < VALUES.length; i++) {
//            System.out.println("st put " + VALUES[i] + " " + i);
            st.put(VALUES[i], i);
        }
        // L11 P10 M9 X7 H5 C4 R3 A8 E12 S0
        st.showAll();
    }



    // inner class Node(Key Value Next)
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

    // first node
    private Node first;

    public void showAll() {
        System.out.println("showAll");
        for (Node n = first; n != null; n = n.next) {
            System.out.printf(n.key + "" + n.value + " ");
        }
        System.out.println();
    }



    // put
    public void put(Key key, Value value) {
        System.out.println("put " + key + value);
        // update or add
        for (Node n = first; n != null; n = n.next) {
            if (n.key.equals(key)) {
                // if match, update value
                n.value = value;
                return;
            }
        }
        Node tempNode = first;
        first = new Node(key, value, tempNode);
    }

    // get
    public Value get(Key key) {

        for (Node n = first; n != null; n = n.next) {
            if (n.key.equals(key)) {
                // if match, update value
                return n.value;
            }
        }
        return null;
    }

















}
