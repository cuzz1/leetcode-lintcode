package src;

import java.util.HashSet;
import java.util.Set;

public class Solution547 {
    
    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            
            return new int[0];
        }
        Set<Integer> set1= new HashSet<>();
        
        Set<Integer> set2 = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        
 
        
        
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] arr = new int[set2.size()];
        int index = 0;
        for(int i : set2) {
            arr[index++] = i;
            
        }
        return arr;
        
    }
};