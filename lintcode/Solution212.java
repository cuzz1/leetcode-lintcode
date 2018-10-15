package src;

public class Solution212 {
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if (string == null || length == 0) {
            return 0;
        }
        int blankLength = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == ' ') {
                blankLength ++;
            }
        }
        
        int size = length + blankLength * 2;
        int j = size - 1;
        
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[j--] = '0';
                string[j--] = '2';
                string[j--] = '%';
            } else {
                string[j--] = string[i];
            }
        }
        return size;

    }
}