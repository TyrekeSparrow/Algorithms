package com.pop900.algorithm.searching;

/**
 * Created by michael on 16-8-10.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private static final String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {



        // construct
        // search(get)
        // insert

        final BST<String, Integer> bst = new BST<String, Integer>();
        final int N = VALUES.length;
        for (int i = 0; i < N; i++) {
            final String key = VALUES[i];
            final Integer val = i;
            bst.put(key, val);
        }




        bst.showAll();

        // search R
        // search T

        final Integer RValue = bst.get("R");
        final Integer TValue = bst.get("T");

        System.out.println("RValue = " + RValue);
        System.out.println("TValue = " + TValue);

        System.out.println("EValue = " + bst.get("E"));












    }



    // Node
    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    private Node root;






    // root




    // get size
    // get node size
    // get value
    // put key value

    public int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    public int size() {
        return size(root);
    }


    public void put(Key key, Value val) {
        root = put(root, key, val);


    }

    public Node put(Node x, Key key, Value val) {
//        System.out.println("put " + key);
        // at last, null or equals


        // x == null return Node with N
        // key == x.key update value
        // left or right, update N return X



        if (x == null) return new Node(key, val, 1);

        final int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else x.val = val;

        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }


    public Value get(Key key) {
        return get(root, key);
    }

    public Value get(Node x, Key key) {
        if (x == null) return null;
        final int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.val;





    }


    public void showAll() {

        if (root != null) {
            System.out.println(root.key);
        }
        show(root);





    }

    public void show(Node x) {
        if (x != null) {
//            System.out.println(x.key);
            // print left and right key
            if (x.left != null) System.out.printf(x.left.key + " ");
            if (x.right != null) System.out.printf(x.right.key + " ");
            System.out.println();

            if (x.left != null) show(x.left);
            if (x.right != null) show(x.right);
        }
    }







}
