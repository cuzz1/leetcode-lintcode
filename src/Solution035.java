package src;

import extend.ListNode;

public class Solution035 {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
    	ListNode reversion = null;
    	while(head != null){
    		ListNode temp = head.next;
    		head.next = reversion;
    		
    		reversion = head;
    		head = temp;
    	}
    	return reversion;
    }
}