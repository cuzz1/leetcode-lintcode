package src;

public class Solution064 {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
	public static void main(String[] args) {
		int[] A = {1, 3, 5};
		int[] B = {2, 4, 6};
		mergeSortedArray(A, 3, B, 3);
//		for(int i = 0; i < A.length; i++){
//			System.out.print(A[i] + " ");	
//		}
//		
	}
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        
//		 方法1. 先合并在排序
    	
//    	for(int i = 0; i < n; i++){
//    		A[m+i] = B[i];
//    	}
//    	sort(A);
    	
//		方法2. 新建一个数组一个一个挑进去
    	
    	int[] C = new int[m+n];
    	int j = 0;
    	int k = 0;
    	for(int i = 0; i < C.length; i++){
    		if(j > m-1){
    			C[i] = B[k];
    			k++;
    		}else if(k > n-1){
    			C[i] = A[j];
    			j++;
    		}else if(A[j] <= B[k]){
    			C[i] = A[j];
    			j++;
    		}else{
    			C[i] = B[k];
    			k++;
    		}
    	}
		for(int i = 0; i < A.length; i++){
			A[i] = C[i];
		}
    }
}