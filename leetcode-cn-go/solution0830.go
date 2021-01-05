func largeGroupPositions(s string) [][]int {
    res := make([][]int, 0)
    if len(s) <= 0 {
        return res
    }

    start := 0
    end := 0
    b := s[0]
    for ;end < len(s); end++ {
        if b != s[end] {
            if end - start >= 3 {
                list := []int{start, end - 1}
                res = append(res, list)
            }
            start = end
            b = s[end]
        } 
    }
    if end - start >= 3 {
        list := []int{start, end - 1}
        res = append(res, list)
    }

    return res

}
