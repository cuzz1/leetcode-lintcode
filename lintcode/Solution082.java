public class Solution {
    // a ^ b ^ b = a
    public int singleNumber(int[] A) {
        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            res ^= A[i];
        }
        return res;
    }
}
