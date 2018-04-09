package mr.doom.leetcode;

public class Number_five {
	public int singleNumber(int[] A) {
		// Given an array of integers, every element appears twice except for one. Find
		// that single one.
		// Note:
		// Your algorithm should have a linear runtime complexity.
		// Could you implement it without using extra memory?
		//better algo 两个相同的数进行异或，结果为0
		// 1.异或满足交换律。
		// 2.相同两个数异或为0。
		// 3.0异或一个数为那个数本身。
		int result = A[0];
        for (int i = 1; i < A.length; i++)
            result = result ^ A[i];
        return result;
		
		
		
//		//方法复杂，考虑边界值太多
//		if (A.length == 1)
//			return A[0];
//		
//		int single = 0;
//		//排序
//		for (int i = 0; i < A.length; i++) {
//			int temp = 0;
//			for (int j = i; j < A.length; j++) {
//				if (A[j] < A[i]) {
//					temp = A[j];
//					A[j] = A[i];
//					A[i] = temp;
//				}
//			}
//		}
//		
//		if(A[0] != A[1]) {
//			return A[0];
//		}
//		if(A[A.length - 1] != A[A.length-2]) {
//			return A[A.length - 1];
//		}
//		//比较
//		for (int i = 1; i < A.length-1; i++) {
//			if (A[i] != A[i-1]) {
//				if(A[i] != A[i+1]) {
//					single = A[i];
//				}
//			}
//		}
//		
//		return single;

	}
}
