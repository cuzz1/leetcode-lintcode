class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) {
            return 0;
        }
        
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        
        int end = points[0][1];
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            int start = points[i][0];
            if (start <= end) {
                continue;
            }
            count++;
            end = points[i][1];
        }
        return count;
    }
}
