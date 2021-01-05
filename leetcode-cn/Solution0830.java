class Solution {
    // public List<List<Integer>> largeGroupPositions(String s) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     if (s == null || s.length() == 0) {
    //         return res;
    //     }

    //     int p = 0;
    //     char c = s.charAt(0);

    //     for (int i = 1; i <= s.length(); i++) {
    //         if (i == s.length()) {
    //             if ((i - p)  >= 3) {
    //                 List<Integer> list = new ArrayList();
    //                 list.add(p);
    //                 list.add(i-1);
    //                 res.add(list);
    //             }
    //             return res;
    //         }
    //         char temp = s.charAt(i);
    //         if (temp != c) {
    //             if ((i - p)  >= 3) {
    //                 List<Integer> list = new ArrayList();
    //                 list.add(p);
    //                 list.add(i-1);
    //                 res.add(list);
    //             }
    //             p = i;
    //             c = temp;
    //         }
    //     }
    //     return res;
    // }

        public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }

        int start = 0;
        int end = 0;
        char c = s.charAt(0);
        while(end < s.length()) {
            char temp = s.charAt(end);
            if (temp != c) {
                if ((end - start)  >= 3) {
                    List<Integer> list = new ArrayList();
                    list.add(start);
                    list.add(end-1);
                    res.add(list);
                }
                start = end;
                c = temp;
            }
            end++;
        }
        if ((end - start)  >= 3) {
            List<Integer> list = new ArrayList();
            list.add(start);
            list.add(end-1);
            res.add(list);
        }
        return res;
    }
}
