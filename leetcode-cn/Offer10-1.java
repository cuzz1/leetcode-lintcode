class Solution {
    public int fib(int n) {
        if (n <= 0) return 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
