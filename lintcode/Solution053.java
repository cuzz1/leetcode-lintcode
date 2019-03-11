public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        
        String[] strs = s.split("\\s+");
        String res = "";
        for (String str : strs) {
            res += reverse(str) + " ";
        }
        return reverse(res.trim());
    }
    
    private String reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
