public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        char[] array = new char[256];
        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i)]++;
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (array[str.charAt(i)] == 1) return str.charAt(i);
        }
        return '0';
    }
}
