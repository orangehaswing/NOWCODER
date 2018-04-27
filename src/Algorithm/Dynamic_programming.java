package Algorithm;

public class Dynamic_programming {

	// 问题描述：
	// You are climbing a stair case.
	// It takes n steps to reach to the top.
	// Each time you can either climb 1 or 2 steps.
	// In how many distinct ways can you climb to the top?

	// 解析：
	// 思路：自上而下的方式。
	// 最后一步可能是从第n-1阶往上走1阶、从第n-2阶往上走2阶。
	// 因此，抵达最后一阶的走法，抵达这最后二阶的方式的和。
	public int climbStairs(int n) {
		// 动态规划
		// if (n < 3) {
		// return n;
		// }
		//
		// int[] res = new int[n+1];
		// res[1] = 1;
		// res[2] = 2;
		// for (int i = 3; i < n+1; i++) {
		// res[i] = res[i-1] + res[i-2];
		// }
		// return res[n];

		// 非递归
		if (n < 3) {
			return n;
		}

		int res1 = 1;
		int res2 = 2;
		int temp = 0;
		for (int i = 3; i < n + 1; i++) {
			temp = res1 + res2;
			res1 = res2;
			res2 = temp;
		}

		return temp;

		// 递归 复杂度高，超时
		// if(n < 1) {
		// return 0;
		// }
		// if (n == 1) {
		// return 1;
		// }
		// if (n == 2) {
		// return 2;
		// }
		//
		// return climbStairs(n-1) + climbStairs(n-2);
	}

	// 问题描述：
	// A robot is located at the top-left corner of a m x n grid
	// (marked 'Start' in the diagram below).
	// The robot can only move either down or right at any point in time.
	// The robot is trying to reach the bottom-right corner of the grid
	// (marked 'Finish' in the diagram below).
	// How many possible unique paths are there?

	// 解析：
	// 二维数组用于计算走到当前格子的走法总数，为其上方格子走法总数与其左侧格子走法总数之和
	public int uniquePaths(int m, int n) {
		// 优化
		int[][] grid = new int[m][n];
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					grid[i][j] = 1;
					continue;
				}
				grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
			}
		}

		res = grid[m - 1][n - 1];
		return res;

		// success
		// if (m == 0 || n == 0) {
		// return 0;
		// }
		//
		// if(m == 1 || n == 1) {
		// return 1;
		// }
		//
		// int[][] grid = new int[m][n];
		// int res = 0;
		//
		// for (int i = 0; i < n; i++) {
		// grid[0][i] = 1;
		// }
		// for (int j = 0; j < m; j++) {
		// grid[j][0] = 1;
		// }
		//
		// for (int i = 1; i < m; i++) {
		// for (int j = 1; j < n; j++) {
		// grid[i][j] = grid[i][j-1] + grid[i-1][j];
		// }
		// }
		//
		// res = grid[m-1][n-1];
		// return res;
	}

	// 问题描述：
	// 背包问题
	// 一个旅行者有一个最多能装m公斤的背包，现在有n中物品，
	// 每件的重量分别是W1、W2、……、Wn，
	// 每件物品的价值分别为C1、C2、……、Cn，
	// 需要将物品放入背包中，要怎么样放才能保证背包中物品的总价值最大？

	// 解析：

	
	
	
	
	// 问题描述：
	// 有一堆箱子，每个箱子宽为wi，长为di，高为hi，
	// 现在需要将箱子都堆起来，而且为了使堆起来的箱子不倒，
	// 上面的箱子的宽度和长度必须小于下面的箱子。
	// 请实现一个方法，求出能堆出的最高的高度，这里的高度即堆起来的所有箱子的高度之和。
	// 给定三个int数组w,l,h，分别表示每个箱子宽、长和高，同时给定箱子的数目n。
	// 请返回能堆成的最高的高度。保证n小于等于500。

	// 解析：
//	1.按照宽度排序
//	2.一开始，默认最底层为最大高度
//	3.外for循环：
//			tempMax记录放入第i-1个箱子时可达到的最大高度
//				内for循环：
//						每次遍历，求出能放下第i个箱子情况下的最大高度
//			加上第i个箱子后最大高度，与i-1个箱子时最大高度比较，取最大值
			
	public int getHeight(int[] w, int[] l, int[] h, int n) {

		if (n <= 0) {
			return 0;
		}
		// f[i]为从0开始到放入第i-1个箱子（第i-1个一定被放入），满足长宽条件的最大高度
		int[] f = new int[501];

		// 排序，0-(n-1)，按照宽度从大往小排序
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (w[i] < w[j]) {
					change(w, i, j);
					change(h, i, j);
					change(l, i, j);
				}
			}
		}

		// 获取最大高度算法
		f[0] = h[0];
		// 记录最大高度，一开始是宽度最大值箱子的高度
		int maxHigh = f[0];
		for (int i = 1; i < n; i++) {
			f[i] = h[i];
			// tempMax记录放入第i-1个箱子时可达到的最大高度
			int tempMax = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (w[i] < w[j] && l[i] < l[j]) {
					tempMax = Math.max(tempMax, f[j]); // 将i以前，可放下的箱子最大高度记录下来
				}
			}
			f[i] += tempMax;
			maxHigh = Math.max(maxHigh, f[i]);
		}
		return maxHigh;
	}

	private void change(int[] mat, int i, int j) {
		int temp;
		temp = mat[i];
		mat[i] = mat[j];
		mat[j] = temp;

	}
	
	// 问题描述：
	// 叠罗汉是一个著名的游戏，游戏中一个人要站在另一个人的肩膀上。
	// 为了使叠成的罗汉更稳固，我们应该让上面的人比下面的人更轻一点。
	// 现在一个马戏团要表演这个节目，为了视觉效果，我们还要求下面的人的身高比上面的人高。
	// 请编写一个算法，计算最多能叠多少人，注意这里所有演员都同时出现。
	// 给定一个二维int的数组actors，每个元素有两个值，分别代表一个演员的身高和体重。
	// 同时给定演员总数n，请返回最多能叠的人数。保证总人数小于等于500。
	//
	// 测试样例：
	// [[1,2],[3,4],[5,6],[7,8]],4
	// 返回：4
	
	//解析：
	
	
	public int getHeight(int[][] actors, int n) {
		//排序
		int temp1 = 0;
		int temp0 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (actors[i][1] < actors[j][1]) {
					temp1 = actors[i][1];
					actors[i][1] = actors[j][1];
					actors[j][1] = temp1;
					temp0 = actors[i][0];
					actors[i][0] = actors[j][0];
					actors[j][0] = temp0;
				}
			}
		}
		
		
		
		
		
		
		return 0;
	}

}
