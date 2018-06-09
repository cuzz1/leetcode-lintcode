package src;

import java.util.ArrayList;
import java.util.List;

import extend.TreeNode;

// 递归版本
public class Solution067 {
    /**
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    List<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;    
    }
    
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}