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
        ListNode pre = dummy;
        int i = 1;
        while (i < m) {
            pre = pre.next;
            i++;
        }
        ListNode node1 = pre;
        ListNode cur = pre.next;
        
        ListNode node2 = null;
        ListNode node3 = null;
        
        while (i <= n) {
            if (i == m) {
                node3 = cur;
            }
            ListNode next = cur.next;
            cur.next = node2;
            node2 = cur;
            cur = next;
            i++;
        }
        
        node1.next = node2;
        node3.next = cur;
        return dummy.next;
    }
}
