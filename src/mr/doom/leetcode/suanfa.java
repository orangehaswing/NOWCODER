package mr.doom.leetcode;

public class suanfa {
	static int getres(int[] nums) {
		int res = nums[0];
		int cur = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			cur = Math.max(nums[i]+cur, nums[i]);
			res = Math.max(cur, res);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,-1,3,4,5,-10};
		int[] b = {-2,-3,-1,-5};
		int i = getres(b);
		System.out.println(i);
	}
}
