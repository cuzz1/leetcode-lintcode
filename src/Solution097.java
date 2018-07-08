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

public class Solution097 {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // 左子树
        int leftMaxDepth = maxDepth(root.left);
        // 右子树
        int rightMaxDepth = maxDepth(root.right);
        
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}






