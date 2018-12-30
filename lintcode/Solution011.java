public class Solution {
    /**
     * @param root: param root: The root of the binary search tree
     * @param k1: An integer
     * @param k2: An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        List<Integer> list = new ArrayList<>();
        helper(list, root, k1, k2);
        return list;
    }
    
    private void helper(List<Integer> list, TreeNode root, int k1, int k2) {
        if (root == null) return;
        if (k1 <= root.val && root.val <= k2) {
            list.add(root.val);
        }
        helper(list, root.left, k1, k2);
        helper(list, root.right, k1, k2);
    }
}
