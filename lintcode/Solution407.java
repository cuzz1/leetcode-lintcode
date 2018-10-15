package src;

public class Solution407 {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
	public static void main(String[] args) {
		int[] digits = {9, 9, 9};
		int[] result = plusOne(digits);
		show(result);
	}
	
	public static void show(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
    public static int[] plusOne(int[] digits) {
        // write your code here
    	int N = digits.length - 1;
    	int plus = 1;
    	for (int i = N; i > 0; i--) {
    		if (digits[i] == 9 && plus == 1) {
    			digits[i] = 0;
    		} else {
				digits[i] = digits[i] + plus; 
				plus = 0;
    		}
    	}
    	System.out.println("======");
    	show(digits);
    	System.out.println("======");
    	if (digits[0] == 9 && plus == 1) {
    		int[] newDigits = new int[digits.length + 1];
    		newDigits[0] = 1;
    		newDigits[1] = 0;
    		for (int i = 2; i <= N+1; i++) {
    			newDigits[i] = digits[i-1];
    		}
    		return newDigits;
    	} else {
			digits[0] = digits[0] + plus; 
			return digits;
    	}
    }
}