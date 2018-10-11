public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        
        if (s == null || t == null) {
            return false;
        }
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int length = s.length();
        
        char[] array1 = new char[256];
        char[] array2 = new char[256];
        
        for (int i = 0; i < length; i++) {
            array1[s.charAt(i)]++;
            array2[t.charAt(i)]++;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
        
        
    }
}
