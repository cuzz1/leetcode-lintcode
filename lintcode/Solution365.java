public class Solution {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        int count = 0;
        int flag = 1;
        // 超过32位就变为0
        
        while (flag != 0) {
            if ((num & flag) != 0) {
                count ++;
            }
            System.out.println(num & flag);
            flag = flag << 1;
        }
        return count;
    }
};
