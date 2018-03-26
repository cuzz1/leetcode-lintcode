package src;

import java.util.ArrayList;
import java.util.List;

import extend.Interval;

public class Solution030 {
    /*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> result = new ArrayList<Interval>();
    	int insertPos = 0;
    	for(Interval interval: intervals){
    		if(interval.end < newInterval.start){
    			result.add(interval);
    			insertPos++;
    		}else if(interval.start > newInterval.end){
    			result.add(interval);
    		}else{
    			newInterval.start = Math.min(interval.start, newInterval.start);
    			newInterval.end = Math.max(interval.end, newInterval.end);
    		}
    	}
    	result.add(insertPos, newInterval);
    	return result;
    }
}