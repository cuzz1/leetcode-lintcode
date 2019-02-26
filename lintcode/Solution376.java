public class Solution {
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        helper(res, new ArrayList<Integer>(), root, target);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, TreeNode root, int target) {
        list.add(root.val);
        
        if (root.left == null && root.right == null && root.val == target) {
            res.add(new ArrayList(list));
        }
        
        if (root.left != null) {
            helper(res, list, root.left, target - root.val);
        }
        
        if (root.right != null) {
            helper(res, list, root.right, target - root.val);
        }
        list.remove(list.size() - 1);
    }
}
