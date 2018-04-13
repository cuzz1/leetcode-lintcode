package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution138 {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
	
	/*
	 *  解题思路： [-3, 1, 2, -3, 4]  对他们叠加 [-3，-2，0，-3，1]
	 *         发现有 0 则 是一组
	 *         两个-3是一组
	 */
	public static void main(String[] args) {
		int[] nums = {-5,10,5,-3,1,1,1,-2,3,-4};
		List list = subarraySum(nums);
		System.out.println(list);
	}
    public static List<Integer> subarraySum(int[] nums) {
    	int len = nums.length;
    	List<Integer> list = new ArrayList<Integer>();
    	Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    	
    	// 往前面推一个位置
    	hashMap.put(0, -1);
    	
    	int sum = 0;
    	for (int i = 0; i < len; i++) {
    		sum += nums[i];
    		if (hashMap.containsKey(sum)) {
    			list.add(hashMap.get(sum) + 1);
    			list.add(i);
    			return list;
    		}
    		hashMap.put(sum, i);
    	}
    	return list;
    }
}