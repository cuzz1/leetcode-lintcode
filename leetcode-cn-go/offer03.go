func findRepeatNumber(nums []int) int {
    if len(nums) <= 0 {
        return -1
    }

    slice := make([]uint8, len(nums))
    for _, n := range nums {
        if slice[n] > 0 {
            return n
        }
        slice[n]++
    }
    return -1
}
