class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), n, k, 1);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> list, int n, int k, int start) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return; 
        }
        for (int i = start; i <= n; i++) {
            if (list.contains(i)) continue;
            list.add(i);
            helper(res, list, n, k, ++start);
            list.remove(list.size()-1);
        }
    }
}
