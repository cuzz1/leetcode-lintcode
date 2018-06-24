package src;

import java.util.HashMap;
import java.util.Map;

public class Solution638 {
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            // 如果map中存在这个key 则要与这个value相等
            if (map.containsKey(key) && map.get(key) != value) {
                return false;
            }
           
            // 如果map中不存在这个key 则map中不能有这个value 
            if (!map.containsKey(key) && map.containsValue(value)) {
                return false;
            }
            
            map.put(key, value);
        }
        return true;
    }
}