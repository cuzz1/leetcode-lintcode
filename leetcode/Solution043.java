class Solution {
    public String multiply(String num1, String num2) {
        int[] digits = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                int p1 = i + j; 
                int p2 = i + j + 1;
                int sum = mul + digits[p2];
                digits[p2] = sum % 10;
                digits[p1] += sum / 10;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int digit : digits) {
            if (res.length() == 0 && digit == 0) {
                continue;
            }
            res.append(digit);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}
