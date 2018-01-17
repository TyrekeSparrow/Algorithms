package com.michael.algorithm.graphs;

import com.michael.algorithm.fundamenal.Queue;
import com.michael.algorithm.fundamenal.Stack;

/**
 * Created by michael on 16-8-12.
 */
public class DepthFirstOrder {
    public static void main(String[] args) {
        Digraph G = new Digraph(13);
        G.addEdge(0, 6);
        G.addEdge(0, 1);
        G.addEdge(0, 5);
        G.addEdge(2, 3);
        G.addEdge(2, 0);
        G.addEdge(3, 5);
        G.addEdge(5, 4);
        G.addEdge(6, 9);
        G.addEdge(6, 4);
        G.addEdge(7, 6);
        G.addEdge(8, 7);
        G.addEdge(9, 12);
        G.addEdge(9, 10);
        G.addEdge(9, 11);
        G.addEdge(11, 12);

        DepthFirstOrder order = new DepthFirstOrder(G);
        order.showAll();

    }



    private boolean[] marked;

    private Queue<Integer> pre; // vertices in preorder
    private Queue<Integer> post; // vertices in postorder
    private Stack<Integer> reversePost; // vertices in reverse postorder

    public DepthFirstOrder(Digraph G) {
        pre = new Queue<Integer>();
        post = new Queue<Integer>();
        reversePost = new Stack<Integer>();
        marked = new boolean[G.V()];

        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) dfs(G, v);
        }
        System.out.println();




    }

    public void dfs(Digraph G, int v) {
        pre.enqueue(v);


        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }

        post.enqueue(v);
        reversePost.push(v);
    }

    public Iterable<Integer> pre() {

        return pre;



    }

    public Iterable<Integer> post() {

        return post;


    }

    public Iterable<Integer> reversePost() {
        return reversePost;

    }

    public void showAll() {
        pre.showAll();
        post.showAll();
        reversePost.showAll();
    }




}
