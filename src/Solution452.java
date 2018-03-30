package src;

import extend.ListNode;

public class Solution452 {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
    	// write your code here
    	// 在前面新增一个节点  这样不用考虑第一位子和最后一个位子
    	ListNode pre = new ListNode(0);
    	pre.next = head;
    	head = pre;
    	
    	while(head.next != null){
    		if(head.next.val == val){
    			head.next = head.next.next;
    		}else{
    			head = head.next;
    		}
    	}
    	return pre.next;
    }
}