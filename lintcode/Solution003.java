public class Solution {
    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += helper(k , i);
        }
        return count;
    }
    
    private int helper(int k, int i) {
        if (k == 0 && i == 0) return 1;
        int n = 0;
        while (i > 0) {
            if (i % 10 == k) {
                n++;
            }
            i /= 10;
        }
        return n;
    }
}

public class Solution {
    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        int count = 0;
        char c = (k + "").toCharArray()[0];
        for (int i = 0; i <= n; i++) {
            String str = i + " ";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
