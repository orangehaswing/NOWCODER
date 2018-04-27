package mr.doom.leetcode;

import java.awt.List;
import java.util.ArrayList;

public class Number_twenty_one {
	public static void setZeroes(int[][] matrix) {
		// Given a m x n matrix, if an element is 0,
		// set its entire row and column to 0. Do it in place.
		//分三步：
		// 1：记录为0的位置
		// 2：清除0位置的所有行
		// 3：清除0位置的所有列
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> col = new ArrayList<Integer>();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}
		
		int line = 0;
		for (int i = 0; i < row.size(); i++) {
			line = row.get(i);
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[line][j] = 0;
			}   
		}
	
		line = 0;
		for (int i = 0; i < row.size(); i++) {
			line = col.get(i);
			for (int j = 0; j < matrix.length; j++) {
				matrix[j][line] = 0;
			}   
		}
    }
	
	public static void main(String[] args) {
		int[][] mat = {{0}};
		setZeroes(mat);
	}
}
