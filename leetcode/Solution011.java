class Solution {
    public int maxArea(int[] height) {
        
        int r = 0;
        int l = height.length - 1;
        
        int res = 0;
        
        while (r < l) {
            int area = Math.min(height[l], height[r]) * (l - r);
            res = Math.max(res, area);
            
            if (height[r] < height[l]) {
                r++;    
            } else {
                l--;
            }
        }
        
        return res;
    }
}
