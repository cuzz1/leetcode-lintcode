package src;

import java.util.ArrayList;
import java.util.List;

public class Solution425 {
    
    List<String> res = new ArrayList<String>();
    /**
     * @param digits: A digital string
     * @return: all posible letter combinations
     */
    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)) {
            return res;
        }
        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        String[] strArray = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            strArray[i] = map[Integer.valueOf(digits.substring(i, i+1))];
        }
        helper(strArray, 0,new StringBuilder());
        return res;
    }
    
    private void helper(String[] strArray, int index,StringBuilder sb) {
        if (strArray.length == sb.length()) {
            res.add(sb.toString());
            return;
        }
        
        for (int i = 0; i < strArray[index].length(); i++) {
            sb.append(strArray[index].substring(i, i+1));
            helper(strArray, index + 1, sb);
            // 回溯
            sb.delete(sb.length()-1, sb.length());
        }
    }
}



