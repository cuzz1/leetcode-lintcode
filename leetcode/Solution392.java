class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        
        int index = -1;
        
        for (char c : s.toCharArray()) {
            // Returns the index within this string of the first occurrence of the specified character,
            // starting the search at the specified index.
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}
