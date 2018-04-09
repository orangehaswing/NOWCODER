package mr.doom.mianshijindian;

public class Number_fifty_five {
    public int[] findNext(int[] A, int n) {
		// 现在我们有一个int数组，请你找出数组中每个元素的下一个比它大的元素。
		// 给定一个int数组A及数组的大小n，请返回一个int数组，代表每个元素比他大的下一个元素,
		// 若不存在则为-1。保证数组中元素均为正整数。
        // write code here
    	int[] b =new int[n];
    	for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (A[i] < A[j]) {
					b[i] = A[j];
					break;
				}
				b[i] = -1;	
			}
		}
    	return b;
    }
}
