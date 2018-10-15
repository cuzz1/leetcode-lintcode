package src;

import java.util.LinkedList;
import java.util.Queue;

public class Solution513 {
    /**
     * 使用图的广度优先
     * https://www.bilibili.com/video/av24299540/?p=22&t=567
     * @param n: a positive integer
     * @return: An integer
     */
    public int numSquares(int n) {
        
        if (n <= 0) {
            return 0;
        }
        
        Queue<Tuple<Integer, Integer>> queue = new LinkedList<>();
        
        queue.offer(new Tuple<Integer, Integer>(n, 0));
        
        while (!queue.isEmpty()) {
            Tuple<Integer, Integer> tuple = queue.poll();
            int num = tuple.getFirst();
            int step = tuple.getSecond();
            
            if (num == 0) {
                return step;
            }
            
            // 这样超出了时间 
            //for (int i = 0; num - i*i > 0; i++) {
            //    queue.offer(new Tuple<Integer, Integer>(num - i*i, step + 1));
            //}
            for (int i = (int) Math.sqrt(num); i >= 1; i--) {
                queue.offer(new Tuple<Integer, Integer>(num - i*i, step + 1));
            }
        }
        
        return 0;
    }
    
    private class Tuple<A, B> {
        private A first;
        private B second;
        
        public Tuple(A first, B second) {
            this.first = first;
            this.second = second;
        }
        
        public A getFirst() {
            return first;
        }
        
        public B getSecond() {
            return second;
        }
        
    }
}