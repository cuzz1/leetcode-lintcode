package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution057 {
    /**
     * 为什么会想到对数组元素进行排序呢，排序是为了让元素之间呈现出某种规律，处理起来会简单很多。所以，当你觉得一个似乎无从下手的问题的时候，不妨尝试去寻找或制造一种“规律”，排序是手段之一。
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> threeSum(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return res;
        }
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            int left = i + 1;
            int right = numbers.length - 1;  // window [left, right)
            
            while (left < right) {
                List<Integer> list = new ArrayList<Integer>();
                int sum = numbers[i] + numbers[left] + numbers[right];
                if (sum == 0) {
                    list.add(numbers[i]);
                    list.add(numbers[left]);
                    list.add(numbers[right]);
                    left++;
                    right--;
                    if (!res.contains(list)) {
                        res.add(list);
                    }
                }
                
                if (sum > 0) {
                    right--;
                }
                
                if (sum < 0) {
                    left++;
                }
            }
        }
        return res;
    }
        
}