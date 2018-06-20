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

public class Solution452 {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        ListNode pre = dummy;
        while(pre.next != null) {
            if (pre.next.val == val) {
                ListNode node = pre.next;
                pre.next = node.next;
                node.next = null;
            } else {
                pre = pre.next;
            }
            
        }
        return dummy.next;
    }
}