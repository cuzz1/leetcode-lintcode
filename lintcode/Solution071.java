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

public class Solution071 {
    
    private List<List<Integer>> res = new ArrayList<>();
    
    /**
     * @param root: A Tree
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        
        Queue<Tuple<TreeNode, Integer>> queue = new LinkedList<>();
        
        queue.offer(new Tuple(root, 0));
        
        while (!queue.isEmpty()) {
            Tuple<TreeNode, Integer> tuple = queue.poll();
            TreeNode node = tuple.getFirst();
            Integer level = tuple.getSecond();
            
            if (level == res.size()) {
                res.add(new ArrayList());
            }
            
            List<Integer> list = res.get(level);
            
            if (level % 2 == 0) {        // 0 2 4 从左往右  往尾部插入
                list.add(node.val);
            } else {                    // 1 3 5 从右往左  往头部插入
                list.add(0, node.val);
            }
            
            // 添加node的左孩子到队列中
            if (node.left != null) {
                queue.offer(new Tuple<TreeNode, Integer>(node.left, level + 1));    
            }
            // 添加node的右孩子到队列中
            if (node.right != null) {
                queue.offer(new Tuple<TreeNode, Integer>(node.right, level + 1));    
            }
            
            
        }
        return res;
    }
    
    public class Tuple<A, B> {
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







