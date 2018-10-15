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
        if (root != null) {
            helper(root, target, stack, res);
        }
        return res;
    }
    
    private void helper(TreeNode root, int target, Stack<Integer> stack, List<List<Integer>> res) {
        
         stack.push(root.val);

         if (root.left == null && root.right == null && root.val == target) {
             List<Integer> list = new ArrayList<>(stack);
             res.add(list);
         }
         
         
         // 左节点
         if (root.left != null) {
             helper(root.left, target - root.val, stack, res);
         }
         
         // 右节点
         if (root.right != null) {
             helper(root.right, target - root.val, stack, res);
         }
         
         // 回溯
         stack.pop();
    }

}

























