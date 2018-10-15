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

public class Solution036 {
    /**
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        
        int i = 1;
        for (; i < m; i++) {
            pre = pre.next;
        }
        
        
        
        ListNode cur = pre.next;
        ListNode pre2 = cur;
        
        ListNode node = null;
        
        for (; i <= n && cur != null; i++) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = node;
            node = temp;
        }
        // node2 cur
        // pre -> node2  
        pre.next = node;
        pre2.next = cur;
        
        
        return dummy.next;

    }
    

}