public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        int[] res = {-1, -1};
        if (A == null || A.length == 0) return res;
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < target) {
                start = mid;
            } else if (A[mid] > target) {
                end = mid;
            } else {
                end = mid;
            }
        }
        
        if (A[start] == target) {
            res[0] = start;
        } else if (A[end] == target){
            res[0] = end;
        } else {
            res[0] = -1;
        }
        
        start = 0;
        end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < target) {
                start = mid;
            } else if (A[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (A[end] == target) {
            res[1] = end;
        } else if (A[start] == target){
            res[1] = start;
        } else {
            res[1] = -1;
        }
        return res;
        
    }
}
