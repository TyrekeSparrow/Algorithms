package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Bag;
import com.pop900.algorithm.graphs.Edge;
import com.pop900.algorithm.graphs.EdgeWeightedGraph;

/**
 * Created by michael on 16-9-28.
 */
public class PrimMST {
    public static void main(String[] args) {
        EdgeWeightedGraph G = new EdgeWeightedGraph(8);
        Edge edge = new Edge(4, 5, 0.35);
        G.addEdge(edge);
        edge = new Edge(4, 7, 0.37);
        G.addEdge(edge);
        edge = new Edge(5, 7, 0.28);
        G.addEdge(edge);
        edge = new Edge(0, 7, 0.16);
        G.addEdge(edge);
        edge = new Edge(1, 5, 0.32);
        G.addEdge(edge);
        edge = new Edge(0, 4, 0.38);
        G.addEdge(edge);
        edge = new Edge(2, 3, 0.17);
        G.addEdge(edge);
        edge = new Edge(1, 7, 0.19);
        G.addEdge(edge);
        edge = new Edge(0, 2, 0.26);
        G.addEdge(edge);
        edge = new Edge(1, 2, 0.36);
        G.addEdge(edge);
        edge = new Edge(1, 3, 0.29);
        G.addEdge(edge);
        edge = new Edge(2, 7, 0.34);
        G.addEdge(edge);
        edge = new Edge(6, 2, 0.40);
        G.addEdge(edge);
        edge = new Edge(3, 6, 0.52);
        G.addEdge(edge);
        edge = new Edge(6, 0, 0.58);
        G.addEdge(edge);
        edge = new Edge(6, 4, 0.93);
        G.addEdge(edge);

        PrimMST mst = new PrimMST(G);
        mst.edges();
//        mst.weight();
    }

    // edge to
    private Edge[] edgeTo;
    // distTo
    private double[] distTo;
    // marked
    private boolean[] marked;
    // pq
    private IndexMinPQ<Double> pq;

    // construct
    public PrimMST(EdgeWeightedGraph G) {
        edgeTo = new Edge[G.V()];
        distTo = new double[G.V()];
        for (int v = 0; v < distTo.length; v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        marked = new boolean[G.V()];
        pq = new IndexMinPQ<Double>(G.V());

        distTo[0] = 0.0;
        pq.insert(0, 0.0);

        while (!pq.isEmpty()) {
            visit(G, pq.delMin());
        }
    }

    // visit
    public void visit(EdgeWeightedGraph G, int v) {
//        System.out.printf("visit: " + v + "     ");
        marked[v] = true;

        for (Edge e : G.adj(v)) {
            int w = e.other(v);
            if (!marked[w] && e.weight() < distTo[w]) {
//                System.out.printf("     " + e);
                edgeTo[w] = e;
                distTo[w] = e.weight();
                if (pq.contains(w)) {
                    pq.change(w, e.weight());
//                    System.out.printf("     change " + w + "with " + e);
                } else {
                    pq.insert(w, e.weight());
                }
            }
        }
        System.out.println();

    }

    // edges
    public Iterable<Edge> edges() {
        System.out.println();
        Bag<Edge> mst = new Bag<Edge>();
        for (int i = 1; i < edgeTo.length; i++) {
            Edge e = edgeTo[i];

            int v = e.either();
            int w = e.other(v);
            System.out.println(v + " " + w + " " + e.weight());
            mst.add(e);
        }
        return mst;
    }

    // weight
    public double weight() {
        double weight = 0.0;
        for (Edge e : edgeTo) {
            weight = weight + e.weight();
        }
//        System.out.println("weight = " + weight);
        return weight;
    }










}
