public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        char[] A_array = new char[256];
        char[] B_array = new char[256];
        if (A.length() != B.length()) {
            return false;
        }
        
        for (int i = 0; i < A.length(); i++) { 
            A_array[A.charAt(i)]++;
            B_array[B.charAt(i)]++;
        }
        
        for (int i = 0; i < A_array.length; i++) {
            if (A_array[i] != B_array[i]) {
                return false;
            }
        }
        return true;
    }
}
