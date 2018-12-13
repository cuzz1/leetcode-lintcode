public class Solution {
    /**
     * @param nums: n non-negative integer array
     * @return: A string
     */
    public String minNumber(int[] nums) {
        
        if (nums == null || nums.length == 0) return "0";
        
        String[] strs = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i] + "";
        }
        
        Arrays.sort(strs,(a, b) -> (a + b).compareTo(b + a));
        
        String res = "";
        for (String str : strs) {
            if (res.length() == 0 && str.equals("0")) {
                continue;
            }
            res += str;
        }
        return res.length() == 0 ? "0" : res;
    }
}
