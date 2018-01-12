package com.pop900.algorithm.graphs;

import com.pop900.algorithm.fundamenal.Bag;

/**
 * Created by michael on 16-8-12.
 */
public class Digraph {
    public static void main(String[] args) {
        // 4 2
        // 2 3
        // 3 2
        // 6 0
        // 0 1
        // 2 0
        // 11 12
        // 12 9
        // 9 10
        // 9 11
        // 8 9
        // 10 12
        // 11 4
        // 4 3
        // 3 5
        // 7 8
        // 8 7
        // 5 4
        // 0 5
        // 6 4
        // 6 9
        // 7 6
        // 13 vertices
        // 22 edges

        Digraph digraph = new Digraph(13);
        digraph.addEdge(4, 2);
        digraph.addEdge(2, 3);
        digraph.addEdge(3, 2);
        digraph.addEdge(6, 0);
        digraph.addEdge(0, 1);
        digraph.addEdge(2, 0);
        digraph.addEdge(11, 12);
        digraph.addEdge(12, 9);
        digraph.addEdge(9, 10);
        digraph.addEdge(9, 11);
        digraph.addEdge(8, 9);
        digraph.addEdge(10, 12);
        digraph.addEdge(11, 4);
        digraph.addEdge(4, 3);
        digraph.addEdge(3, 5);
        digraph.addEdge(7, 8);
        digraph.addEdge(8, 7);
        digraph.addEdge(5, 4);
        digraph.addEdge(0, 5);
        digraph.addEdge(6, 4);
        digraph.addEdge(6, 9);
        digraph.addEdge(7, 6);

        digraph.showAll();











    }

    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Digraph(int V) {
        this.V = V;
        this.E = 0;

        adj = (Bag<Integer>[]) new Bag[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new Bag<Integer>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        E++;
    }


    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public Digraph reverse() {
        Digraph R = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                R.addEdge(w, v);
            }
        }
        return R;
    }

    public void showAll() {
        int N = adj.length;
//        System.out.println(N);
        for (int i = 0; i < N; i++) {
            System.out.printf(i + "   ");
            for (int j: adj[i]) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }


















}
