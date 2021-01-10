func summaryRanges(nums []int) []string {

    slice := make([]string, 0)

    if len(nums) == 0 {
        return slice 
    }

    left, right := 0, 1

    for right < len(nums) {
        if nums[right] > nums[right-1] + 1 {
            slice = append(slice, getStr(nums[left], nums[right - 1]))
            left = right;
        }
        right++
    }
    if len(nums) > 0 {
        slice = append(slice, getStr(nums[left], nums[right-1]))
    }
    return slice
}

// func getStr(a, b int) string {
// 	if a == b {
// 		return strconv.Itoa(a)
// 	}
// 	return strconv.Itoa(a) + "->" + strconv.Itoa(b)
// }

func getStr(a, b int) string {
	var sb strings.Builder
	if a == b {
		fmt.Fprintf(&sb, "%d", a)
        return sb.String()
	}
	fmt.Fprintf(&sb, "%d->%d", a, b)
	return sb.String()
}
