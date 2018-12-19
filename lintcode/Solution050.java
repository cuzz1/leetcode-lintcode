public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        List<Long> list = new ArrayList<>();
        if (nums.size() == 1) return Arrays.asList(1L);
        if (nums.size() == 2) return Arrays.asList((long) nums.get(1), (long) nums.get(0));
        
        int size = nums.size();
        long[] left = new long[size]; 
        left[0] = nums.get(0);
        long[] right = new long[size];
        right[size - 1] = nums.get(size - 1);
        
        for (int i = 1; i < size; i++) {
            left[i] = left[i-1] * nums.get(i);
            right[size - 1 - i] = right[size - i] * nums.get(size - 1 - i);
        }
        list.add(right[1]);
        for (int i = 1; i < size - 1; i++) {
            list.add(left[i-1] * right[i+1]);
        }
        list.add(left[size-2]);
        return list;
    }
    
}
