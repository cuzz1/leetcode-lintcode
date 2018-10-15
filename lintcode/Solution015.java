package src;

import java.util.ArrayList;
import java.util.List;

public class Solution015 {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        List<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            res.add(list);
            return res;
        }
        permuteHelper(nums, 0);
        return res;
   }
   
   private void permuteHelper(int[] nums, int i){
       if (i == nums.length - 1) {
           List<Integer> list = new ArrayList<Integer>();
           for (int k = 0; k < nums.length; k++) {
               list.add(nums[k]);
           }
           res.add(list);
       } else {
           for (int j = i; j < nums.length; j++) {
               exch(nums, i, j);
               //System.out.println(i);
               permuteHelper(nums, i + 1);
               // 恢复原来的情况
               exch(nums, i, j);
           }
       }
   }
   
   private void exch(int[] nums, int i, int j) {
       
       //System.out.println("i = " + i + "  j = " + j);
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
   }
}