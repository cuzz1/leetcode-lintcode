class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        Set<Character> set = new HashSet(Arrays.asList('(','[','{'));
        
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == ')' && stack.pop() != '(') {
                    return false;
                }
                if (s.charAt(i) == ']' && stack.pop() != '[') {
                    return false;
                }
                if (s.charAt(i) == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
