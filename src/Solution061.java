public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        
        int[] res =  new int[]{-1, -1};
        
        if (A == null || A.length == 0) {
            return res;
        }
        
        
        int start = 0;
        int end = A.length - 1;
        int mid = 0;
        
        
        boolean flag = false;
        while (start <= end ) {
            mid = start + (end - start) / 2;
            if (A[mid] < target) {
                start = mid + 1;
            } else if (A[mid] > target) {
                end = mid -1;
            } else {
                flag = true;
                break;
            }
        }
        
        if (flag == false) {
            return res;
        }
        
        int left = mid;
        int right = mid;
        
        while (left >= 0 && A[left] == target) {
            left--;
        }
        while (right < A.length && A[right] == target) {
            right++;
        }
        return new int[]{left + 1, right - 1};
    }
}
