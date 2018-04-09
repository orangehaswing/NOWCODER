package mr.doom.mianshijindian;

public class Number_forty_six {
	public static  int nQueens(int n) {
		// 请设计一种算法，解决著名的n皇后问题。
		// 这里的n皇后问题指在一个nxn的棋盘上放置n个棋子，
		// 使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数。
		// 给定一个int n，请返回方法数，保证n小于等于15
		// write code here

		// 递归解法
		// 把棋盘存储为一个N维数组a[N]，数组中第i个元素的值代表第i行的皇后位置，
		// 这样便可以把问题的空间规模压缩为一维O(N)，在判断是否冲突时也很简单，
		// 首先每行只有一个皇后，且在数组中只占据一个元素的位置，行冲突就不存在了，
		// 其次是列冲突，判断一下是否有a[i]与当前要放置皇后的列j相等即可。
		// 至于斜线冲突，通过观察可以发现所有在斜线上冲突的皇后的位置都有规律即它们所在的行列互减的绝对值相等，
		// 即| row – i | = | col – a[i] | 。
		// 这样某个位置是否可以放置皇后的问题已经解决。
		int[] a = new int[n]; //N维数组
		int[] count = {0}; //计数值 为了能在类内部全局使用，使用数组，但是只记录第一个值
		//对第一行没列分别赋值，查找该位置下是否可以放 
		for (int i = 0; i < n; i++) {
			a[0] = i;
			getCount(a,1,count);  
		}
		
		return count[0];
	}
	
	//递归 
	//i:行 j:列
	private static void getCount(int[] a, int i, int[] count) {
		//递归结束标志，查询到最后行和最后一列
		if (a.length == i) {
			count[0] ++;
			return;
		}
		//对每一列放置皇后
		for (int j = 0; j < a.length; j++) {
			//使用最上面注解，由于不需要检查行，所以只需判定列和对角线
			if(check(a,i,j)) {
				//满足条件则保留，并继续跳入下一行进行判定
				a[i] = j;
				getCount(a, i+1, count);
			}
		}
	}
	
	private static boolean check(int[] a, int i, int j) {
		//该行的值与以上的每一行进行判定，用循环查询
		for (int k = 0; k < i; k++) {
			int temp = a[k];
			//列判定
			if(temp == j) {
				return false;  
			}
			//斜对角判定
			if(Math.abs(i - k) == Math.abs(temp - j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = nQueens(8);
		System.out.println("num is :" + num);
	}
}
