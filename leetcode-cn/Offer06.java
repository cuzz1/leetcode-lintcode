/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while(node != null) {
            count++;
            node = node.next;
        }

        int[] res = new int[count];

        int index = count - 1;
        while(head != null) {
            res[index] = head.val;
            head = head.next;
            index--;
        }
        return res;
    }
}
