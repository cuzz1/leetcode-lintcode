    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            sign = -1;
        }
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        if (ldividend < ldivisor || ldividend == 0) return 0;
        
        long lres = divide(ldividend, ldivisor);
        
        if (lres > Integer.MAX_VALUE) {
            return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int)lres * sign;
    }
    
    private long divide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) return 0;
        long res = 1;
        long sum = ldivisor;
        while ((sum + sum) <= ldividend) {
            sum += sum;
            res += res;
        }
        return res + divide(ldividend - sum, ldivisor);
    }
}
