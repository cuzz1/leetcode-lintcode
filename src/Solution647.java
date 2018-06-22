package src;

import java.util.ArrayList;
import java.util.List;

public class Solution647 {
    /**
     * @param s: a string
     * @param p: a string
     * @return: a list of index
     */
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int right = p.length() - 1; // [left, right] 是滑动窗口的大小
        
        List<Integer> list = new ArrayList<>();
       
        int[] freq = new int[256]; 
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i)]++;
        }
        
        while (right < s.length()) {
            if (isFind(s, left, right, freq)) {
                list.add(left);
            }
            left++;
            right++;
        }
        return list;
    }
    
    private boolean isFind(String s, int left, int right, int[] freq) {
        int[] newFreq = new int[256];
        for (int i = left; i <= right; i++) {
            newFreq[s.charAt(i)]++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (newFreq[i] != freq[i]) {
                return false;
            }
        }
        return true;
    }
    
    
}