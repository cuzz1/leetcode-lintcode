public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        if (A == null || A.length == 0) return Integer.MAX_VALUE;
        int a = A[0];
        
        for (int i = 1; i < A.length; i++) {
            a = a ^ A[i];
        }
        return a;
    }
}
