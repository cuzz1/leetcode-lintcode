public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return new int[]{-1,-1};
        // key是数，value是下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int value = target - numbers[i];
            if (!map.containsKey(value)) {
                map.put(numbers[i], i);
            } else {
                return new int[]{map.get(value), i};
            }
        }
        return new int[]{-1, -1};
    }
}
