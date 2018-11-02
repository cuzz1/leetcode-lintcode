/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode res = lists[0];
        for (int i = 1; i < lists.length; i++) {
            res = mergeTwo(res, lists[i]);
        }
        return res;
    }
    
    private ListNode mergeTwo(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        while (first != null && second != null) {
            if (first.val < second.val) {
                cur.next = first;
                first = first.next;
                cur = cur.next;
            } else {
                cur.next = second;
                second = second.next;
                cur = cur.next;
            }
        }
        if (first != null) {
            cur.next = first;
        }
        if (second != null) {
            cur.next = second;
        }
        
        return dummy.next;
    }
}
