package src;

import java.util.LinkedHashSet;
import java.util.Set;

public class SolutionI319 {
    /**
     * @param nums: the given array
     * @param k: the given number
     * @return:  whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (k == 0 || nums.length < 2) {
            return false;
        }
        
        
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            
            set.add(nums[i]);
            
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}