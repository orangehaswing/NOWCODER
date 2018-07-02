package mr.doom.leetcode;

public class Number_thirty_five {
	public int totalNQueens(int n) {
		// Follow up for N-Queens problem.
		// Now, instead outputting board configurations,
		// return the total number of distinct solutions.
		
		// 递归解法
		// 把棋盘存储为一个N维数组a[N]，数组中第i个元素的值代表第i行的皇后位置，
		// 这样便可以把问题的空间规模压缩为一维O(N)，在判断是否冲突时也很简单，
		// 首先每行只有一个皇后，且在数组中只占据一个元素的位置，行冲突就不存在了，
		// 其次是列冲突，判断一下是否有a[i]与当前要放置皇后的列j相等即可。
		// 至于斜线冲突，通过观察可以发现所有在斜线上冲突的皇后的位置都有规律即它们所在的行列互减的绝对值相等，
		// 即| row – i | = | col – a[i] | 。
		int num = nQueen(n); 
		return num;
	}
	
	public int nQueen(int n) {
		int[] a = new int[n]; //N维数组
		int[] count = {0}; //记录总数值，只用到count[0], 数组可以在不同方法中改变值，局部变量无法实现
		
		for (int i = 0; i < n; i++) {
			a[0] = i;
			getCount(a,1,count);
		}
		return count[0];
	}
	
	public void getCount(int[] a, int i, int[] count) {
		if (a.length == i) {
			count[0] ++;
			return;
		}
		
		for (int j = 0; j < a.length; j++) {
			if (check(a,i,j)) {
				a[i] = j;
				getCount(a, i+1, count);
			}
		}
	}
	
	public boolean check(int[] a, int i, int j) {
		for (int k = 0; k < i; k++) {
			int temp = a[k];
			
			if (temp == j) {
				return false;
			}
			
			if (Math.abs(i - k) == Math.abs(temp - j)) {
				return false;
			}
		}
		return true;
	}
	
}
