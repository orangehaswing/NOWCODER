package mr.doom.leetcode;

public class Number_twenty_eight {
	public static void merge(int A[], int m, int B[], int n) {
		// Given two sorted integer arrays A and B,
		// merge B into A as one sorted array.
		
		int[] s = new int[m+n];
		
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < m && j < n) {
			if (A[i] < B[j]) {
				s[count] = A[i];
				i++;
				count++;
			}else {
				s[count] = B[j];
				j++;
				count++;
			}
		}
		
		if (i == m) {
			for (; j < n; j++) {
				s[count] = B[j];
				count++;
			}
		}else if(j == n){
			for (; i < m; i++) {
				s[count] = A[i];
				count++;
			}
		}
		
		// 这一步是程序的bug，实际按题意只要 a = s就可以通过下列的测试用例，但是无法通过
		// 牛客测试，最终采用全部赋值的方式解决
		for (int k = 0; k < s.length; k++) {
			A[k] = s[k];
		}
		
	}
	
	public static void main(String[] args) {
		int[] A = {3};
		int[] B = {1,2,4};
		merge(A,1,B,3);
	}
	
}
