/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reversePrint(head *ListNode) []int {
    node := head
    count := 0
    for node != nil {
        count++
        node = node.Next
    }

    res := make([]int, count)
    for i := count - 1; i >= 0; i-- {
        res[i] = head.Val
        head = head.Next
    }
    return res
}
