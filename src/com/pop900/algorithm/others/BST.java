package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Queue;

import java.util.Iterator;

/**
 * Created by michael on 16-8-25.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private static final String[] VALUES = {"S", "E", "A", "R", "C", "H", "E", "X", "A", "M", "P", "L", "E"};

    public static void main(String[] args) {

        // construct BST
        System.out.println("VALUES length = " + VALUES.length);
        BST<String, Integer> bst = new BST<String, Integer>();
        for (int i = 0; i < VALUES.length; i++) {
//            System.out.println("i = " + i);
            String key = VALUES[i];
            int value = i;
//            System.out.println("key = " + key);
//            System.out.println("value = " + value);
            bst.put(key, value);
//            if (key.equals("R")) {
//                System.out.println("R value = " + i);
//            } else if (key.equals("T")) {
//                System.out.println("T value = " + i);
//            }
        }





//        if (bst == null) {
//            System.out.println("bst null");
//        }
//
//
//
//        // search R T
//        int r = bst.get("R");
//        System.out.println("r = " + r);
//        System.out.println("bst = " + bst);
//        Object t = bst.get("T");
//        System.out.println("t = " + t);






        // insert L
//        bst.put("L", 13);
//        bst.showAll();
//        Math.f

//        double d = Math.floor(4.5d);
//        System.out.println("d = " + d);
//        double c = Math.ceil(4.5d);
//        System.out.println("c = " + c);

//        System.out.println("bst min = " + bst.min());
//        System.out.println("bst max = " + bst.max());

//        System.out.println("bst floor G = " + bst.floor("G"));
//        System.out.println("bst ceiling G = " + bst.ceiling("G"));

//        System.out.println("size E = " + bst.size());
        // select 3 H
//        System.out.println("select 3 = " + bst.select(3));
        // rank L 4
//        System.out.println("rank L = " + bst.rank("L"));

        /*
        * S
        * EX
        * AR
        * CH
        * M
        * LP
        */
        bst.showAll();
//        bst.deleteMin();
//        bst.deleteMax();
//        bst.showAll();


        // delete E

        /*
        * S
        * HX
        * AR
        * CM
        * LP
        */
//        bst.delete("E");

        // keys [F, T]
        // SRHMLP
        Iterable<String> keys = bst.keys("F", "T");
        for (String key: keys) {
            System.out.printf(key + " ");
        }





