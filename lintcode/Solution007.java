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
  
    public String serialize(TreeNode root) {
        if (root == null) return "{}";
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                sb.append(node.val+",");
                queue.offer(node.left);
                queue.offer(node.right);
            } 
            // 最后一个不用加
            if (node == null) {
                sb.append("#,");
            }
        }
        while (sb.substring(sb.length()-1).equals(",") || sb.substring(sb.length()-1).equals("#")) {
            sb.delete(sb.length()-1, sb.length());
        }
        
        sb.append("}");
        return sb.toString();
    }

  
    public TreeNode deserialize(String data) {
        if (data == null || data.length() <= 2) return null;
        String[] strs = data.substring(1, data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.valueOf(strs[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < strs.length && !queue.isEmpty()) {
            TreeNode node = queue.poll();
            node.left = i < strs.length && !"#".equals(strs[i]) ? new TreeNode(Integer.valueOf(strs[i])) : null;
            if (node.left != null) queue.offer(node.left);
            i++;
            node.right = i < strs.length && !"#".equals(strs[i]) ? new TreeNode(Integer.valueOf(strs[i])) : null;
            if (node.right != null) queue.offer(node.right);
            i++;
        }
        return root;
    }
}
