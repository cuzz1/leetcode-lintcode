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

public class Solution174 {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode node1 = dummy;
        ListNode node2 = dummy;
        
        int i = 0;
        while (i < n) {
            node1 = node1.next;
            i++;
        }
        
        while (node1.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        
        node2.next = node2.next.next;
        return dummy.next;
    }
}





