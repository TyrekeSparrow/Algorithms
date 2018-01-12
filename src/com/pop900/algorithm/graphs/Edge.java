package com.pop900.algorithm.graphs;

/**
 * Created by michael on 16-8-13.
 */
public class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public int either() {
        return v;
    }

    public int other(int vertex) {
        if (vertex == v) return w;
        else if (vertex == w) return v;
        else return -1;


    }

    @Override
    public int compareTo(Edge that) {
        if (weight() < that.weight()) return -1;
        else if (weight() > that.weight()) return 1;
        else return 0;
    }

    public String toString() {
        return String.format("%d-%d %.2f", v, w, weight);
    }
}
