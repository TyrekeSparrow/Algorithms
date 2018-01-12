package com.pop900.algorithm.others;

import com.pop900.algorithm.fundamenal.Queue;
import com.pop900.algorithm.fundamenal.UF;
import com.pop900.algorithm.graphs.Edge;
import com.pop900.algorithm.graphs.EdgeWeightedGraph;

/**
 * Created by michael on 16-10-9.
 */
public class KruskalMST {
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

        KruskalMST mst = new KruskalMST(G);
        mst.showAll();




    }

    // get min edge
    // check vertices is connected
    // if unconnected, union and enqueue

    // MST
    private Queue<Edge> mst;

    // construct
    public KruskalMST(EdgeWeightedGraph G) {
        mst = new Queue<Edge>();
        MinPQ<Edge> pq = new MinPQ<Edge>(G.E());
        for (Edge e : G.edges()) {
            pq.insert(e);
        }
        UF uf = new UF(G.V());

        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);


            if (!uf.connected(v, w)) {
//                System.out.println(v + "-" + w + "not connected");
                uf.union(v, w);
//                System.out.println(" union " + v + " " + w);
                mst.enqueue(e);
            } else {
//                System.out.println(v + " " + w + "connected");

            }
//            System.out.printf(v + " = " + uf.find(v) + " " + w + " = " + uf.find(w));
//            System.out.println();
        }


    }

    // get MST
    public Iterable<Edge> edges() {
        return mst;
    }

    public void showAll() {
        for (Edge e : mst) {
            int v = e.either();
            int w = e.other(v);
            System.out.printf(v + "-" + w + " weight: " + e.weight());
            System.out.println();
        }
    }

    // get weight
    public double weight() {
        double weight = 0.0d;
        for (Edge e: mst) {
            if (e != null) {
                weight = weight + e.weight();
            }
        }
        return weight;
    }
}
