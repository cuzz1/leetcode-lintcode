public class Solution {
    /**
     * @param nums: n non-negative integer array
     * @return: A string
     */
    public String minNumber(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                String str1 = nums[i] + "" + nums[j];
                String str2 = nums[j] + "" + nums[i];
                
                // 如果他们拼起来str1 > str2就需要交换
                
                // if (Long.valueOf(str1) > Long.valueOf(str2)) {
                int flag = str1.compareTo(str2);
                if (flag > 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
        }
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                break;
            }
            count++;
        }
        
        str = str.substring(count, str.length());
        if (str.equals("")) {
            str = "0";
        }
        return str;
    }
}
