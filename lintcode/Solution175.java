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

public class Solution175 {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
}