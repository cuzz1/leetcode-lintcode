/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                dummy.next = l2;
                break;
            }
            
            if (l2 == null) {
                dummy.next = l1;
                break;
            }
            
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    dummy.next = l1;
                    dummy = dummy.next;
                    l1 = l1.next;
                } else {
                    dummy.next = l2;
                    dummy = dummy.next;
                    l2 = l2.next;   
                }
            }
            
        }
        return res.next;
    }
}
