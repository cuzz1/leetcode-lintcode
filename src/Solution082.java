package src;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Solution082 {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        
        for (int a : A) {
        	if (dict.containsKey(a)){
        		int value = dict.get(a) + 1;
        		dict.put(a, value);
        	} else {
        		dict.put(a, 1);
        	}
        }
        
        Set<Integer> keySet = dict.keySet();
        for (int key : keySet) {
        	int value = dict.get(key);
        	if (value == 1) {
        		return key;
        	}
        }
		return 0;
    }
}