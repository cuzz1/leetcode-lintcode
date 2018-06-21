package src;

public class Solution148 {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // 采用计数排序 统计0 1 2 的数量
        int[] count = new int[3];
        
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        for (int i : count) {
            System.out.println(i);
        }
        
        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }
        
        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;
        }
        
        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }
    
}
