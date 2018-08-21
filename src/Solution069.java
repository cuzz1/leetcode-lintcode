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

public class Solution {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Tuple<TreeNode, Integer>> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        
        queue.offer(new Tuple<TreeNode, Integer>(root, 0));
        
        while (!queue.isEmpty()) {
            Tuple<TreeNode, Integer> tuple = queue.poll();
            TreeNode node = tuple.getFirst();
            Integer level = tuple.getSecond();
            // 添加一个list
            if (level == res.size()) {
                res.add(new ArrayList<Integer>());
            }
            
            res.get(level).add(node.val);
            
            if (node.left != null) {
                queue.offer(new Tuple<TreeNode, Integer>(node.left, level + 1));
            }
            
            if (node.right != null) {
                queue.offer(new Tuple<TreeNode, Integer>(node.right, level + 1));
            }
        }
        return res;
    }
    
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
