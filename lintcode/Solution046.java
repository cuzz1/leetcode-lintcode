public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        if (nums == null || nums.size() == 0) return Integer.MIN_VALUE;
        
        int majority = nums.get(0);
        int count = 1;
        for (int num : nums) {
            count = num == majority ? count + 1 : count - 1;
            if (count == 0) {
                majority = num;
                count = 1;
            }
        }
        return majority;
    }
}
