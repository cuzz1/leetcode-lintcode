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
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        return lenA > lenB ? helper(headA, headB, lenA - lenB) : helper(headB, headA, lenB - lenA);
    }
    
    private ListNode helper(ListNode headA, ListNode headB, int len) {
        while (len-- > 0) {
            headA = headA.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA == headB ?  headA : null;
    }
    
    private int getLength(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}
