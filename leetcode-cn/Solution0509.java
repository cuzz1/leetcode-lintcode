class Solution {
    // 递归
    // public int fib(int n) {
    //     if (n <= 0) return 0;
    //     if (n == 1) return 1;
    //     return fib(n - 1) + fib(n - 2);
    // }

    // 循环
    public int fib(int n) {
 
        int a = 0;
        int b = 1;
        // a, b = b, a + b
        for (int i = 0; i < n; i++) {
            int tmp = a;
            a = b;
            b = b + tmp;
        }
        return a;
    }
}
