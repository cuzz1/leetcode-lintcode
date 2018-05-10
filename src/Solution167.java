package src;

import extend.ListNode;

public class Solution167 {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
    	ListNode node = new ListNode(0);
    	ListNode head = node;
    	
    	// 表示是否需要进位
    	boolean flag = false;
    	int sum = 0;
    	while(l1 != null && l2 != null) {
    		
			sum = l1.val + l2.val;

    		if (flag == true) {
    			sum += 1;
    		}
    		
    		if (sum / 10 > 0) {
    			flag = true;
    			sum = sum % 10;
    		} else {
    			flag = false;
    		}
    		
    		ListNode tempNode = new ListNode(sum);
    		node.next = tempNode;
    		
    		l1 = l1.next;
    		l2 = l2.next;
    		node = node.next;
    	}
    	
    	
    	while (l1 != null) {
    		sum = l1.val;
    		
    		if (flag == true) {
    			sum += 1;
    		}

    		if (sum / 10 > 0) {
    			flag = true;
    			sum = sum % 10;
    		} else {
    			flag = false;
    		}

    		ListNode tempNode = new ListNode(sum);
    		node.next = tempNode;

    		l1 = l1.next;
    		node = node.next;

    	} 

    	while (l2 != null) {

    		sum = l2.val;
    		
    		if (flag == true) {
    			sum += 1;
    		}

    		if (sum / 10 > 0) {
    			flag = true;
    			sum = sum % 10;
    		} else {
    			flag = false;
    		}

    		ListNode tempNode = new ListNode(sum);
    		node.next = tempNode;

    		l2 = l2.next;
    		node = node.next;
    	} 

    	
		if (flag == true) {
			node.next = new ListNode(1);
		}
    	
    	
    	return head.next;
    }
}