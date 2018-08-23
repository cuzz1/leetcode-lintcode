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
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        helper(root, res);
        return res;
    }
    
    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        
        if (root.left != null) {
            helper(root.left, res);
        }
        
        if (root.right != null) {
            helper(root.right, res);
        }
        
        res.add(root.val);
    }
}
