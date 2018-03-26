package src;

public class Solution037 {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
	public static void main(String[] args) {
		int result = reverseInteger(123);
		System.out.println(result);
	}
    public static int reverseInteger(int number) {
        // write your code here
    	int a = number / 100;
    	int b = (number / 10) % 10;
    	int c = number % 10;
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	
    	int result = c * 100 + b * 10 + a;
    	return result;
    }
}