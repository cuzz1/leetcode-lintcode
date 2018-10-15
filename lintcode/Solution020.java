package src;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution020{
    /**
     * @param n an integer
     * @return a list of Map.Entry<sum, probability>
     */
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        // Write your code here
        // Ps. new AbstractMap.SimpleEntry<Integer, Double>(sum, pro)
        // to create the pair
       
       List<Map.Entry<Integer, Double>> results = new ArrayList<Map.Entry<Integer, Double>>();
       
       double[][] f = new double[n + 1][6*n + 1];
       for (int i = 1; i <= 6; i++) {
           f[1][i] = 1.0 / 6;
       }
       
       for (int i = 2; i <= n; i++) {
           for (int j = i; j <= 6 * n; j++) {
               // 第n和骰子的点数可能是1-6
               for (int k = 1; k <= 6; k++) {
                   // j - k 必须严格大于0
                   // i 表示投掷的次数
                   // j 表示点数总和
                   if (j > k) {
                       // 前(n-1)个骰子点数之和为j
                       f[i][j] += f[i-1][j-k];
                   }
               }
               // f[i][j] /= 6.0,算的是所有的概率，除一下表示一次
               // 所以除以6以后，它才是真正的 P(A)，其实本来该是在  f[i][j] += f[i - 1][j - k]; 句除以6，表示 "每种能凑出点数总和为 j 的情况出现的概率之和"，但既然先只是累加求和，求完和除以6，也是一样的，毕竟乘法有分配律 
               f[i][j] /= 6.0;
           }
           
       }
       
        for (int i = n; i <= 6 * n; ++i) 
            results.add(new AbstractMap.SimpleEntry<Integer, Double>(i, f[n][i]));

        return results;
       
    }
}