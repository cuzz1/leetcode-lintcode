package src;

public class Solution463 {
    /**
     * @param A: an integer array
     * @return: nothing
     */
	public static void main(String[] args) {
		int[] A = new int[]{3, 1, 2, 4, 5};
		sortIntegers(A);
		for(int a : A){
			System.out.print(a + " ");
		}
	}
    public static void sortIntegers(int[] A) {
        // 使用快速排序
    	int start = 0;
    	int end = A.length - 1;
    	sort(A, start, end);
    }

	private static void sort(int[] array, int start, int end) {
		if(start > end){
			return;
		}
		int t = divide(array, start, end);
		sort(array, start, t-1);
		sort(array, t+1, end);
	}

	private static int divide(int[] array, int start, int end) {
		int flag = array[end];
		int i = start;
		
		for(int j = start; j <= array.length - 1; j++){
			if(array[j] < flag){
				exch(array, i, j);
				i++;
			}	
		}
		exch(array, i, end);
		return i;
	}
	
	
	private static void exch(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}
}