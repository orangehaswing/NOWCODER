package mr.doom.leetcode;

import java.util.Vector;

public class Number_eighteen {
	public int uniquePaths(int m, int n) {
		// A robot is located at the top-left corner of a m x n grid
		// (marked 'Start' in the diagram below).
		// The robot can only move either down or right at any point in time.
		// The robot is trying to reach the bottom-right corner of the grid
		// (marked 'Finish' in the diagram below).
		// How many possible unique paths are there?
		
		// ”≈ªØ
		int[][] grid = new int[m][n];
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0 || j == 0) {
					grid[i][j] = 1;
					continue;
				}
				grid[i][j] = grid[i][j-1] + grid[i-1][j];
			}
		}
		
		res = grid[m-1][n-1];
		return res;

		//success
//		if (m == 0 || n == 0) {
//			return 0;
//		}
//		
//		if(m == 1 || n == 1) {
//			return 1;
//		}
//		
//		int[][] grid = new int[m][n];
//		int res = 0;
//		
//		for (int i = 0; i < n; i++) {
//			grid[0][i] = 1;
//		}
//		for (int j = 0; j < m; j++) {
//			grid[j][0] = 1;
//		}
//		
//		for (int i = 1; i < m; i++) {
//			for (int j = 1; j < n; j++) {
//				grid[i][j] = grid[i][j-1] + grid[i-1][j];
//			}
//		}
//		
//		res = grid[m-1][n-1];
//		return res;
	}
}
