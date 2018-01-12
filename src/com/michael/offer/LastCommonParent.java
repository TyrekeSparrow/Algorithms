package com.michael.offer;

import com.michael.offer.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class LastCommonParent {
    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode('A');
        TreeNode nodeB = new TreeNode('B');
        TreeNode nodeC = new TreeNode('C');
        TreeNode nodeD = new TreeNode('D');
        TreeNode nodeE = new TreeNode('E');
        TreeNode nodeF = new TreeNode('F');
        TreeNode nodeG = new TreeNode('G');
        TreeNode nodeH = new TreeNode('H');
        TreeNode nodeI = new TreeNode('I');
        TreeNode nodeJ = new TreeNode('J');

        nodeA.nodes = new TreeNode[] {nodeB, nodeC};
        nodeB.nodes = new TreeNode[] {nodeD, nodeE};
        nodeD.nodes = new TreeNode[] {nodeF, nodeG};
        nodeE.nodes = new TreeNode[] {nodeH, nodeI, nodeJ};

        Tree tree = new Tree(nodeA);
        TreeNode node = getLastSameParent(tree, nodeG, nodeI);
        System.out.println(node.value);
    }

    private static TreeNode getLastSameParent(Tree tree, TreeNode node1, TreeNode node2) {
        if (tree == null) return null;
        if (node1 == null) return null;
        if (node2 == null) return null;


        Deque<TreeNode> path1 = new ArrayDeque<TreeNode>();
        getPath(path1, tree.root, node1);
        for (TreeNode node : path1) {
            System.out.printf(" " + node.value);
        }
        System.out.println();

        Deque<TreeNode> path2 = new ArrayDeque<TreeNode>();
        getPath(path2, tree.root, node2);
        for (TreeNode node : path2) {
            System.out.printf(" " + node.value);
        }
        System.out.println();

        TreeNode sameNode = null;
        while (path1.getLast() == path2.getLast()) {
            sameNode = path1.getLast();
            path1.removeLast();
            path2.removeLast();
        }

        return sameNode;
    }

    private static boolean getPath(Deque<TreeNode> path, TreeNode node, TreeNode target) {
        if (node == null) return false;

        if (node == target) {
            path.add(node);
            return true;
        } else {
            boolean hasNode = false;
            if (node.nodes != null) {
                for (TreeNode son : node.nodes) {
                    hasNode = getPath(path, son, target);
                    if (hasNode) {
                        path.add(node);
                        break;
                    }
                }
            }
            return hasNode;
        }
    }


}
