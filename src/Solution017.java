package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution017 {
    
    private List<List<Integer>> res = new ArrayList<>();
    
    
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
       for (int i = 0; i <= nums.length; i++){
            helper(nums, new ArrayList<Integer>(), 0, i);
       }
        return res;
    }
    
    
	private void helper(int[] nums, List<Integer> list, int start, int count) {
        
        if (count == 0) {
        	List list1 = new ArrayList<Integer>(list);
        	Collections.sort(list);
            res.add(list1);
            return;
        }   
        
        if (start == nums.length) {
            return;
        }
        
        
        // select
        list.add(nums[start]);
        helper(nums, list, start + 1, count-1);
        // un-select
        list.remove(list.size()-1);
        helper(nums, list, start + 1, count);
    }
    
    
    
    
    
}