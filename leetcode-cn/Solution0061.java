/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null) return null;

        ListNode curr = head;
        ListNode tail = null;
        int size = 0;
        while (curr != null) {
            size++;
            tail = curr;
            curr = curr.next;
        }

        k = k % size;
        if (k == 0) {
            return head;
        }

        // 需要移动的数
        int n = size - k - 1;
        curr = head;
        while (n > 0) {
            n--;
            curr = curr.next;
        }

        ListNode next = curr.next;
        curr.next = null;

        tail.next = head;

        return next;
    }
}
