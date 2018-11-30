public class Solution {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        final String FIZZ = "fizz";
        final String BUZZ = "buzz";
        final String FIZZ_BUZZ = "fizz buzz";
        
        List<String> res = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add(FIZZ_BUZZ);
            } else if (i % 3 == 0) {
                res.add(FIZZ);
            } else if (i % 5 == 0) {
                res.add(BUZZ);
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
