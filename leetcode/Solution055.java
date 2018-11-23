class Solution {
    public boolean canJump(int[] nums) {
        // 当前位置跳能到的最大位子
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex < i) return false;
            maxIndex = Math.max(nums[i] + i, maxIndex);
        }
        return true;
    }
}
