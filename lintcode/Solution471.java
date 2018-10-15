package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution471 {
    /**
     * @param words: an array of string
     * @param k: An integer
     * @return: an array of string
     */
    public String[] topKFrequentWords(String[] words, int k) {
        // String is word, Integer is frequency
        Map<String, Integer> map = new HashMap<>();
        List<Tuple> list = new ArrayList<>();
        String[] res = new String[k];
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // java 8 
            // Integer frequence = map.getOrDefault(word, 0) + 1;
            // map.put(word, frequence);
        }
        
        for (String word : map.keySet()) {
            list.add(new Tuple(map.get(word), word));
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getSecond();
        }
        
        return res;
    }
    
    private class Tuple implements Comparable<Tuple>{
        
        private Integer first;
        private String second;
        
        @Override
        public int compareTo(Tuple tuple) {
        	if (this.first == tuple.first) {
        	    return this.second.compareTo(tuple.second);
        	    
        	} else if (this.first < tuple.first) {
        		return  1;
        	} else {
        		return -1;
        	}
        }
        
        public Tuple(Integer first, String second) {
            this.first = first;
            this.second = second;
        }
        
        public Integer getFirst() {
            return first;
        }
        
        public String getSecond() {
            return second;
        }
    }
}