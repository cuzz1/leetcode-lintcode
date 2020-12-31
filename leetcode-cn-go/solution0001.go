func twoSum(nums []int, target int) []int {
    res := make([]int, 2)
    size := len(nums)
    if size < 2 {
        return res
    }
    cache := make(map[int]int)
    for i := 0; i < size; i++ {
        key := target - nums[i]
        if v, ok := cache[key]; ok {
            res[0] = v; 
            res[1] = i;
            return res
        }
        cache[nums[i]] = i
    }
    return res
}
