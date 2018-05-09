package src;

import extend.ListNode;

public class Solution102 {

    /* 定义两个指针一个每次移动两次一个移动一次 如果有环则他们会相遇
     * 已经用python试过了
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
    	
    	if (head == null || head.next == null) {
    		return false;
    	}
    	
    	ListNode fast = head.next;
    	ListNode slow = head;
    	while(fast != slow) {
    		if (fast == null || fast.next == null) {
    			return false;
    		}
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	return true;

    }
}
