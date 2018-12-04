public class Solution {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        
        int count = 0;
        int compare = 1;
        
        while (compare != 0) {
            if ((num & compare) != 0) {
                count++;
            }
            compare = compare << 1;
        }
        return count;
    }
}
