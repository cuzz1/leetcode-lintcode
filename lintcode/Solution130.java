package src;

public class Solution130 {
    /*
     * @param A: Given an integer array
     * @return: nothing
     */
    public void heapify(int[] A) {
        int i;
        for (i = 0; i < A.length; i++) {
            swim(A, i);
        }
    }
    
    private void swim(int[] A, int k) {
        while (k > 0 && A[(k-1) / 2] > A[k]) {
            exch(A, (k-1) / 2, k);
            k = (k - 1) / 2;
        }
    }
    
    private void exch(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    

}