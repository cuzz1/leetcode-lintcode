package src;

public class Solution488 {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        char[] charArr1 = new char[128];
        char[] charArr2 = new char[128];
        
        for (int i = 0; i < s.length(); i++) {
            charArr1[s.charAt(i)] ++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            charArr2[t.charAt(i)] ++;
        }
        
        
        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]) {
                return false;
            }
        }
        
        return true;
    }
}