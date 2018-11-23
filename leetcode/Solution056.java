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
    /**
    
    线性扫描算法
    |_____|       |________|
        |_______|
         
    */
    
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<>();
        if (intervals == null || intervals.size() == 0) {
            return list;
        }
        // 按照start大小排序
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for (Interval interval : intervals) {
            if (interval.start <= end) {
                end = Math.max(interval.end, end);
            } else {
                list.add(new Interval(start, end)); 
                start = interval.start;
                end = interval.end;
                
            }    
        }
        list.add(new Interval(start, end)); 
        return list;
    }
}
