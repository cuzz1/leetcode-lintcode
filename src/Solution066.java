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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        preorder(root, list);
        return list;
    }
    
    private void preorder(TreeNode root, List list) {
        list.add(root.val);
        if (root.left != null) {
            preorder(root.left, list);
        }
        if (root.right != null) {
            preorder(root.right, list);
        }
    }

    
}
