package src;

import java.util.HashSet;
import java.util.Set;

public class SolutionI320 {
    /**
     * @param nums: the given array
     * @return: if any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            
            set.add(nums[i]);
        }
        
        return false;
    }
}