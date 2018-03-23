
public class Solution014 {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
	public static void main(String[] args) {
		int[] nums = {3,4,5,8,8,8,8,10,13,14};
		int result = binarySearch(nums, 8);
		System.out.println(result);
	}
    public static int binarySearch(int[] nums, int target) {  	
    	int start = 0;
    	int end = nums.length - 1;
    	int result = search(nums, target, start, end);
    	for(int i = result - 1; i >= 0; i--){
    		if(nums[i] != nums[result]){
    			return i+1;
    		}
    	}
		return result;
    	
    	
    	
//    	int start = 0;
//    	int end = nums.length - 1;
//
//    	
//    	while(start <= end){
//    		int mid = (start + end) / 2;
//    		if(nums[mid] > target){
//    			end = mid - 1;
//    		}else if(nums[mid] < target){
//    			start = mid + 1;
//    		}else{
//    			return mid;
//    		}
//    	}
//    	return -1;
    }
    
    private static int search(int[] nums, int target, int start, int end){
    	if(start > end){
    		return -1;
    	}
    	int mid =start + (end - start) / 2;
    	if(nums[mid] > target){
    		return search(nums, target, start, mid - 1);
    	}else if(nums[mid] < target){
    		return search(nums, target, mid + 1, end);
    	}else{
    		return mid;
    	}
    }
}