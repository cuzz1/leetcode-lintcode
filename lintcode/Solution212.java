public class Solution {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        int blankSize = 0;
        for (int i = 0; i < length; i++) {
           if (string[i] == ' ') blankSize++; 
        }
        
        int newLength = blankSize * 2 + length;
        for (int i = length - 1, j = newLength - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[j--] = '0';
                string[j--] = '2';
                string[j--] = '%';
            } else {
                string[j--] = string[i];
            }
        }
        return newLength;
    }
}
