package src;

import java.util.ArrayList;
import java.util.List;

import extend.ListNode;

public class Solution166 {
    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
    	
    	if (head == null) {
    		return null;
    	}
    	List<Integer> list = new ArrayList<Integer>();
    	while (head != null ) {
    		list.add(head.val);
    		head = head.next;
    	}
    	
    	int res = list.get(list.size()-n);
    	return new ListNode(res);
    }
}