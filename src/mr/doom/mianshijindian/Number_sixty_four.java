package mr.doom.mianshijindian;

public class Number_sixty_four {
	public static int[] findElement(int[][] mat, int n, int m, int x) {
		// 有一个NxM的整数矩阵，矩阵的行和列都是从小到大有序的。
		// 请设计一个高效的查找算法，查找矩阵中元素x的位置。
		// 给定一个int有序矩阵mat，同时给定矩阵的大小n和m以及需要查找的元素x，
		// 请返回一个二元数组，代表该元素的行号和列号(均从零开始)。
		// 保证元素互异。
        // write code here
		int a = 0;
		int b = m - 1;
		
		// 分析：行有序，列有序
		// 从右上角开始，每次将搜索值与右上角的值比较，
		// 如果大于右上角的值，则直接去除1行，否则，则去掉1列。
		while(a < n && b >= 0) {
			//去掉最右列
			if (mat[a][b] > x) {
				b--;
			}else if (mat[a][b] < x) { //去掉上一行
				a ++;
			}else if (mat[a][b] == x) {
				break;
			}
		}
		
		
		// 因为每一行有序，二分法查找
		// for (int i = 0; i < n; i++) {
		// int left = 0;
		// int right = m-1;
		// int mid = 0;
		// while(left <= right) {
		// mid = (left + right)/2;
		// System.out.println("mat " + mat[i][mid]);
		// if (x > mat[i][mid]) {
		// left = mid + 1;
		// }else if(x < mat[i][mid]) {
		// right = mid -1;
		// }else if (x == mat[i][mid]) {
		// a = i;
		// b = mid;
		// break;
		// }
		// }
		// }
		
		//暴力解法
		// for (int i = 0; i < n; i++) {
		// for (int j = 0; j < m; j++) {
		// if (x == mat[i][j]) {
		// a = i;
		// b = j;
		// }
		// }
		// }
		int array[] = {a,b};
		return array;
    }
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[] a = findElement(arr, 3, 3, 4);
		System.out.println(a[0]+ "    " + a[1]);
	}
}
