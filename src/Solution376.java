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


public class Solution376 {
    
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();
        
        if (root == null) {
            return res;
        }
        
        
        binaryTreePathSum(res, stack, root, target);
        

        return res;
    }
    
    private void binaryTreePathSum(List<List<Integer>> res, Stack<Integer> stack, TreeNode root, int target) {
        
        stack.push(root.val);

        
        // 子节点要满足左节点和右节点为null
        if (root.left == null && root.right == null && target == root.val ) {
            List<Integer> list = new ArrayList(stack);
            res.add(list);
        } 
        
        if (root.left != null) {
            binaryTreePathSum(res, stack, root.left, target - root.val);
        }

        
        if (root.right != null) {
            binaryTreePathSum(res, stack, root.right, target - root.val);
        }
        
        // 回溯
        stack.pop();

    }    
}






