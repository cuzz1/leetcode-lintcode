/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {

        // 创建一个前节点，防止head为null
        ListNode node = new ListNode(0);
        node.next = head;

        ListNode curr = head;
        ListNode pre = node;


        // 4 5 1 9
        while (curr != null) {
            if (curr.val == val) {
                pre.next = curr.next;
                break;
            }
            pre = curr;
            curr = curr.next;
        }

        return node.next;
    }
}
