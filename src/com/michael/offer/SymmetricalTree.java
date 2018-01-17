package com.michael.offer;

import com.michael.offer.Tree.TreeNode;
import com.michael.algorithm.fundamenal.Queue;

/**
 * Created by michael on 17-11-25.
 */
public class SymmetricalTree {
    public static void main(String[] args) {
        TreeNode node00 = new TreeNode(8);
        TreeNode node10  = new TreeNode(6);
//        TreeNode node11 = new TreeNode(6);
        TreeNode node11 = new TreeNode(9);
        TreeNode node20 = new TreeNode(5);
        TreeNode node21 = new TreeNode(7);
        TreeNode node22 = new TreeNode(7);
        TreeNode node23 = new TreeNode(5);

        node00.left = node10;
        node00.right = node11;
        node10.left = node20;
        node10.right = node21;
        node11.left = node22;
        node11.right = node23;

        Tree tree = new Tree(node00);
        boolean isSymmetrical = isSymmetrical(tree);
        System.out.println("isSymmetrical = " + isSymmetrical);

    }

    public static boolean isSymmetrical(Tree tree) {
        Queue<TreeNode> preLeftRight = tree.preLeftRight();
        Queue<TreeNode> preRightLeft = tree.preRightLeft();

        TreeNode node = null;
        boolean isSymmetrical = true;
        while ((node = preLeftRight.dequeue()) != null) {
            TreeNode symmetricalNode = preRightLeft.dequeue();
            if (symmetricalNode != null && (int)node.value == (int)symmetricalNode.value) {
                // do nothing
                System.out.println("value = " + node.value);
            } else {
                isSymmetrical = false;
            }
        }

        return isSymmetrical;
    }
}
