class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int temp = i*i + j*j;
            if (temp == c) {
                return true;
            } else if (temp < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
