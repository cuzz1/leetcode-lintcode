class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] nums = merge(nums1, nums2);
        int length = length1 + length2;
        if (nums.length % 2 != 0) {
            return nums[length/2];
        } else {
            return (nums[(length - 1) / 2] + nums[(length - 1) / 2 + 1]) / 2.0;
        }
        
    }
    
    private int[] merge(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] nums = new int[length1 + length2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < length1 && j < length2) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        
        while (i < length1) {
            nums[k++] = nums1[i++];
        }
        
        while (j < length2) {
            nums[k++] = nums2[j++];
        }
        return nums;
    }
}
