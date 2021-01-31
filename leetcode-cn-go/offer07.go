/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func buildTree(preorder []int, inorder []int) *TreeNode {

    if preorder == nil || inorder == nil {
        return nil
    }
    return build(preorder, 0, len(preorder) - 1, inorder, 0, len(inorder) - 1)
}

func build(preorder []int, preStart, preEnd int, inorder []int, inStart, inEnd int) *TreeNode {
    if preStart > preEnd || inStart > inEnd {
        return nil
    }

    val := preorder[preStart]
    node := &TreeNode{
        Val: val,
    }

    // 前序遍历 [3,9,20,15,7] ==> 3 | 9 1 | 20 15 7
    // 中序遍历 [9,3,15,20,7] ==> 9 1 | 3 | 15 20 7
    for i := inStart; i <= inEnd; i++ {
        if inorder[i] == val {
            j := i - inStart
            node.Left = build(preorder, preStart + 1, preStart + j, inorder, inStart, i - 1)
            node.Right = build(preorder, preStart + j + 1, preEnd, inorder, i + 1, inEnd)
        }
    }
    return node
}
