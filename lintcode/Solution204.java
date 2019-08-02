class Solution {
    
    private static volatile Solution instance = null;

    public static Solution getInstance() {
        
        if (instance == null) {
            synchronized(Solution.class) {
                if (instance == null) {
                    instance = new Solution();
                }
            }
        }
        return instance;
    }
};
