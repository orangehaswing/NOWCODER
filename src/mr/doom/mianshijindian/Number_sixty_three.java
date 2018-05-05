package mr.doom.mianshijindian;

public class Number_sixty_three {
	public int getMaxSum(int[] A, int n) {
		// 对于一个有正有负的整数数组，请找出总和最大的连续数列。
		// 给定一个int数组A和数组大小n，请返回最大的连续数列的和。
		// 保证n的大小小于等于3000。
		// write code here
		int max = A[0];
		int res = A[0];
		for (int i = 1; i < n; i++) {
			//前i个的max值如果是正数，保留，为负数，舍去
			if (max+A[i] > A[i]) { 
				max = max+A[i];  
			}
			else {
				max = A[i];
			}
			if (max > res) {
				res = max; //记录最大结果
			}
		}
		
		return res;
    }
}
