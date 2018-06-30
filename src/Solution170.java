package src;

import extend.ListNode;

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution170 {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        int length = getLength(head);
        k = k % length;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        
        for (int i = 0; i < length - k; i++) {
            pre = pre.next;
        }
        
        print(pre);
        
        head = pre.next;
        print(head);
        pre.next = null;
        
        ListNode dummy1 = new ListNode(0);
        dummy1.next = head;
        ListNode cur = dummy1;
        
        while (cur.next != null) {
            cur = cur.next;
        }
        print(cur);
        cur.next = dummy.next;
        print(cur);
        return dummy1.next;
    }
    
    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length ++;
        }
        return length;
    }
    
    private void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println();
    }
}



