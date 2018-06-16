package src;

public class Solution002 {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // 只要统计5的个数就行了
        long count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}