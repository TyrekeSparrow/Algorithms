package com.michael.algorithm.graphs;

import com.michael.algorithm.fundamenal.Bag;
import com.michael.algorithm.fundamenal.Queue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by michael on 16-8-13.
 */
public class PrimMST {
    public static void main(String[] args) {
        // 4 5    0.35
        // 4 7    0.37
        // 5 7    0.28
        // 0 7    0.16
        // 1 5    0.32
        // 0 4    0.38
        // 2 3    0.17
        // 1 7    0.19
        // 0 2    0.26
        // 1 2    0.36
        // 1 3    0.29
        // 2 7    0.34
        // 6 2    0.40
        // 3 6    0.52
        // 6 0    0.58
        // 6 4    0.93

        // 8

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
        mst.showMiniEdges();







    }


//    private Edge[] edgeTo;
//    private double[] distTo;
//    private boolean[] marked;






    // get new vertex minimum edge
    // get minimum edge in all vertex edges
    // remove the minimum edge
    // if the vertex has no minimum edge add new minumu edge


    // no pq








    // mini edges stack
    // will edges



    // for vertex v
    // get minimum edge of vertex v
    // add mini v edge to will edges

    // get mini edge int will edges, add mini edge to mini edge stack
    // get minimum edge tree vertex next minimum edge
    // add it to will edges

    private Set<Edge>[] adj;

    private boolean[] marked;
    private Queue<Edge> miniEdges;
    private Set<Edge> willEdges;




    public void showMiniEdges() {
        for (Edge edge : miniEdges) {
            System.out.printf(edge.either() + "" + edge.other(edge.either()) + "---");
        }
        System.out.println();


    }


    public PrimMST(EdgeWeightedGraph G) {
        getEdges(G);
        marked = new boolean[G.V()];
        miniEdges = new Queue<Edge>();
        willEdges = new HashSet<Edge>();
        getMiniEdges(G, 0);
    }

    private void getEdges(EdgeWeightedGraph G) {
        int l = G.adj.length;
        adj = (Set<Edge>[]) new Set[l];

        for (int i = 0; i < l; i++) {
            Bag<Edge> edges = G.adj[i];
            adj[i] = new HashSet<Edge>();

            for (Bag.Node n = edges.first; n != null; n = n.next) {
                if (n.item != null) {
                    Edge e = (Edge) n.item;
                    adj[i].add(e);
                }
            }

        }





    }

    public void getMiniEdges(EdgeWeightedGraph G, int v) {
        marked[v] = true;

        // 1 get will edge
        Edge willEdge = getMiniEdge(v);
        System.out.println("willEdge = " + willEdge);
        willEdges.add(willEdge);

        // 2 get miniEdge in willEdges
        Edge miniEdge = getMiniEdgeInWillEdges();
        System.out.println("------------------miniEdge = " + miniEdge);
        miniEdges.enqueue(miniEdge);

        if (miniEdge == null) {
            return;
        }
        // 3 get another will edge
        int markedVertex = getMarkedVertex(miniEdge);
        System.out.println("markedVertex = " + markedVertex);
        Edge anotherWillEdge = getMiniEdge(markedVertex);
        System.out.println("anotherWillEdge = " + anotherWillEdge);
        if (anotherWillEdge != null) {
            willEdges.add(anotherWillEdge);
        }

        // 4 get next loop
        int either = miniEdge.either();
        int other = miniEdge.other(either);
        if (!marked[either]) {
            getMiniEdges(G, either);
        } else if (!marked[other]) {
            getMiniEdges(G, other);
        } else {




        }

















    }

    public Edge getMiniEdge(int v) {
//        System.out.printf(v + " ");

        Set<Edge> edges = adj[v];
        System.out.println(v + " edges = " + edges);

        Edge miniEdge = null;
//        double miniWeight = Double.MAX_VALUE;






        Iterator<Edge> iterator = edges.iterator();
        while (iterator.hasNext()) {
            Edge e = iterator.next();


            System.out.println("isAvailable edge = " + e);
            if (isAvailable(e, v)) {


//                System.out.printf(" " + e.other(e.either()) + " ");
//                System.out.printf(" e.weight()" + e.weight() + " ");
//                System.out.printf(" miniWeight" + miniWeight);


                if (miniEdge == null) {
                    miniEdge = e;
                } else if (e.weight() < miniEdge.weight()) {
//                    System.out.printf("<");
                    miniEdge = e;
                } else {
//                    System.out.printf(">=");

                }
//                System.out.println();

            } else {
                iterator.remove();

            }





        }





//        System.out.println("miniEdge = " + miniEdge);

        if (miniEdge != null) {
            int w = miniEdge.other(v);
//            System.out.println(v);
//            System.out.println(w);
            edges.remove(miniEdge);
            adj[w].remove(miniEdge);
        }

        return miniEdge;
    }

    public boolean isAvailable(Edge e, int eitherV) {
//        System.out.printf("isAvailable " + eitherV + " " + "edge " + e);



        // if in will edges vertex
        // is available return true;
        // not available, remove for double adj


        final int otherV = e.other(eitherV);
//        System.out.printf(otherV + " ");


        boolean isAvailable = true;

        System.out.println("willEdges = " + willEdges);
        for (Edge willEdge: willEdges) {

            int either = willEdge.either();
            int other = willEdge.other(either);
            if (either == otherV || other == otherV) {
                if (willEdge.weight() < e.weight())
                isAvailable = false;
                break;
            }
        }

//        System.out.printf(isAvailable + " ");
//        System.out.println();
        if (isAvailable) {
            return true;
        } else {

//            adj[eitherV].remove(e);
            adj[otherV].remove(e);

            return false;
        }















    }

    public int getMarkedVertex(Edge edge) {
        int v = edge.either();
        int w = edge.other(v);
        if (marked[v]) {
            return v;
        }

        if (marked[w]) {
            return w;

        }

        return -1;


    }

    private Edge getMiniEdgeInWillEdges() {
        Edge miniEdge = null;

        for (Edge e : willEdges) {
            if (miniEdge == null) {
                miniEdge = e;
            } else if (e.weight() < miniEdge.weight()) {
                miniEdge = e;
            } else {

            }





        }
        willEdges.remove(miniEdge);







        return miniEdge;
    }





































}
