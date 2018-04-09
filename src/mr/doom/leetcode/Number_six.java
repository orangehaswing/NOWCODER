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
		// ̰���㷨 ˼·:���ƿ��Ϊ���ֵ��Ȼ���С��ȣ������߶ȣ���ȥһ��ʼ�͵͵ĸ߶�ֵ��
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
		// �����㷨 �����������������������ֵ
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
