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

public class Solution073 {
    /**
     * @param inorder: A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = buildTree(preorder, 0, preorder.length - 1,
                                  inorder, 0, inorder.length - 1);
        return root; 
    }
    
    private TreeNode buildTree(int[] preorder, int startPre, int endPre,
                               int[] inorder, int startIn, int endIn) {
                                 
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        
        // 根节点
        TreeNode root = new TreeNode(preorder[startPre]);
        
        for (int i = startIn; i <= endIn; i++) {
            if (inorder[i] == preorder[startPre]) {
                root.left = buildTree(preorder, startPre + 1, startPre + i - startIn,
                                     inorder, startIn, i - 1);
                root.right = buildTree(preorder, startPre + i - startIn + 1, endPre,
                                        inorder, i + 1, endIn);
            }
        }
        return root;
    }
    
    
    
}