
public class Solution006 {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
	public static void main(String[] args) {
		int[] A = {1, 3, 5 };
		int[] B = {4};
		int[] C = mergeSorteArray(A, B);
		for(int i = 0; i < C.length; i++){
			System.out.println(C[i]);
		}
	}
    public static int[] mergeSorteArray(int[] A, int[] B) {
        // write your code here
    	int N = A.length + B.length;
    	int i = 0;
    	int j = 0;
    	int[] C = new int[N];
    	for(int k = 0; k < N; k++){
    		if(i > A.length - 1){
    			C[k] = B[j];
    			j++;
    		}else if(j > B.length - 1){
    			C[k] = A[i];
    			i++;
    		
    		}else if(A[i] > B[j]){
    			C[k] = B[j];
    			j++;
    		}else{
    			C[k] = A[i];
    			i++;
    		}
    	}
    	return C;
    }
}