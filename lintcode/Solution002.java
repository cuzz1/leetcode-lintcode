public class Solution {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        long count = 0;
        while (n != 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
