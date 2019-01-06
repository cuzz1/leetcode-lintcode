public class Solution {
    /*
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return helper(head, null);
    }
    
    private TreeNode helper(ListNode start, ListNode end) {
        if (start == end) return null;
        
        ListNode mid = findMid(start, end);
        
        TreeNode node = new TreeNode(mid.val);
        node.left = helper(start, mid);
        node.right = helper(mid.next, end);
        return node;
    }
    
    private ListNode findMid(ListNode start, ListNode end) {
        ListNode slow = start;
        ListNode fast = start;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
