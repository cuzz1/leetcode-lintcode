package src;

import java.util.ArrayList;

public class Solution421 {
    /**
     * @param path: the original path
     * @return: the simplified path
     */
    public String simplifyPath(String path) {
        String res = "/";
        String[] strArray = path.split("/+");
        ArrayList<String> list = new ArrayList<>();
        
        for (String s : strArray) {
            if (s.equals("..")) {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                }
            }
            
            if (!s.equals(".") && !s.equals("") && !s.equals("..")) {
                list.add(s);
            }
        }
        
        System.out.println(list);
        
        for (String s : list) {
            res += s + "/";
        }
        
        if (res.length() > 1) {
            res = res.substring(0, res.length() - 1);
        }
        return res;
        
    }
}
