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

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode p = dummy;
        ListNode q = dummy;
        
        int i = 0;
        while (i < n) {
            q = q.next;
            i ++;
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        
        p.next = p.next.next;
        return dummy.next;
    }
}




