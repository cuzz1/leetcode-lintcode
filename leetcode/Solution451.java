class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Character>[] array = new ArrayList[s.length() + 1];
        
        for (char c : map.keySet()) {
            int value = map.get(c);
            if (array[value] == null) {
                array[value] = new ArrayList<>();
            }
            array[value].add(c);
        }
        
        StringBuilder str = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == null) {
                continue;
            }
            
            for (char c : array[i]) {
                for (int j = 0; j < i; j++) {
                    str.append(c);
                }
            }
            
        }
        
        return new String(str);

    }
}
