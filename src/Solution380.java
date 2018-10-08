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
        if (headA == null || headB == null) {
            return null;
        }
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        
        // 如果链表A的长度大于链表B长度
        if (lengthA >= lengthB) {
            int len = lengthA - lengthB;
            while (len > 0) {
                headA = headA.next;
                len--;
            }
        }
        
        // 如果链表B的长度大于链表A长度
        if (lengthA < lengthB) {
            int len = lengthB - lengthA;
            while (len > 0) {
                headB = headB.next;
                len--;
            }
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;   
        
    }
    
    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}
