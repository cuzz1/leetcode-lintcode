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
     * @param inorder: A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTree(int[] preorder, int start1, int end1, int[] inorder, int start2, int end2) {
        if (start1 > end1 || start2 > end2) return null;
        TreeNode root = new TreeNode(preorder[start1]);
        for (int i = start2; i <= end2; i++) {
            if (inorder[i] == preorder[start1]) {
                root.left = buildTree(preorder, start1 + 1, start1 + i - start2, inorder, start2, i - 1);
                root.right = buildTree(preorder, start1 + i - start2 + 1, end1, inorder, i + 1, end2);
            }
        }
        return root;
    }
}
