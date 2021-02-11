class Solution {
    public int minArray(int[] numbers) {

        if (numbers.length <= 0) return -1;
        if (numbers.length == 1) return numbers[0];

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int mid = left + ((right - left) >> 2);
            // 只要右边比中间大，那右边一定是有序数组
            if (numbers[right] > numbers[mid]) {
                right = mid;
            } else if (numbers[right] < numbers[mid]) {
                left = mid + 1;
            } else { // 去重
                right--;
            }
        }

        return numbers[left];

    }
}
