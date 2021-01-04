func fib(n int) int {
    if n < 0 {return 0}
    a, b := 0, 1 
    for i := 0; i < n; i++ {
        a, b = b, a + b
    }
    return a
}
