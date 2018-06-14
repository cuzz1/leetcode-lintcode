package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution018 {
    
    private List<List<Integer>> results = new ArrayList<>();
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null) {
            return results;
        }
        
        for (int i = 0; i <= nums.length; i++) {
            helper(nums, new ArrayList<Integer>(), 0, i);
        }
        
        return results;
   }
   
   private void helper(
       int[] nums, List<Integer> list, int start, int count) {
           
       
       if (count == 0) {
           List list1 = new ArrayList<Integer>(list);
           Collections.sort(list1);
           if (!results.contains(list1)) {
               results.add(list1);
           }
           return;
       }
       
       if (start == nums.length) {
           return;
       }
       
       // selected
       list.add(nums[start]);
       helper(nums, list,start + 1, count - 1);
       
       // un-selected
       list.remove(list.size()-1);
       helper(nums, list, start + 1, count);
       
           
           
           
   }
}