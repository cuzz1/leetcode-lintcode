class Solution {

    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>(nums.length / 2);
        if (nums == null || nums.length <= 0) {
            return list;
        }

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1] + 1) {
                list.add(getStr(start, nums[i-1]));
                start = nums[i];
            } 
        }
        list.add(getStr(start, nums[nums.length-1]));
        return list;
    }

    private String getStr(int a, int b) {
        StringBuilder sb = new StringBuilder();
        if (a == b) {
            sb.append(a);
            return sb.toString();
        };
        sb.append(a).append("->").append(b);
        return sb.toString();
    }

}
