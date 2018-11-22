class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) return res; 
        // 第一个eat 在map中 map  aet : 1 
        Map<String, Integer> map = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String str1 = new String(chars);
            
            if (map.containsKey(str1)) {
                // res.get(map.get(str1)).add(str);`
                int index = map.get(str1);
                List<String> list = res.get(index);
                list.add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(str1, map.size());
                res.add(list);
            }
        }
        return res;
    }
}
