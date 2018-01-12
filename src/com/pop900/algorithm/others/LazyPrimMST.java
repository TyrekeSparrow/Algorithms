package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Queue;
import com.pop900.algorithm.graphs.Edge;
import com.pop900.algorithm.graphs.EdgeWeightedGraph;

/**
 * Created by michael on 16-9-27.
 */
public class LazyPrimMST {
    public static void main(String[] args) {
        // print MST
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

        // get MST queue
        LazyPrimMST mst = new LazyPrimMST(G);
        double wMST = 0.0;
        for (Edge e : mst.mst) {
            int either = e.either();
            int other = e.other(either);
            double w = e.weight();
            wMST = wMST + w;
            System.out.println(either + " " + other + " weight: " + w);
        }
        // get MST weight
        System.out.println("MST weight = " + wMST);
    }

    // visit 0, add all unmarked edges to crossing edges

    // while crossing size > 0, poll minimum edge, add to mst
    // add unmarked edges to crossing edges



    // marked vertices
    private boolean[] marked;
    // mst queue
    private Queue<Edge> mst;
    // crossing edges
    private MinPQ<Edge> pq;

    // construct
    public LazyPrimMST(EdgeWeightedGraph G) {
        marked = new boolean[G.V()];
        mst = new Queue<Edge>();
        pq = new MinPQ<Edge>(G.E());
        visit(G, 0);
        while (pq.size() > 0) {
            Edge e = pq.delMin();
            int either = e.either();
            int other = e.other(either);
            if (marked[either] && !marked[other]) {
                mst.enqueue(e);
                visit(G, other);
            } else if (marked[other] && !marked[either]) {
                mst.enqueue(e);
                visit(G, either);
            } else {
                // do nothing
            }
        }
    }

    // visit
    public void visit(EdgeWeightedGraph G, int v) {
        marked[v] = true;
        for (Edge e: G.adj(v)) {
            if (!marked[e.other(v)]) {
                pq.insert(e);
            }
        }
    }

    // mst
    public Iterable<Edge> edges() {
        return mst;
    }

    // weight
    public double weight() {
        double w = 0.0;
        for (Edge e : mst) {
            w = w + e. weight();
        }
        return w;
    }




}
