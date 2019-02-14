public class Solution {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        int count = 0;
        int p = 1;
        while (p != 0) {
            if ((num & p) != 0) {
                count++;
            } 
            p = p << 1;
        }
        return count;
    }
};
