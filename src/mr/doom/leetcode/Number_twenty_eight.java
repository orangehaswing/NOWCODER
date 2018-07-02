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
		
		// ��һ���ǳ����bug��ʵ�ʰ�����ֻҪ a = s�Ϳ���ͨ�����еĲ��������������޷�ͨ��
		// ţ�Ͳ��ԣ����ղ���ȫ����ֵ�ķ�ʽ���
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