//        bst.showAll();
























    }



    // inner class Node with subtree size N;
    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    // root node
    private Node root;

    // get size of tree
    public int size() {
        return size(root);
    }


    // get size of node
    public int size(Node x) {
        if (x == null) {
            return 0;
        }

        return x.N;
    }

    // put
    public void put(Key key, Value value) {

        root = put(root, key, value);

    }

    private Node put(Node x, Key key, Value value) {
//        if (x == null) {
//            System.out.println("x null");
//        }
        if (x == null) return new Node(key, value, 1);

        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;

        x.N = size(x.left) + size(x.right) + 1;
        return x;

    }





    // get
    public Value get(Key key) {
//        System.out.println("key = " + key);
//        System.out.println("root = " + root);
        return get(root, key);
    }

    public Value get(Node x, Key key) {
        if (x == null) return null;
//        System.out.println("key = " + key);
//        System.out.println("x.key = " + x.key);
        System.out.println("x.left = " + x.left);
        System.out.println("x.right = " + x.right);

        int cmp = key.compareTo(x.key);
        System.out.println("cmp = " + cmp);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.value;
//        return x.value;
    }

    // min max
    // floor ceiling
    public Key floor(Key key) {
        return floor(root, key).key;
    }

    public Node floor(Node x, Key key) {
        if (x == null) return null;


        int cmp = key.compareTo(x.key);
        if (cmp < 0) return floor(x.left, key);
        else if (cmp > 0) {
            Node r = floor(x.right, key);
            if (r != null) {
                return r;
            } else {
                return x;
            }

        }
        else return x;
    }

    public Key ceiling(Key key) {
        return ceiling(root, key).key;
    }

    public Node ceiling(Node x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            Node l = ceiling(x.left, key);
            if (l != null) {
                return l;
            } else {
                return x;
            }
        } else if (cmp > 0) {
            return ceiling(x.right, key);
        } else {
            return x;
        }
    }





    // selection
    public Key select(int k) {
        return select(root, k).key;
    }

    public Node select(Node x, int k) {
        if (x == null) {
            return null;
        }

        int t = size(x.left);
        if (k < t) {
            return select(x.left, k);
        } else if (k > t) {
            return select(x.right, k - size(x.left) - 1);
        } else {
            return x;
        }
    }

    // rank
    public int rank(Key key) {
        return rank(root, key);
    }

    public int rank(Node x, Key key) {
        if (x == null) {
            return 0;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(x.left, key);
        } else if (cmp > 0) {
            return size(x.left) + 1 + rank(x.right, key);
        } else {
            // cmp == 0
            return size(x.left);
        }
    }

    // delete minimum maximum
    public void deleteMin() {
        root = deleteMin(root);
    }

    public Node deleteMin(Node x) {
        if (x == null) {
            return null;
        }

        if (x.left == null) {
            return x.right;
        } else {
            x.left = deleteMin(x.left);
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }
    }

    public void deleteMax() {
        deleteMax(root);
    }

    public Node deleteMax(Node x) {
        if (x == null) {
            return null;
        }

        if (x.right == null) {
            return x.left;
        } else {
            x.right = deleteMax(x.right);
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }
    }


    // delete


    public Key min() {
        return min(root).key;
    }

    private Node min(Node x) {
        if (x == null) return null;

        if (x.left == null) return x;
        else return min(x.left);
    }

    public Key max() {
        return max(root).key;

    }

    private Node max(Node x) {
        if (x == null) return null;

        if (x.right == null) return x;
        else return max(x.right);



    }



    private Queue<Node> printQueue = new Queue<Node>();

    // show by floor
    public void showAll() {
        // enqueue node
        // print dequeue node
        // enqueue dequeue node's left and right
//        show(root);
//        System.out.println("root = " + root);
        printQueue.enqueue(root);
        showDequeue();
        System.out.println();
    }

    private void showDequeue() {
        // dequeue every root tree
        Node d = printQueue.dequeue();
//        System.out.println("d = " + d);
        // enqueue subtree
        if (d != null) {
            System.out.println(d.key);
            // enqueue x.left x.right
//            System.out.println("d.left = " + d.left);
//            System.out.println("d.right = " + d.right);
            if (d.left != null) {
                printQueue.enqueue(d.left);
            }
            if (d.right != null) {
                printQueue.enqueue(d.right);
            }
            showDequeue();
        }
    }

    public void delete(Key key) {
        root = delete(root, key);

    }

    private Node delete(Node x, Key key) {
        // get node t
        // get min
        // delete min
        // update x
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }
            // left and right are both not null
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.N = x.left.N + x.right.N + 1;
        return x;
    }


    public Iterable<Key> keys() {
        return keys(min(), max());
    }

    public Iterable<Key> keys(Key lo, Key hi) {
        Queue<Key> queue = new Queue<Key>();
        keys(root, queue, lo, hi);
        return queue;
    }

    private void keys(Node x, Queue<Key> queue, Key lo, Key hi) {
        if (x == null) {
            return;
        }

        int cmp2lo = x.key.compareTo(lo);
        int cmp2hi = x.key.compareTo(hi);

        // x >= lo && x <= hi, x enqueue
        if (cmp2lo >= 0 && cmp2hi <= 0) {
            queue.enqueue(x.key);
        }
        // x > lo, keys x.left
        if (cmp2lo > 0) {
            keys(x.left, queue, lo, hi);
        }
        // x < hi, keys x.right
        if (cmp2hi < 0) {
            keys(x.right, queue, lo, hi);
        }
    }






















}
