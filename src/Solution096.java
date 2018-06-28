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

public class Solution096 {
    /**
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        ListNode dummy1 = new ListNode(0);
        ListNode pre1 = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode pre2 = dummy2;
        
        while (pre.next != null) {
            if (pre.next.val < x) {
                pre1.next = pre.next;
                pre1= pre1.next;
            } else {
                pre2.next = pre.next;
                pre2 = pre2.next;
            }
            pre = pre.next;
        }
        
        pre1.next = dummy2.next;
        pre2.next = null;
        return dummy1.next;
    }
}



