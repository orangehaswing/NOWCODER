package mr.doom.mianshijindian;
import java.util.Hashtable;


public class Number_Seven {


	public int[][] clearZero(int[][] mat, int n) {
//		请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。
//		给定一个N阶方阵int[][]mat和矩阵的阶数n，
//		请返回完成操作后的int[][]方阵，
//		保证n小于等于300，矩阵中的元素为int范围内。
		if(n != mat.length || n != mat[0].length ){
			return null;
		}
		
		boolean[] a = new boolean[n];
		boolean[] b = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] == 0){
					a[i] = true;
					b[j] = true;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (a[i] == true) {
				for (int j = 0; j < n; j++) {
					mat[i][j] = 0;
				}
			}
		}
		
		for (int j = 0; j < n; j++) {
			if (b[j] == true) {
				for (int i = 0; i < n; i++) {
					mat[i][j] = 0;
				}
			}
		}
		
		return mat;
		
		//------------------------------------------//
//	     if (mat == null)    return mat;
//	     
//	        boolean[] rows = new boolean[mat.length];
//	        boolean[] cols = new boolean[mat[0].length];
//	 
//	        for (int i = 0; i < mat.length; i++) {
//	            for (int j = 0; j < mat[0].length; j++) {
//	                if (mat[i][j] == 0) {
//	                    rows[i] = true;
//	                    cols[j] = true;
//	                }
//	            }
//	        }
//	 
//	        for (int i = 0; i < mat.length; i++) {
//	            for (int j = 0; j < mat[0].length; j++) {
//	                if (rows[i] || cols[j]) {
//	                    mat[i][j] = 0;
//	                }
//	            }
//	        }
//	 
//	        return mat;
	}
}
