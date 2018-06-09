package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class Solution066 {
    /**
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    List<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        preorder(root);
        return list;
    }
    
    private void preorder(TreeNode root) {
        
        if (root == null) {
            return;
        }
        
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    
}