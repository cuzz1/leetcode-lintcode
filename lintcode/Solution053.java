public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        String res = "";
        String str = reverse(s.trim()); 
        String[] strs = str.split("\\s+");
        for (int i = 0; i < strs.length; i++) {
            res += reverse(strs[i]) + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    
    private String reverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1- i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
