package src;

public class Solution003 {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
	public static void main(String[] args) {
		
		int count = digitCounts(9, 99999);
		System.out.println(count);
	}
    public static int digitCounts(int k, int n) {
        // write your code here
    	int count = 0;
    	for (int i = 0; i <= n; i++) {
    		count += singleCount(k, i);
    	}
    	return count;
    }
	private static int singleCount(int k, int i) {
		if (i == 0 && k == 0) {
			return 1;
		}
		int count = 0;
		while (i > 0) {
			if (i % 10 == k) {
				count++;
			}
			i = i / 10;
		}
		return count;
	}
}