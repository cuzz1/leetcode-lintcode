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

public class Solution {
    /**
     * @param root: The root of tree
     * @return: the head of doubly list node
     */
    public DoublyListNode bstToDoublyList(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        return build(list);
    }
    
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    
    private DoublyListNode build(List<Integer> list) {
        if (list == null || list.size() == 0) return null;
        DoublyListNode node = new DoublyListNode(list.get(0));
        DoublyListNode cur = node;
        for (int i = 1; i < list.size(); i++) {
            DoublyListNode temp = new DoublyListNode(list.get(i)); 
            cur.next = temp;
            temp.prev = cur;
            cur = cur.next;
        }
        return node;
    }
}
