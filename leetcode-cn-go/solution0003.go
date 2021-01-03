func lengthOfLongestSubstring(s string) int {
    res := 0
    if len(s) <= 0 {
        return res;
    }
    // abcabcbb
    // i   j
    // 双指针，map 保存这个字符上一次出现的位置
    lastRecordMap := make(map[byte]int)
    for i, j := -1, 0; j < len(s); j++ {
        c := s[j]
        if v, ok := lastRecordMap[c]; ok {
            i = max(i, v)
        }
        lastRecordMap[c] = j
        res = max(res, j - i);
    }
    return res
}

func max (i, j int) int {
    if i > j {
        return i
    }
    return j
}
