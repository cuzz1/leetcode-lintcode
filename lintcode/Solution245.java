public class Solution {
    /**
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T2 == null) return true;
        if (T1 == null) return false;
        if (isSame(T1, T2)) return true;
        return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
    }
    
    private boolean isSame(TreeNode T1, TreeNode T2) {
        if (T1 == null || T2 == null) return T1 == T2;
        if (T1.val != T2.val) return false;
        return isSame(T1.right, T2.right) && isSame(T1.left, T2.left);
    }
}
