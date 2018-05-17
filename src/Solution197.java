package src;

public class Solution197 {
    /**
     * @param A: An array of integers
     * @return: A long integer
     */
    public long permutationIndex(int[] A) {
        // write your code here
    	long number = 0;
    	if (A.length == 0 || A == null) {
    		return number;
    	}

    	for (int i = 0; i < A.length - 1; i++) {
    		// 计算该元素有几个比他小
    		long temp = 0;
    		for (int j = i + 1; j < A.length; j++) {
    			if (A[j] < A[i]) {
    				temp ++;
    			}
    		}
    		number += temp*getFactor(A.length-i-1);
    	}
    	// 再加上1
    	return number + 1;
    }

	private long getFactor(int n) {
		long result = 1;
		while (n >= 1) {
			result = result * n;
			n--;
		}
		return result;
	}

}