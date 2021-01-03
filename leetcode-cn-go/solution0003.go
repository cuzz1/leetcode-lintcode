// func lengthOfLongestSubstring(s string) int {
//     res := 0
//     if len(s) <= 0 {
//         return res;
//     }
//     // abcabcbb
//     // i   j
//     // 双指针，map 保存这个字符上一次出现的位置
//     lastRecordMap := make(map[byte]int)
//     for i, j := -1, 0; j < len(s); j++ {
//         c := s[j]
//         if v, ok := lastRecordMap[c]; ok {
//             i = max(i, v)
//         }
//         lastRecordMap[c] = j
//         res = max(res, j - i);
//     }
//     return res
// }

func max(i, j int) int {
    if i > j {
        return i
    }
    return j
}

func lengthOfLongestSubstring(s string) int {
    res := 0
    if len(s) <= 0 {
        return  res;
    }

    // abcabcbb
    // i j
    var lastRecord [128]int
    for i := 0; i < len(lastRecord); i++ {
        lastRecord[i] = -1
    }

    for i, j := -1, 0; j < len(s); j++ {
        b := s[j]
        // 表示存在
        if lastRecord[b] >= 0 {
            i = max(i, lastRecord[b])
        }
        lastRecord[b] = j
        res = max(res, j - i)
    } 
    return res;
}
