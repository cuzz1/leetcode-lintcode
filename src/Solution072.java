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

public class Solution072 {
    /**
     * @param inorder: A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        
        TreeNode root = buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return root;
    }
    
    
    private TreeNode buildTree(int[] inorder,int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        
        
        if (inStart > inEnd && postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == postorder[postEnd]) {
                System.out.println(inorder[i]);
                root.left = buildTree(inorder, inStart, i - 1, postorder, postStart, postStart + i - 1 - inStart);
                root.right = buildTree(inorder, i + 1, inEnd, postorder, postStart + i - inStart ,postEnd - 1);
            }
        }
        return root;
    }
    
    
}




