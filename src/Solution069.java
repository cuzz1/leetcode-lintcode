package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class Solution069 {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    private List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<Tuple<TreeNode, Integer>> queue = new LinkedList<>();
        
        if (root == null) {
            return res;
        }
        
        queue.offer(new Tuple(root, 0));
        
        while (!queue.isEmpty()) {
            Tuple<TreeNode, Integer> tuple = queue.poll();
            TreeNode node = tuple.getFirst();
            Integer level = tuple.getSecond();
            
            // 如果层数与size相等说明需要添加一个List
            if (level == res.size()) {
                res.add(new ArrayList<Integer>());
            }
            
            res.get(level).add(node.val);
            
            // 如果左节点不为空
            if (node.left != null) {
                queue.offer(new Tuple(node.left, level + 1));
            }
            
            // 如果右节点不为空
            if (node.right != null) {
                queue.offer(new Tuple(node.right, level + 1));
            }
        }
        return res;
        
    }
    
    // 内部类
    private class Tuple<A, B> {
        private A first;
        private B second;
        
        public Tuple(A first, B second) {
            this.first = first;
            this.second = second;
        }
        
        public A getFirst() {
            return first;
        }
        
        public B getSecond() {
            return second;
        }
    
    }
    

}