class Solution {
    public int reverse(int x) {
        // 小于零
        boolean flag = false;
         if (x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
             return 0;
        }
        if (x < 0) {
            x = -x;
            flag = true; 
        }
        
       String str = x + "";
        
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char c = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = c;
        }
        
        long res = Long.parseLong(new String(array));
        
        if (flag == true) {
            res = - res;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            res = 0;
        }
        return (int) res;
        
        
    }
}
