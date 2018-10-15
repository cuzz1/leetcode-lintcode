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


public class Solution088 {
    /*
     * @param root: The root of the binary search tree.
     * @param A: A TreeNode in a Binary.
     * @param B: A TreeNode in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        if (root == null) {
            return null;
        } 
    
        if (root == A || root == B) {
            return root;
        }
        
        // 左子数中是否存在最先找到p,q中的一个节点
        TreeNode leftNode = lowestCommonAncestor(root.left, A, B);
        // 右子数中是否存在最先找到p,q中的一个节点
        TreeNode rightNode = lowestCommonAncestor(root.right, A, B);

        // 在当前左右节点都找到一个 返回当前节点
        if (leftNode != null && rightNode != null) {
            return root;
        }
        
        // 如果在左节点或者右节点找到一个，说明还有一个节点在当前节点的下面
        return leftNode != null ? leftNode : rightNode;
        
    }
}












