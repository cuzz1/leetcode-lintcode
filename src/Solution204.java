package src;

public class Solution204 {
    /**
     * @return: The same instance of this class every time
     */
	
	private static Solution204 solution;
	private Solution204() {
		
	}

    public static Solution204 getInstance() {
        // write your code here
    	if (solution == null) {
    		solution = new Solution204();
    	}
    	return solution;
    }
}
