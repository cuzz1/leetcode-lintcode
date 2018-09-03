public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.size(); i++) {
            int key = nums.get(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > nums.size() / 2) {
                return key;
            }
        }
        return Integer.MIN_VALUE;
    }
}
