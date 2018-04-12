package src;

import extend.ListNode;

public class Solution112 {
    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
    	
    	if (head == null) {
    		return null;
    	}
    	
    	// 定义一个指针
    	ListNode p= head;
    	
    	// 循环链表
    	while (p.next != null) {
    		if (p.val == p.next.val) {
    			p.next = p.next.next;
    		} else {
    			p = p.next;
    		}
    	}
    	return head;
    }
}