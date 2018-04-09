package mr.doom.leetcode;

public class Number_six {
	public int maxArea(int[] height) {
		// Given n non-negative integers a1 , a2 , ..., an ,
		// where each represents a point at coordinate (i, ai ).
		// n vertical lines are drawn such that the two endpoints of line i is at
		// (i, ai ) and (i, 0).
		// Find two lines, which together with x-axis forms a container,
		// such that the container contains the most water.
		// Note: You may not slant the container.
		// 贪心算法 思路:控制宽度为最大值，然后减小宽度，找最大高度（舍去一开始就低的高度值）
		int result = 0;
		if (height.length <= 1)
			return result; 
		int i = 0, j = height.length - 1;
		while (i < j) {
			int area = (j - i) * Math.min(height[i], height[j]);
			if (area > result)
				result = area;
			if (height[i] > height[j]) {
				j--;
			} else {
				i++;
			}

		}

		return result;
		// 暴力算法 把所有情况都算出来，求最大值
		// int max = 0;
		// int res = 0;
		// for (int i = 0; i < height.length; i++) {
		// for (int j = 1; j < height.length; j++) {
		// res = (j-i)*Math.min(height[i], height[j]);
		// max = Math.max(max, res);
		// }
		// }
		//
		// return max;
	}
}
