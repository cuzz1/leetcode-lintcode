public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i];
            if (map.containsKey(target - key)) {
                return new int[] { map.get(target - key), i};
            } else {
                map.put(key, i);
            }
        }
        return new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
    }
}
