public class Solution {
    /**
     * @param str: A string
     * @return: An integer
     */
    public int atoi(String str) {
        if (str == null || str.length() == 0) return 0;
        str = str.trim().split("\\.")[0];
        int index = 0;
        int sign = 1;
        if (str.charAt(index) == '-') {
            index++;   
            sign = -1;
        }
        
        if (str.charAt(index) == '+') index++;
        long res = 0;
        while (index < str.length()) {
            if (str.charAt(index) - '0' < 0 || str.charAt(index) - '0'> 9) break;
            res = res * 10 + str.charAt(index) - '0';
            index++;
        }
        if (sign > 0 && index > 12) return Integer.MAX_VALUE;
        if (sign > 0 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign < 0 && index > 12) return Integer.MIN_VALUE;
        if (sign < 0 && res > Integer.MAX_VALUE) return Integer.MIN_VALUE;
        return (int)  res * sign;
    }
}
