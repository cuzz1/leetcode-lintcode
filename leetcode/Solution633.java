class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0; 
        int end = (int) Math.sqrt(c);
        while (start <= end) {
            int res = start * start + end * end;
            if (res == c) {
                return true;
            } else if (res < c) {
                start++;
            } else { 
                end--;
            }
        }
        return false;
    }
}
