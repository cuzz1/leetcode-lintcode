/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // 前序遍历 根节点->左节点->右节点
        // 中序遍历 左节点->根节点->右节点

        if (preorder == null || inorder == null) {
            throw new  IllegalArgumentException("参数有误");
        }

        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd,int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // 根节点
        TreeNode node = new TreeNode(preorder[preStart]);

        // 前序遍历 [3,9,20,15,7] ==> 3 | 9 1 | 20 15 7
        // 中序遍历 [9,3,15,20,7] ==> 9 1 | 3 | 15 20 7

        for (int i = inStart; i <= inEnd; i++) {

            if (inorder[i] == preorder[preStart]) {
                int j = i - inStart;

                node.left = buildTree(preorder, preStart + 1, preStart + j, inorder, inStart, i - 1);
                node.right = buildTree(preorder, preStart + j + 1, preEnd, inorder, i + 1, inEnd);
            }
        }

        return node;

    }

}
