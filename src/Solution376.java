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
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        if (root == null) {
            return res;
        }
        
        binaryTreePathSum(root, target, stack, res);
        
        return res;
    }
    
    private void binaryTreePathSum(TreeNode root, int target, Stack<Integer> stack, List<List<Integer>> res) {
        stack.push(root.val);
        
        // 子节点满足左节点和右节点为null且 target == root.val
        if (root.left == null && root.right == null && target == root.val) {
            List<Integer> list = new ArrayList(stack);
            res.add(list);
        }
        
        if (root.left != null) {
            binaryTreePathSum(root.left, target - root.val, stack, res);
        }
        
        if (root.right != null) {
            binaryTreePathSum(root.right, target - root.val, stack, res);
        }
        
        // 回溯
        stack.pop();
    }
    
}
