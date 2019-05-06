class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s == null || s.length() == 0) return 0;
        
        int res = 0;
        
        // 存放遍历后字符以及位置
        Map<Character, Integer> map = new HashMap<>();
        
        // a b c a b c b b
        // i     j
        for (int i = 0, j = 0; j < s.length(); j++) {
            
            char c = s.charAt(j);
            
            if (map.containsKey(c)) {
                i = Math.max(i, map.get(c) + 1);
            }
            map.put(c, j);
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
