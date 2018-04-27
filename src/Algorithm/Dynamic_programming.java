package Algorithm;

public class Dynamic_programming {

	// ����������
	// You are climbing a stair case.
	// It takes n steps to reach to the top.
	// Each time you can either climb 1 or 2 steps.
	// In how many distinct ways can you climb to the top?

	// ������
	// ˼·�����϶��µķ�ʽ��
	// ���һ�������Ǵӵ�n-1��������1�ס��ӵ�n-2��������2�ס�
	// ��ˣ��ִ����һ�׵��߷����ִ��������׵ķ�ʽ�ĺ͡�
	public int climbStairs(int n) {
		// ��̬�滮
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

		// �ǵݹ�
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

		// �ݹ� ���Ӷȸߣ���ʱ
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

	// ����������
	// A robot is located at the top-left corner of a m x n grid
	// (marked 'Start' in the diagram below).
	// The robot can only move either down or right at any point in time.
	// The robot is trying to reach the bottom-right corner of the grid
	// (marked 'Finish' in the diagram below).
	// How many possible unique paths are there?

	// ������
	// ��ά�������ڼ����ߵ���ǰ���ӵ��߷�������Ϊ���Ϸ������߷����������������߷�����֮��
	public int uniquePaths(int m, int n) {
		// �Ż�
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

	// ����������
	// ��������
	// һ����������һ�������װm����ı�����������n����Ʒ��
	// ÿ���������ֱ���W1��W2��������Wn��
	// ÿ����Ʒ�ļ�ֵ�ֱ�ΪC1��C2��������Cn��
	// ��Ҫ����Ʒ���뱳���У�Ҫ��ô���Ų��ܱ�֤��������Ʒ���ܼ�ֵ���

	// ������

	
	
	
	
	// ����������
	// ��һ�����ӣ�ÿ�����ӿ�Ϊwi����Ϊdi����Ϊhi��
	// ������Ҫ�����Ӷ�������������Ϊ��ʹ�����������Ӳ�����
	// ��������ӵĿ�Ⱥͳ��ȱ���С����������ӡ�
	// ��ʵ��һ������������ܶѳ�����ߵĸ߶ȣ�����ĸ߶ȼ����������������ӵĸ߶�֮�͡�
	// ��������int����w,l,h���ֱ��ʾÿ�����ӿ����͸ߣ�ͬʱ�������ӵ���Ŀn��
	// �뷵���ܶѳɵ���ߵĸ߶ȡ���֤nС�ڵ���500��

	// ������
//	1.���տ������
//	2.һ��ʼ��Ĭ����ײ�Ϊ���߶�
//	3.��forѭ����
//			tempMax��¼�����i-1������ʱ�ɴﵽ�����߶�
//				��forѭ����
//						ÿ�α���������ܷ��µ�i����������µ����߶�
//			���ϵ�i�����Ӻ����߶ȣ���i-1������ʱ���߶ȱȽϣ�ȡ���ֵ
			
	public int getHeight(int[] w, int[] l, int[] h, int n) {

		if (n <= 0) {
			return 0;
		}
		// f[i]Ϊ��0��ʼ�������i-1�����ӣ���i-1��һ�������룩�����㳤�����������߶�
		int[] f = new int[501];

		// ����0-(n-1)�����տ�ȴӴ���С����
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (w[i] < w[j]) {
					change(w, i, j);
					change(h, i, j);
					change(l, i, j);
				}
			}
		}

		// ��ȡ���߶��㷨
		f[0] = h[0];
		// ��¼���߶ȣ�һ��ʼ�ǿ�����ֵ���ӵĸ߶�
		int maxHigh = f[0];
		for (int i = 1; i < n; i++) {
			f[i] = h[i];
			// tempMax��¼�����i-1������ʱ�ɴﵽ�����߶�
			int tempMax = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (w[i] < w[j] && l[i] < l[j]) {
					tempMax = Math.max(tempMax, f[j]); // ��i��ǰ���ɷ��µ��������߶ȼ�¼����
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
	
	// ����������
	// ���޺���һ����������Ϸ����Ϸ��һ����Ҫվ����һ���˵ļ���ϡ�
	// Ϊ��ʹ���ɵ��޺����ȹ̣�����Ӧ����������˱�������˸���һ�㡣
	// ����һ����Ϸ��Ҫ���������Ŀ��Ϊ���Ӿ�Ч�������ǻ�Ҫ��������˵���߱�������˸ߡ�
	// ���дһ���㷨����������ܵ������ˣ�ע������������Ա��ͬʱ���֡�
	// ����һ����άint������actors��ÿ��Ԫ��������ֵ���ֱ����һ����Ա����ߺ����ء�
	// ͬʱ������Ա����n���뷵������ܵ�����������֤������С�ڵ���500��
	//
	// ����������
	// [[1,2],[3,4],[5,6],[7,8]],4
	// ���أ�4
	
	//������
	
	
	public int getHeight(int[][] actors, int n) {
		//����
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
