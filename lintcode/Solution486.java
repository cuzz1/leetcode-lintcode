package src;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution486 {
    /**
     * @param arrays: k sorted integer arrays
     * @return: a sorted array
     */
    public int[] mergekSortedArrays(int[][] arrays) {
        
        
        Queue<Tuple> queue = new PriorityQueue<Tuple>();
        int count = 0;
        
        for (int i = 0; i < arrays.length; i++) {
            
            if (arrays[i].length == 0) {
                continue;
            }
            queue.offer(new Tuple(arrays[i], 0));
            count += arrays[i].length;
        }
        
        
        int m = 0;
        int res[] = new int[count];
        
        
        while (!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            res[m++] = tuple.arr[tuple.index];
            
            if (tuple.index < tuple.arr.length - 1) {
                queue.offer(new Tuple(tuple.arr, tuple.index + 1));
            }
        }
        
        return res;
        
    }
    
    private class Tuple implements Comparable<Tuple> {
        private int[] arr;
        private int index;
        
        public Tuple(int[] arr, int index) {
            this.arr = arr;
            this.index = index;
        }
        
        @Override
        public int compareTo(Tuple tuple) {
            return this.arr[this.index] - tuple.arr[tuple.index];
        }
    }
}