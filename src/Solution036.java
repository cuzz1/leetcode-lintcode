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

public class Solution036 {
    /**
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	// 1 2 3 4 5     2  4   
    	// 1 4 3 2 5
    	// 记录 0 和 1 号的位子
    	// 先让0节点指向反转的链表在用1号节点指向后面的链表就可以
    	
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // 记录前一个节点
        ListNode pre = dummy;
        
        int i = 1;
        while (i < m) {
            pre = pre.next;
            i++;
        }
        
        ListNode cur = pre.next;
        
        // 
        ListNode pre2 = cur;
        
        ListNode node = null;
        
        while(i <= n && cur != null) {
            ListNode temp =  cur;
            cur = cur.next;
            temp.next = node;
            node = temp;
            i++;
        }
        
        print(node);
        
        pre.next = node;
        System.out.print("pre:  ");
        print(pre);
        
        
        pre2.next = cur;
        
        System.out.print("pre2:  ");
        print(pre2);
        
        
        return dummy.next;
    }
    
    private void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }
}