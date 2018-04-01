package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import extend.TreeNode;

public class Solution066 {
	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		
		if (root == null) {
			return list;
		}
		
		// 先把跟节点放进去
		stack.push(root);
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			
			if (node.right != null) {
				stack.push(node.right); 
			}
			
			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return list;
	}
}
