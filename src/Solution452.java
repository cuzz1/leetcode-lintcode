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

public class Solution452 {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
	// 递归版本
    public ListNode removeElements(ListNode head, int val) {
    	if (head == null) {
    		return null;
    	}
    	head.next = removeElements(head.next, val);
    	return head.val == val ? head.next : head;
    }  
}