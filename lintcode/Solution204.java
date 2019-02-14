class Solution {
    /**
     * @return: The same instance of this class every time
     */
    
    private volatile static Solution instance = null;
    
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
