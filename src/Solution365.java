package src;

public class Solution365 {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        int count = 0;
        int flag = 1;
        int a = 1;
        // 如果超过了32位就变为0
        while (flag != 0) {
            if ((num & flag) != 0) {
                count ++;
            }
            flag = flag << 1;
        }
        return count;
    }
};
