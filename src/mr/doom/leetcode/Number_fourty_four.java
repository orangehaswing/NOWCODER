package mr.doom.leetcode;

public class Number_fourty_four {
	public static int firstMissingPositive(int[] A) {
		// Given an unsorted integer array, find the first missing positive integer.
		//
		// For example,
		// Given[1,2,0]return3,
		// and[3,4,-1,1]return2.
		//
		// Your algorithm should run in O(n) time and uses constant space.

		// TODO 对负数的排序错误
		if (A == null || A.length == 0) {
			return 1;
		}

		// 错误
		// int index = 0;
		//
		// for (int i = 0; i < A.length; i++) {
		// index = A[i]; //需要的是A[i]这个位置的值，不是当前值，使用这种赋值错误
		// while(index > 0 && index <= A.length && index != A[index-1]) {
		// swap(A,i,A[i]-1);
		// }
		// }

		for (int i = 0; i < A.length; i++) {
			while (A[i] > 0 && A[i] <= A.length && A[i] != A[A[i] - 1]) {
				swap(A, i, A[i] - 1);
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] - 1 != i) {
				return i + 1;
			}
		}

		return A.length + 1;
	}

	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, -1, 1 };
		int i = firstMissingPositive(a);
	}

}
