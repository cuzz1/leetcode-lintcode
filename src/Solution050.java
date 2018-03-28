package src;

import java.util.ArrayList;
import java.util.List;

public class Solution050 {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
	public static void main(String[] args) {
		List nums = new ArrayList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		List list = productExcludeItself(nums);
		System.out.println(list);
	}
    public static List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> list = new ArrayList<Long>();
        
        long left = 1L;       
        for(int i = 0; i < nums.size(); i++){
        	if(i > 0){
        		left *= nums.get(i-1);
        		System.out.println("left " + left);
        	}
        	long right = 1L;
        	for(int j = i+1; j < nums.size(); j++){
        		right *= nums.get(j);
        	}
        	System.out.println("right " + right);
        	long temp = left * right;
        	list.add(temp);
        }
        return list;
    }
}
