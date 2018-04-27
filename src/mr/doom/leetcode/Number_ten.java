package mr.doom.leetcode;

import javax.print.DocFlavor.READER;

public class Number_ten {
	public int maxSubArray(int[] A) {
		// Find the contiguous subarray within an array
		// (containing at least one number) which has the largest sum.
		// For example, given the array[−2,1,−3,4,−1,2,1,−5,4],
		// the contiguous subarray[4,−1,2,1]has the largest sum =6.
		// click to show more practice.
		int sum = A[0];
		int maxsum = A[0];
		if (A.length == 0) {
			return 0;
		}
		
		if (A.length == 1) {
			return A[0];
		}
		
		for (int i = 1; i < A.length; i++) {
			if (sum < 0) {
				sum = A[i];
			}else {
				sum += A[i];
			}
			maxsum = Math.max(maxsum, sum);
		}
		
		return maxsum;
	}
}
