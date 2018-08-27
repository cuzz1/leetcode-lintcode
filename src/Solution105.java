
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        
        // 复制链表
        copyNext(head);
        
        // 复制rondom
        copyRandom(head);
        
        // 拆分链表
        RandomListNode res = splitList(head);
        
       return res; 
    }
    
    private void copyNext(RandomListNode head) {
        while (head != null) {
            RandomListNode newHead = new RandomListNode(head.label);
            newHead.next = head.next;
            head.next = newHead;
            head = head.next.next;
        }
    }
    
    private void copyRandom(RandomListNode head) {
        while (head != null) {
            head.next.random = head.random;
            head = head.next.next;
        }
    }
    
    private RandomListNode splitList(RandomListNode head) {
        RandomListNode newHead = head.next;
        while (head != null) {
            RandomListNode temp = head.next;
            head.next = temp.next;
            head = head.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        return newHead;
    }
}









