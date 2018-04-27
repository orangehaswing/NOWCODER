package mr.doom.leetcode;

public class Number_twenty {
public int[][] generateMatrix(int n) {
//	Given an integer n, 
//	generate a square matrix filled with elements from 1 to n^2 
//	in spiral order. ����˳��
//	eg:
//	Given n =3,
//	You should return the following matrix:
//	[
//	 [ 1, 2, 3 ],
//	 [ 8, 9, 4 ],
//	 [ 7, 6, 5 ]
//	]
	
	//�㷨���Ӷȹ���
	int[][] mat = new int[n][n];
	int count = 1;
	//��
	int row_start = 0; 
	int row_end = n-1;
	//��
	int col_start = 0;
	int col_end = n-1;
	
	while(count <= n*n) {
		//�� �ϲ���
		for (int i = col_start; i <= col_end; i++) {
			mat[row_start][i] = count;
			count++;
		}
		row_start++;
		
		//�� �Ҳ���
		for (int i = row_start; i <= row_end; i++) {
			mat[i][col_end] = count;
			count++;
		}
		col_end--;
		//�� �²���
		for (int i = col_end; i >= col_start; i--) {
			mat[row_end][i] = count;
			count++;
		}
		row_end--;
		//�� �󲿷�
		for (int i = row_end; i >= row_start; i--) {
			mat[i][col_start] = count;
			count++;
		}
		col_start++;
	}
	
	return mat;
    }
}
