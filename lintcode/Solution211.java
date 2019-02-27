public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        if (A == null || B == null) return A == B;
        if (A.length() != B.length()) return false;
        char[] chars1 = new char[256];
        char[] chars2 = new char[256];
        for (int i = 0; i < A.length(); i++) {
            chars1[A.charAt(i)] ++;
            chars2[B.charAt(i)] ++;
        }
        
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
