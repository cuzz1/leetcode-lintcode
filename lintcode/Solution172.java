package src;

public class Solution172 {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        int p = 0;
        // [0..p) 为剩下的元素 [p...i] 为删除的元素
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                exch(A, i, p);
                p++;
            }
        }
        return p;
    }
    
    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}