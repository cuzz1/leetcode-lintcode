class Solution {
    public List<String> restoreIpAddresses(String s) {

        List<String> res = new ArrayList<>();


        int len = s.length();

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4 && i + j < len; j++) {
                for (int k = 1; k < 4 && i + j + k < len; k++) {
                    for (int l = 1; l < 4 && i + j + k + l <= len; l++) {
                        int part1 = Integer.parseInt(s.substring(0, i));
                        int part2 = Integer.parseInt(s.substring(i, i + j));
                        int part3 = Integer.parseInt(s.substring(i + j, i + j + k));
                        int part4 = Integer.parseInt(s.substring(i + j + k, i + j + k + l));

                       if (part1 <= 255 && part2 <= 255 && part3 <= 255 && part4 <= 255 && ("" + part1 + part2 + part3 + part4).equals(s)) {
                           res.add(part1 + "." + part2 + "." + part3 + "." + part4);
                       }
                    }
                } 
            }
        }
        return res;
        
    }
}
