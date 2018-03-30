package src;

import extend.ListNode;

public class Solution466 {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
    	ListNode pre = new ListNode(0);
    	pre.next = head;
    	int count = 0;
    	while(pre.next != null){
    		count++;
    		pre = pre.next;
    	}
    	return count;
    }
}