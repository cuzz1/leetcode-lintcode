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
 * Definition for Doubly-ListNode.
 * public class DoublyListNode {
 *     int val;
 *     DoublyListNode next, prev;
 *     DoublyListNode(int val) {
 *         this.val = val;
 *         this.next = this.prev = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param root: The root of tree
     * @return: the head of doubly list node
     */
    public DoublyListNode bstToDoublyList(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midOrder(root, list);
        
        DoublyListNode res = createDoublyListNode(list);
        
        return res;
    }
    
    private void midOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        
        if (root.left != null) {
            midOrder(root.left, list);
        }
        list.add(root.val);
        
        if (root.right != null) {
            midOrder(root.right, list);
        }
    }
    
    private DoublyListNode createDoublyListNode(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        
        DoublyListNode head = null;
        
        if (list.size() == 1) {
            return new DoublyListNode(list.get(0));
        } 
        
        
        DoublyListNode p = null;
        for (int i = 0; i < list.size(); i++) {
            DoublyListNode listNode = new DoublyListNode(list.get(i));
            if (i == 0) {
                head = listNode;
                p = head;
            } else {
                p.next = listNode;
                listNode.prev = p;
                p = p.next;
            }
        }
        return head;
    }
}






















