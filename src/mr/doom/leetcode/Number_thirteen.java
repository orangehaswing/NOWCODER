package mr.doom.leetcode;

public class Number_thirteen {
	public int climbStairs(int n) {
		// You are climbing a stair case.
		// It takes n steps to reach to the top.
		// Each time you can either climb 1 or 2 steps.
		// In how many distinct ways can you climb to the top?
		//动态规划
//		if (n < 3) {
//			return n;
//		}
//		
//		int[] res = new int[n+1];
//		res[1] = 1;
//		res[2] = 2;
//		for (int i = 3; i < n+1; i++) {
//			res[i] = res[i-1] + res[i-2];
//		}
//		return res[n];
	
		//非递归
		if (n < 3) {
			return n;
		}
		
		int res1 = 1;
		int res2 = 2;
		int temp = 0;
		for (int i = 3; i < n+1; i++) {
			temp = res1 + res2;
			res1 = res2;
			res2 = temp;
		}
		
		return temp;
		
		//递归 复杂度高，超时
//		if(n < 1) {
//			return 0;
//		}
//		if (n == 1) {
//			return 1;
//		}
//		if (n == 2) {
//			return 2;
//		}
//		
//		return climbStairs(n-1) + climbStairs(n-2);
	}
}
