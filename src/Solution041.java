public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     * @des: 链接：https://www.nowcoder.com/questionTerminal/459bd355da1549fa8a49e350bf3df484
        来源：牛客网

        使用动态规划
        F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
        F（i）=max（F（i-1）+array[i] ， array[i]）
        res：所有子数组的和的最大值
        res=max（res，F（i））
        
        如数组[6, -3, -2, 7, -15, 1, 2, 2]
        初始状态：
            F（0）=6
            res=6
        i=1：
            F（1）=max（F（0）-3，-3）=max（6-3，3）=3
            res=max（F（1），res）=max（3，6）=6
        i=2：
            F（2）=max（F（1）-2，-2）=max（3-2，-2）=1
            res=max（F（2），res）=max（1，6）=6
        i=3：
            F（3）=max（F（2）+7，7）=max（1+7，7）=8
            res=max（F（2），res）=max（8，6）=8
        i=4：
            F（4）=max（F（3）-15，-15）=max（8-15，-15）=-7
            res=max（F（4），res）=max（-7，8）=8
        以此类推
        最终res的值为8
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0]; // 记录包含nums[i]的连续数组最大值
        int res = nums[0]; // 记录所有子数组的和的最大值
        
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);    
            res = Math.max(res, max);
        }
        return res;
    }

}
