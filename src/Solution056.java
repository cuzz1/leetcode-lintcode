package src;

public class Solution056 {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int[] result = twoSum(numbers, 3);
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
    	int[] result = new int[2];
    	int i;
    	int j;
    	for(i = 0; i < numbers.length; i++){
    		int temp = target - numbers[i];
    		for(j = i + 1; j < numbers.length; j++){
    			if(temp == numbers[j]){
    				result[0] = i;
    				result[1] = j;
    				return result;
    			}
    		}
    	}
		return result;
    }
}