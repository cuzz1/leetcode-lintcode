public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        if (str == null || "".equals(str)) {
            return '0';
        }
       char[] record = new char[256];
       for (int i = 0; i < str.length(); i++) {
           record[str.charAt(i)]++;
       }
       
       for (int i = 0; i < str.length(); i++) {
           if (record[str.charAt(i)] == 1) {
               return str.charAt(i);
           }
       }
       
       return Character.MIN_VALUE;
    }
}
