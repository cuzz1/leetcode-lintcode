class Solution {
    // public int findRepeatNumber(int[] nums) {
    //     if (nums == null || nums.length == 0) {
    //         return -1;
    //     }
    //     Set<Integer> set = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int num = nums[i];
    //         if (set.contains(num)) {
    //             return num;
    //         }
    //         set.add(num);
    //     }
    //     return -1;
    // }
      public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] records = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (records[num] > 0) {
                return num;
            }
            records[num]++;
        }
        return -1;
    }
}
