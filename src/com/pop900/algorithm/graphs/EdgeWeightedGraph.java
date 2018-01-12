package com.pop900.algorithm.graphs;

import com.pop900.algorithm.fundamenal.Bag;

/**
 * Created by michael on 16-8-13.
 */
public class EdgeWeightedGraph {
    private final int V;
    private int E;
    public Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    public Iterable<Edge> edges() {
        Bag<Edge> b = new Bag<Edge>();

        for (int v = 0; v < V; v++) {
            for (Edge e : adj[v]) {
                if (e.other(v) > v) {
                    b.add(e);
                }
            }
        }

        return b;
    }

    public Edge getNextMinimum(int v, double minimum) {
        Edge edge = null;
        double nextMinimum  = Double.MAX_VALUE;

        for (Edge e : adj[v]) {
            if (e.weight() < nextMinimum && e.weight() > minimum) {
                nextMinimum = e.weight();
                edge = e;

            }
        }

        return edge;


    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }







}
