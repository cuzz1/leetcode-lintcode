func findNumberIn2DArray(matrix [][]int, target int) bool {

    if len(matrix) == 0 || len(matrix[0]) == 0 {
        return false
    }

    row := len(matrix) 
    col := len(matrix[0]) 

    i := 0
    j := col - 1

    for i < row && j >= 0 {
        val := matrix[i][j]
        if target > val {
            i++
        } else if target < val {
            j--
        } else {
            return true
        }
    }

    return false

}
