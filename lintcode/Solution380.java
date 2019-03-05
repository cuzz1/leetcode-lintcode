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
        
        return lenA > lenB ? getNode(headA, headB, lenA - lenB) : getNode(headB, headA, lenB - lenA);
    }
    
    private ListNode getNode (ListNode headA, ListNode headB, int fast) {
        while (fast > 0) {
            headA = headA.next;
            fast--;
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    
    private int getLength(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
