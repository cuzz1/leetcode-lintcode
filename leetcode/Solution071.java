class Solution {
    public String simplifyPath(String path) {
        
        String res = "";
        Stack<String> stack = new Stack<>();
        
        String[] strs = path.split("/+");
        
        // "" . .. abc
        
        for (String str : strs) {
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (str.equals("") || str.equals(".")) {
                ;
            } else {
                stack.push(str);
            }    
        }
        
        while (!stack.isEmpty()) {
            res = "/" +  stack.pop() + res;
        }
        
        return res.length() == 0 ? "/" : res;
        
    }
}
