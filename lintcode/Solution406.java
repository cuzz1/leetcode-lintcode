package src;

public class Solution406 {
    /**
     * https://www.bilibili.com/video/av24299540/?p=14
     * @param nums: an array of integers
     * @param s: An integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
        // 滑动窗口模型
        
        int left = 0;
        int right = -1;  // [left, right]表示窗口大小
        
        int res = Integer.MAX_VALUE;
        int sum = 0;
        
        while (left < nums.length) {
            if (right < nums.length - 1 && sum < s) {
                ++right;
                sum += nums[right];
            } else {
                sum -= nums[left];
                left++;
            }
            
            if (sum >= s) {
                res = Math.min(res, right - left + 1);
            }
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}