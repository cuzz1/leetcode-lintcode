package src;

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

import java.util.ArrayList;
import java.util.Stack;

import extend.TreeNode;

public class Solution007 {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    TreeNode node = null;
    public String serialize(TreeNode root) {
        node = root;
        if (root == null) {
            return "{}";
        }
       
        Stack<TreeNode> stack = new Stack<TreeNode>();
        StringBuilder sb = new StringBuilder();
        
        stack.push(root);
       sb.append("{");
        
       TreeNode cur = null;
        
        while (!stack.isEmpty()) {
            cur = stack.pop();
            if (cur != null) {
                sb.append(cur.val + ",");
                stack.push(cur.right);
                stack.push(cur.left);
            } else {
                if (stack.size() != 1) {
                    sb.append("#,");
                }
            }

            
        }
        sb.delete(sb.length()-1,sb.length());
        sb.append("}");
       // sb.replace(sb.length()-1, sb.length(), "}");
        System.out.println(sb.toString() + "**********"); 
        return sb.toString();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        if (data.equals("{}")) {
            return null;
        }
        String str = data.substring(1, data.length()-1);
        // System.out.println(str); 
        String[] strArray = str.split(",");
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(strArray[0]));

        queue.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < strArray.length; i++) {
           if (!"#".equals(strArray[i])) {
               TreeNode node = new TreeNode(Integer.parseInt(strArray[i]));
               if (isLeftChild) {
                   queue.get(index).left = node;
               } else {
                   queue.get(index).right = node;
               }
               queue.add(node);
           } 
           if (!isLeftChild) {
               index++;
           }
           isLeftChild = !isLeftChild;
        }
        
        return root;
    }
}