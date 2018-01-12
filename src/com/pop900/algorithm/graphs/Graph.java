package com.pop900.algorithm.graphs;

import com.pop900.algorithm.fundamenal.Bag;

/**
 * Created by michael on 16-8-11.
 */
public class Graph {
    // construct SORT_ARRAY graph
    public static void main(String[] args) {
        // 0 5
        // 2 4
        // 2 3
        // 1 2
        // 0 1
        // 3 4
        // 3 5
        // 0 2
        Graph graph = new Graph(6);
        graph.addEdge(0, 5);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 2);
        graph.addEdge(0, 1);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(0, 2);
        graph.showAll();
    }






    // number of vertices
    // number of edges
    // adjacency lists
    private final int V;
    private int E;
    private Bag<Integer>[] adj;





    // construct with V
    // get vertex size
    // get edge size
    // add edge
    // get adjacency
    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new Bag<Integer>();
        }
//        System.out.println("adj[2] = " + adj[2]);
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
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
