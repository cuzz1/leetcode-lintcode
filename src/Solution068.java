package src;

import java.util.ArrayList;
import java.util.List;

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

public class Solution068 {
    /**
     * @param root: A Tree
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    
    private void helper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            helper(node.left, list);
        }
        
        if (node.right != null) {
            helper(node.right, list);
        } 
        list.add(node.val);
    }
}