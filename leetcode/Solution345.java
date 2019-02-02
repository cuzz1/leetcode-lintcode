class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] res = new char[s.length()];
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!set.contains(ci)) {
                res[i] = ci;
                i++;
            } else if (!set.contains(cj)) {
                res[j] = cj;
                j--;
            } else {
                res[i] = cj;
                res[j] = ci;
                i++;
                j--;
            }
        }
        return new String(res);
    }
}
