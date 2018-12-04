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
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int index = 1;
        
        while (index < m) {
            cur = cur.next;
            index++;
        }
        
        ListNode node1 = cur;
        cur = cur.next;
        node1.next = null;
        
        ListNode node2 = null;
        
        ListNode node3 = null;
        while (index <= n) {
            if (index == m) {
                node3 = cur;
            }
            ListNode next = cur.next;
            cur.next = node2;
            node2 = cur;
            cur = next;
            index++;
        }
        
        node1.next = node2;
        node3.next = cur;
        return dummy.next;
    }
}
