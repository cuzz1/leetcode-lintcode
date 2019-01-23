public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        if (nums == null || nums.size() == 0) return Integer.MIN_VALUE;
        
        int maj = nums.get(0);
        int count = 0;
        
        for (int num : nums) {
            count = (maj == num ? count + 1 : count -1);
            if (count == 0) {
                maj = num;
                count = 1;
            }
        }
        return maj;
    }
}
