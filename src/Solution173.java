package src;

import extend.ListNode;

public class Solution173 {
	/**
	 * @param head: The first node of linked list.
	 * @return: The head of linked list.
	 */
	public ListNode insertionSortList(ListNode head) {
		// write your code here
		ListNode node = new ListNode(0);
		
		
		while(head != null) {
			ListNode cur = node;

			while(cur.next != null && head.val >= cur.next.val) {
					cur = cur.next;
			} 
//			ListNode temp = head.next;
//			head.next = cur.next;
//			cur.next = head;
//			head = temp;
			

			
		}
		return node.next;
	}
}