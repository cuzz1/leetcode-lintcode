package src;

import extend.TreeNode;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class SolutionI317 {
    /**
     * @param root: root of complete binary tree
     * @return: the number of nodes
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}