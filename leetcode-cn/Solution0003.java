class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        if (s == null || s.length() == 0) {
            return res;
        }
        // abcabcbb
        // i   j
        // 存放最后一次的记录 
        Map<Character, Integer> map = new HashMap<>();
        for (int i = -1, j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(i, map.get(c));
            } 
            map.put(c, j);
            res = Math.max(res, j - i);
        }
        return res;
    }
}
