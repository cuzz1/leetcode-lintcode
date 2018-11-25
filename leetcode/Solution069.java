class Solution {
    public int mySqrt(int x) {
        if (x < 0) {
            return -1;
        }
        int low = 0;
        int high = x;
        
        while (low - 1 < high) {
            long mid = low + (high - low) / 2;
            
            if (mid * mid == x) {
                return  (int) mid;
            } else if (mid * mid < x) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        
        return high * high > x ? low : high;
        
    }
}
