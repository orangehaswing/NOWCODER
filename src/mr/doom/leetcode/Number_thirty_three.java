package mr.doom.leetcode;

public class Number_thirty_three {
	public boolean searchMatrix(int[][] matrix, int target) {
		// Write an efficient algorithm that searches for a value in an m x n matrix.
		// This matrix has the following properties:
		// Integers in each row are sorted from left to right.
		// The first integer of each row is greater than the last integer of the
		// previous row.
		//
		// For example,
		// Consider the following matrix:
		// [
		// [1, 3, 5, 7],
		// [10, 11, 16, 20],
		// [23, 30, 34, 50]
		// ]
		// Given target =3, return true.
		
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		
		//从右上角开始遍历，往左为小于该值，往下为大于该值
		int m = 0;
		int n = matrix[0].length - 1;
		
		while((m < matrix.length) && (n >= 0)) { //用&&操作符，两者同时满足
			if (matrix[m][n] >target) {
				n--;
			}else if(matrix[m][n] < target){
				m++;
			}else if(matrix[m][n] == target){
				return true;
			}
		}
		
		return false;
	}
}
