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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);

        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int a1 = l1 == null ? 0 : l1.val;
            int a2 = l2 == null ? 0 : l2.val;

            int sum = a1 + a2 + carry;

            int val = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(val);
            cur.next = node;
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }

        return pre.next;

    }
}
