package mr.doom.leetcode;

public class Number_eleven {
    public void rotate(int[][] matrix) {
		// You are given an n x n 2D matrix representing an image.
		// Rotate the image by 90 degrees (clockwise).
    	//	1 2 3		7 8 9		7 4 1
    	//	4 5 6  -->  4 5 6  -->	8 5 2
    	//	7 8 9 		1 2 3		9 6 3
     	
    	int len = matrix[0].length;
    	for (int i = 0; i < len/2; i++) { //note:i < len/2
    		int temp = 0;
			for (int j = 0; j < len; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[len-1-i][j];
				matrix[len-1-i][j] = temp;
			}
		}
    	
    	for (int i = 0; i < len; i++) {
    		int temp = 0;
			for (int j = 0; j < i; j++) { // note:j <i ¶Ô½Ç×ø±êÎª(i,i)
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
    	
    	
    }
}
