package src;

import java.util.ArrayList;
import java.util.List;

public class Solution039 {
    /**
     * 思路：采用原地排序  希尔排序、冒泡排序、插入排序、选择排序、堆排序、快速排序
     * @param nums: An integer array
     * @return: nothing
     */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(5);
		recoverRotatedSortedArray(nums);
		for(Integer num: nums){
			System.out.println(num);
		}
		
	}
	// 使用快速排序 复习一下
    public static void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
    	sort(nums, 0, nums.size()-1);
    }
    
    
    
    private static void sort(List<Integer> nums, int start, int end) {
		// TODO Auto-generated method stub
		if(start > end){
			return;
		}
		int j = partition(nums, start, end);
		sort(nums, start, j-1);
		sort(nums, j+1, end);
	}
	private static int partition(List<Integer> nums, int start, int end){
  
    	int flag = nums.get(end);
    	int i = start;
    	
    	for(int j = start; j < end ; j++){
    		if(nums.get(j) < flag){
    			exch(nums, i, j);
				i++;
    		}
    	}
    	exch(nums, i, end);
    	return i;
    	
    	
    }
	private static void exch(List<Integer> nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums.get(i);
		nums.set(i, nums.get(j));
		nums.set(j, temp);
	}
}