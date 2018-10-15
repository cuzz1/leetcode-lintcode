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
     * @param root: The root of binary tree
     * @return: root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = new TreeNode(root.val);
        node.left = cloneTree(root.left);
        node.right = cloneTree(root.right);
        return  node;
    }
    

}
