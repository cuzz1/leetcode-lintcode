public class Solution {
    /**
     * @param nums: A list of integers.
     * @param k: An integer
     * @return: The maximum number inside the window at each moving.
     */
    public List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 || k < 0 || k > nums.length) {
            return res;
        }
        
        Deque<Integer> deque = new LinkedList<>(); // 保存的是下标
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && i >= deque.getFirst() + k) {
               deque.removeFirst();
            }
            
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.removeLast();
            } 
            deque.addLast(i);
            if (i + 1 >= k) {
                res.add(nums[deque.getFirst()]);
            }
        }
        return res;
    }
}
