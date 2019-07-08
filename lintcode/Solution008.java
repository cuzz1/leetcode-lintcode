public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        
        if (str == null || str.length == 0) return;
        
        int len = str.length;
        
        offset = offset % len;
        // 注意是从后面开始数
        exch(str, 0, len - offset - 1);
        exch(str, len - offset, len - 1);
        exch(str, 0, len - 1);
        
    }
    
    private void exch(char[] str, int start, int end) {
        while (start <= end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
