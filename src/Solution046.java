package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution046 {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		nums.add(2);
		int result = majorityNumber(nums);
		System.out.println(result);
	}
	
	
    public static int majorityNumber(List<Integer> nums) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.size(); i++){
        	if(map.containsKey(nums.get(i))){
        		int value = map.get(nums.get(i)) + 1;
        		map.put(nums.get(i), value);
        	}else{
        		map.put(nums.get(i), 1);
        	}
        }
        int flag = nums.size() / 2;
        
        // 获取Map中的所有的key  是一个集合
        Set<Integer> keySet = map.keySet();
        
        // 迭代
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
        	int key =  (int) iterator.next();
        	if(map.get(key) > flag ){
        		return key;
        	}
        }
		return -1;
    }
}