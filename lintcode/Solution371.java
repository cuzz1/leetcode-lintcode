public class Solution {
    /**
     * @param n: An integer
     * @return: An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        List<Integer> res = new ArrayList<>();
        helper(n, 0, res);
        return res;
    }
    
    private void helper(int n, int ans, List<Integer> res) {
        if (n == 0) {
            if (ans > 0) {
                res.add(ans);
            }
            return;
        }
        
        for (int i = 0; i < 10; i++) {
            helper(n-1, ans * 10 + i, res);
        }
    }
}
