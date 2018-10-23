/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.end));
        
        int count = 1;
        int end = intervals[0].end;
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < end) {
                continue;
            }
            count++;
            end = intervals[i].end;
        }
        return intervals.length - count;
    }
}
