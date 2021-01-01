/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    pre := &ListNode{}

    node := pre
    carry := 0
    for l1 != nil || l2 != nil {
        a1 := 0
        if l1 != nil {
            a1 = l1.Val
        }
        a2 := 0
        if l2 != nil {
            a2 = l2.Val
        }

        sum := a1 + a2 + carry
        val := sum % 10
        carry = sum / 10

        if l1 != nil {
            l1.Val = val
            node.Next = l1
            l1 = l1.Next;
        } else {
            l2.Val = val
            node.Next = l2
        }
        // node.Next = &ListNode{
        //     Val: val,
        // }
        node = node.Next
        // if l1 != nil {
        //     l1 = l1.Next
        // }
        if l2 != nil {
            l2 = l2.Next
        }
    }

    if carry == 1 {
        node.Next = &ListNode{
            Val : 1,
        }
    }

    return pre.Next
}
