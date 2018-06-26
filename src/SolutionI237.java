package src;

import java.util.HashMap;
import java.util.Map;

public class SolutionI237 {
    /**
     * @param points: a 2D array
     * @return: the number of boomerangs
     */
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int d = getDistance(points[i], points[j]);
                    // map.put(d, map.getOrDefault(d,0) + 1);
                    if (map.containsKey(d)) {
                    	map.put(d, map.get(d) + 1);
                    } else {
                    	map.put(d, 1);
                    }
                }
            }
            for (int val : map.values()) {
                res += val * (val-1);
            }
        }
        
        return res;
    }
    
    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx*dx + dy*dy;
    }
}