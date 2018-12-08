/**
 * Definition for Doubly-ListNode.
 * public class DoublyListNode {
 *     int val;
 *     DoublyListNode next, prev;
 *     DoublyListNode(int val) {
 *         this.val = val;
 *         this.next = this.prev = null;
 *     }
 * } * Definition of TreeNode:
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
    
    private TreeNode pre = null;
    private TreeNode head = null;
    
    public DoublyListNode bstToDoublyList(TreeNode root) {
        inOrder(root);
        DoublyListNode res = null;
        DoublyListNode cur = null;
        while (head != null) {
            DoublyListNode temp = new DoublyListNode(head.val);
            if (cur == null) {
                res = temp;
                cur = temp;
            } else {
                cur.next = temp;       
                temp.prev = cur;
                cur = cur.next;
            }
            head = head.right;
        }
        return res;
    }
    
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null) pre.right = node;
        pre = node;
        if (head == null) head = node; // 保存node节点,返回
        inOrder(node.right);
    }
}
