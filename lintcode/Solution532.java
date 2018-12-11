public class Solution {
    /**
     * @param A: an array
     * @return: total of reverse pairs
     */
    public long reversePairs(int[] A) {
        long count = 0;
        if (A == null || A.length == 0) return count;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) count++;
            }
        }
        return count;
    }
}
