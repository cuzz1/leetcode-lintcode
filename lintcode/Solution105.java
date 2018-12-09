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
        if (head == null) return null;
        
        copyNext(head);          // 复制链表
        copyRandom(head);        // 复制Random
        return splitList(head);  // 拆分链表
    }
    
    private void copyNext(RandomListNode head) {
        while (head != null) {
            RandomListNode node = new RandomListNode(head.label);
            node.next = head.next;
            head.next = node;
            head = head.next.next;
        }
    }
    
    private void copyRandom(RandomListNode head) {
        while (head != null) {
            if (head.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
    }
    
    private RandomListNode splitList(RandomListNode head) {
        RandomListNode newHead = head.next;
        while (head != null) {
            RandomListNode temp = head.next;
            head.next = head.next.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            head = head.next;
        }
        return newHead;
    }
}
