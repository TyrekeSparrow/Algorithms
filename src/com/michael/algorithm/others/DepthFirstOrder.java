package com.michael.algorithm.others;

import com.michael.algorithm.fundamenal.Queue;
import com.michael.algorithm.fundamenal.Stack;
import com.michael.algorithm.graphs.Digraph;

/**
 * Created by michael on 16-9-9.
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

    // marked
    private boolean[] marked;
    // pre
    private Queue<Integer> pre;
    // post
    private Queue<Integer> post;
    // reverse post
    private Stack<Integer> reversePost;

    // construct
    public DepthFirstOrder(Digraph G) {
        marked = new boolean[G.V()];

        pre = new Queue<Integer>();
        post = new Queue<Integer>();
        reversePost = new Stack<Integer>();

        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                System.out.println("reversePost");
                dfs(G, v);
                System.out.println();
            }
        }
    }

    // dfs
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
        System.out.printf(" " + v);
    }

    // pre
    public Iterable<Integer> pre() {
        return pre;
    }

    // post
    public Iterable<Integer> post() {
        return post;
    }

    // reverse post
    public Iterable<Integer> reversePost() {
        return reversePost;
    }

    public void showAll() {
//        pre.showAll();
//        post.showAll();
        reversePost.showAll();
    }




}
