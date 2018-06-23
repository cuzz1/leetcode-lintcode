package src;

import java.util.HashMap;
import java.util.Map;

public class Solution828 {
    /**
     * @param pattern: a string, denote pattern string
     * @param str: a string, denote matching string
     * @return: an boolean, denote whether the pattern string and the matching string match or not
     */
    public boolean wordPattern(String pattern, String str) {
        // 如果key 存在， value不一样，退出；
        // 如果key不存在， value存在， 退出
        char[] charArr = pattern.toCharArray();
        String[] strArr = str.split(" ");
        
        Map<Character, String> map = new HashMap<>();
        
        for (int i = 0; i < charArr.length; i++) {
            char key = charArr[i];
            String value = strArr[i];
            if (map.containsKey(key) && !map.get(key).equals(value)) {
                  return false;
            }
            
            if (!map.containsKey(key) && map.containsValue(value)) {
                return false;
            }
            map.put(key, value);
        }
        return true;
    }
}