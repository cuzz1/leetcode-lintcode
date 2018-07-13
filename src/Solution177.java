package src;

import extend.TreeNode;

public class Solution177 {
    /*
     * @param A: an integer array
     * @return: A tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        
        return helper(A, 0, A.length - 1);
    }
    
    private TreeNode helper(int[] A, int left, int right) {
        if (right < left) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = helper(A, left, mid - 1);
        root.right = helper(A, mid + 1, right);
        
        return root;
    }
}
