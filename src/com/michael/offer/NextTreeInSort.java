//package com.michael.offer;
//
//import com.michael.offer.Tree.TreeNode;
//
//
///**
// * Created by michael on 17-10-15.
// */
//public class NextTreeInSort {
//    public static void main(String[] args) {
//        // input
//        // output
//
//        TreeNode<Character> nodeA = new TreeNode<>('a');
//        TreeNode<Character> nodeB = new TreeNode<>('b');
//        TreeNode<Character> nodeC = new TreeNode<>('c');
//        TreeNode<Character> nodeD = new TreeNode<>('d');
//        TreeNode<Character> nodeE = new TreeNode<>('e');
//        TreeNode<Character> nodeF = new TreeNode<>('f');
//        TreeNode<Character> nodeG = new TreeNode<>('g');
//        TreeNode<Character> nodeH = new TreeNode<>('h');
//        TreeNode<Character> nodeI = new TreeNode<>('i');
//
//        nodeA.left = nodeB;
//        nodeB.parent = nodeA;
//        nodeA.right = nodeC;
//        nodeC.parent = nodeA;
//        nodeB.left = nodeD;
//        nodeD.parent = nodeB;
//        nodeB.right = nodeE;
//        nodeE.parent = nodeB;
//
//        nodeE.left = nodeH;
//        nodeH.parent = nodeE;
//        nodeE.right = nodeI;
//        nodeI.parent = nodeE;
//        nodeC.left = nodeF;
//        nodeF.parent = nodeC;
//        nodeC.right = nodeG;
//        nodeG.parent = nodeC;
//
//        Tree tree = new Tree(nodeA);
//        Node node = tree.getNextInSortNode(nodeF);
//        System.out.println("node = " + node);
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//
//}
//
