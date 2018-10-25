class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        
        StringBuilder[] array = new StringBuilder[numRows];
        
        // init
        for (int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder();
        }
        // P   
        // A P   // 看成一个周期
        // Y  
        for (int i = 0; i < s.length(); i++) {
            int index = i % (2 * numRows - 2);
            index = index < numRows ? index : 2 * numRows - 2 - index;
            array[index].append(s.charAt(i));
        }
        
        for (int i = 1; i < array.length; i++) {
            array[0].append(array[i]);
        }
        
        return array[0].toString();
    }
}
