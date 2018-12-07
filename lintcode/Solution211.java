public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        char[] array1 = new char[256];
        char[] array2 = new char[256];
        if (A.length() != B.length()) return false;
        for (int i = 0; i < A.length(); i++) {
            array1[A.charAt(i)]++;
            array2[B.charAt(i)]++;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}
