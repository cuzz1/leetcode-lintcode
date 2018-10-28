class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs, Comparator.comparing(String::length));
        
        String str0 = strs[0];
        
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < str0.length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (str0.charAt(j) != strs[i].charAt(j)) {
                    return sb.toString();
                }
            }
            sb.append(str0.charAt(j));
        }
        return sb.toString();
        
    }
}

// O(N)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } 
        
        String res = strs[0];
        
        for (int i = 0; i < strs.length; i++) {
            // 必须找到等于0的这个子序列
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}
