public class Solution {
    /*
     * @param A: Given an integer array
     * @return: nothing
     */
    public void heapify(int[] A) {
        
        for (int i = 0; i < A.length; i++) {
            smallToBig(A, i);
        } 
    }
    
    private void smallToBig(int[] A, int i) {
        while(i > 0 && A[i] < A[(i-1)/2]) {
            swap(A, i, (i-1) / 2);
            i = (i-1) / 2;
        }
    }
    
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
