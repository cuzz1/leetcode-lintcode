public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        return b == 0 ? a : aplusb(a ^ b, (a & b) << 1);
    }
}
