public class Solution {

    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null || A.length == 0) return null;
        return helper(A, 0, A.length - 1);
    }
    
    private TreeNode helper(int[] A, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(A[mid]);
        node.left = helper(A, start, mid - 1);
        node.right = helper(A, mid + 1, end);
        return node;
    }
}
