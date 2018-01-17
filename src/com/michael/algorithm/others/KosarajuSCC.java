package com.michael.algorithm.others;

import com.michael.algorithm.graphs.Digraph;

/**
 * Created by michael on 16-9-22.
 */
public class KosarajuSCC {
    public static void main(String[] args) {
        Digraph G = new Digraph(13);
        G.addEdge(0 ,1);
        G.addEdge(0, 5);
        G.addEdge(2, 0);
        G.addEdge(2, 3);
        G.addEdge(3, 2);
        G.addEdge(4, 2);
        G.addEdge(4, 3);
        G.addEdge(5, 4);
        G.addEdge(6, 0);
        G.addEdge(6, 4);
        G.addEdge(6, 9);
        G.addEdge(7, 6);
        G.addEdge(7, 8);
        G.addEdge(8, 7);
        G.addEdge(8, 9);
        G.addEdge(9, 10);
        G.addEdge(9, 11);
        G.addEdge(10, 12);
        G.addEdge(11, 4);
        G.addEdge(11, 12);
        G.addEdge(12, 9);

        KosarajuSCC scc = new KosarajuSCC(G);
//        scc.showAll();

        //        order.showAll();
//        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.showAll();







    }

    // reached vertices
    private boolean[] marked;
    // component identifiers
    private int[] id;
    // number of strong connected components
    private int count;

    // Kosaraju SCC construct
    public KosarajuSCC(Digraph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];

        DepthFirstOrder order = new DepthFirstOrder(G);
//        for (int s : order.reversePost()) {
//            if (!marked[s]){
//                dfs(G, s);
//                count++;
//            }
//        }
    }

    // dfs
    public void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w: G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    // is strongly connected
    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    // component id
    public int id(int v) {
        return id[v];
    }

    // component count
    public int count() {
        return count;
    }

    // show all components
    public void showAll() {
        System.out.println(count + " components");
        for (int i = 0; i < count; i++) {
            System.out.printf("component " + i + ":");
            for (int j = 0; j < id.length; j++){
                if (id(j) == i) {
                    System.out.printf(" " + j);
                }
            }
            System.out.println();
        }
    }








}
