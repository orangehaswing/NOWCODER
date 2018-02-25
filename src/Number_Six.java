
public class Number_Six {

	public int[][] transformImage(int[][] mat, int n) {
		// 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，
		// 请编写一个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)，
		// 将图像顺时针旋转90度。
		// 给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,
		// 保证N小于等于500，图像元素小于等于256。
		
//		首先上下翻转，再按照主对角线翻转
//		 1 2 3                 7 8 9            7 4 1
//		 4 5 6    —>       4 5 6  --->    8 5 2
//		 7 8 9                 1 2 3            9 6 3
//		如果是逆时针翻转则先翻主对角线，再上下翻转
		int temp;
		if (n != mat.length || n != mat[0].length) {
			return null;
		}
		
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[n-1-i][j];
				mat[n-1-i][j] = temp;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		return mat;
        
    }

}
