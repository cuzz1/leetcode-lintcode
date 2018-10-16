class Solution {
    public String reverseVowels(String s) {
        List<Character> vowls = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i = 0;
        int j = s.length() - 1;
        
        char[] chars = s.toCharArray();

        while (i < j) {
            if (!vowls.contains(s.charAt(i))) {
                i++;
            } else if (!vowls.contains(s.charAt(j))) {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        } 
        return new String(chars);
    }
}
