public class Solution {
    /**
     * @param n: An integer
     * @return: An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(n, 0, res);
        return res;
    }
    
    public void  helper(int n, int ans, ArrayList<Integer> res) {
        if (n == 0) {
            if (ans > 0) {
                res.add(ans);
            }
            return;
        }
        
        for (int i = 0; i <= 9; i++) {
            helper(n - 1,  ans * 10 + i, res);
        }
        
    }
}
