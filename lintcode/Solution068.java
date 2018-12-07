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
        List<Integer> list = new ArrayList<>();
        postorder(list, root);
        return list;
    }
    
    private void postorder(List<Integer> list, TreeNode node) {
        if (node == null) return;
        if (node.left != null) postorder(list, node.left);
        if (node.right != null) postorder(list, node.right);
        list.add(node.val);
    }
    
}
