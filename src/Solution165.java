package src;

import extend.ListNode;

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
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        
        List<Integer> list3 = new ArrayList<>();
        int p = 0;
        int q = 0;
        while (p < list1.size() && q < list2.size()) {
            if (list1.get(p) < list2.get(q)) {
                list3.add(list1.get(p));
                p++;
            } else {
                list3.add(list2.get(q));
                q++;
            }
        }
        
        while (p < list1.size()) {
            list3.add(list1.get(p));
            p++;
        }
        
        while (q < list2.size()) {
            list3.add(list2.get(q));
            q++;
        }
        
        ListNode head = new ListNode(list3.get(0));
        ListNode node = head;
        for (int i = 1; i < list3.size(); i++) {
            node.next = new ListNode(list3.get(i));
            node= node.next;
        }
        return head;
    }
}















