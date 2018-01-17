package com.michael.algorithm.searching;

/**
 * Created by michael on 17-8-23.
 */
public class BinarySearchTree {
    // main client
    public static void main(java.lang.String[] args) {
        final java.lang.String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        for (int i = 0; i < VALUES.length; i++) {
            final String key = VALUES[i];
            final Integer val = i;
            binarySearchTree.put(key, val);
        }

//        int i = 'X' + 1;
//        System.out.println("i = " + i);

//        int[][] ii = new int[3][7];


        binarySearchTree.showAll();


    }

    // Node class
    private class Node {
        private String key;
        private Integer val;

        private Node root;
        private Node left;
        private Node right;
        // nodes in subtree rooted here
        private int N;

        public Node(String key, Integer val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
            this.root = root;
        }
    }

    // get root size
    private int size() {
        return size(root);
    }

    // get node size
    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    // root
    private Node root;

    // put
    private void put(String key, Integer val) {
        root = put(root, key, val);
    }

    // put in Node
    private Node put(Node X, String key, Integer val) {
        if (X == null) return new Node(key, val, 1);

        int cmp = key.compareTo(X.key);
        if (cmp < 0) {
            X.left = put(X.left, key, val);
        } else if (cmp > 0) {
            X.right = put(X.right, key, val);
        } else {
            X.val = val;
        }
        X.N = size(X.left) + size(X.right) + 1;

        return X;
    }



    // reverse leaves


    public void showAll() {
        Node[][] nodes = getNodes();
        final String empty = " ";
        for (int i = 0; i < nodes.length; i++) {
            for (int j = 0 ; j < nodes[i].length; j++) {
                Node n = nodes[i][j];
                if (n != null) {
                    System.out.printf(n.key);
                } else {
                    System.out.printf(empty);
                }
            }
            System.out.println();
        }
    }

    public Node[][] getNodes() {
        int m = 6;
        int n = 'X' + 1;
        Node[][] nodes = new Node[m][n];

        if (root != null) {
            int k = root.key.charAt(0);
            System.out.println("k = " + k);
            nodes[0][k] = root;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Node p = nodes[i - 1][j];
                if (p != null) {
                    if (p.left !=  null) {
                        int jl = p.left.key.charAt(0);
                        nodes[i][jl] = p.left;
                    }
                    if (p.right != null) {
                        int jr = p.right.key.charAt(0);
                        nodes[i][jr] = p.right;
                    }
                }
            }
        }

        return nodes;
    }






}
