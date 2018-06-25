package src;

import java.util.Arrays;

public class Solution059 {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target: An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        int res = Integer.MAX_VALUE;
        if (numbers == null || numbers.length < 3) {
            return res;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                int sum = numbers[i] + numbers[left] + numbers[right];
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                } 
                if (sum == target) {
                    return res;
                }
                
                if (sum < target) {
                    left ++;
                }
                
                if (sum > target) {
                    right --;
                }
            }
            
        }
        return res;
    }
}