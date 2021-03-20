class Solution {
    public double myPow(double x, int n) {
        // 递归方案
        if (n == 0) {
            return 1.0;
        }  
        
        if (n == 1) {
            return x;
        } 

        if (n == -1) {
            return 1 / x;
        }
        // 奇数
        if ((n & 1) == 1) {
            double a =  myPow(x, (n - 1) / 2);
            return x * a * a;
        } else  { // 偶数
            double a = myPow(x, n / 2);
            return a * a;
        }
    }
}
