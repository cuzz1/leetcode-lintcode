/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || k == 0) {
            return head;
        }
        
        ListNode cur = head;
        // 先把他形成一个环
        int count = 1;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        cur.next = head;
        
        cur = head;
        for (int i = 1; i < count - (k % count); i++) {
            cur = cur.next;
        }
        head = cur.next;
        cur.next = null;
        return head;
    }
}
