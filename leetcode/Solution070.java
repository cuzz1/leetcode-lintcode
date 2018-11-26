class Solution {
    public int climbStairs(int n) {
        
        // 1 2 3 5 8
        
        int a = 1;
        int b = 2;
        
        for (int i = 1; i < n; i++) {
            int temp = a;
            a = b;
            b = a + temp;
        }
        return a;
    }
}
