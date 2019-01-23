public class Solution {
    // a ^ b ^ b = a
    public int singleNumber(int[] A) {
        if (A == null || A.length == 0) return 0;
        int n = A[0];
        for (int i = 1; i < A.length; i++) {
            n ^= A[i];
        }
        return n;
    }
}
