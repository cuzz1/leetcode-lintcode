public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        
        int[] res = new int[2];
        
        if (numbers == null || numbers.length < 0) return res;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (!map.containsKey(temp)) {
                map.put(numbers[i], i);
            } else {
                res[0] = map.get(temp);
                res[1] = i;
                return  res;
            }
        }
        return res;
    }
}
