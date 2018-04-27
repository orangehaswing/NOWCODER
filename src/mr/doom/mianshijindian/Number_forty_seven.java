package mr.doom.mianshijindian;

public class Number_forty_seven {
    public static int getHeight(int[] w, int[] l, int[] h, int n) {
		
		// 有一堆箱子，每个箱子宽为wi，长为di，高为hi，
		// 现在需要将箱子都堆起来，而且为了使堆起来的箱子不到，上面的箱子的宽度和长度必须小于下面的箱子。
		// 请实现一个方法，求出能堆出的最高的高度，这里的高度即堆起来的所有箱子的高度之和。
		// 给定三个int数组w,l,h，分别表示每个箱子宽、长和高，
		// 同时给定箱子的数目n。请返回能堆成的最高的高度。保证n小于等于500。
        // write code here
    	
    	if(n <= 0) {
    		return 0;
    	}
    	//f[i]为从0开始到放入第i-1个箱子（第i-1个一定被放入），满足长宽条件的最大高度
    	int[] f = new int[501];
    	
    	//排序，0-(n-1)，按照宽度从大往小排序
    	for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(w[i] < w[j]) {
					change(w,i,j);
					change(h,i,j);
					change(l,i,j);
				}
			}
		}
    	
    	//获取最大高度算法

    	f[0] = h[0];  
    	//记录最大高度，一开始是宽度最大值箱子的高度
    	int maxHigh = f[0];
    	
    	for (int i = 1; i < n; i++) {
    		f[i] = h[i];
    		//tempMax记录放入第i-1个箱子时可达到的最大高度
    		System.out.println("i: " + i );
			int tempMax = 0;
			for (int j = i-1; j >= 0; j--) {
				System.out.println(" j:"+ j );
				if(w[i] < w[j] && l[i] < l[j]) {
					tempMax = Math.max(tempMax, f[j]);  //将i以前，可放下的箱子最大高度记录下来
					System.out.println(" innner_tempMax: "+tempMax);
				} 
			}
			f[i] += tempMax; 
			maxHigh = Math.max(maxHigh, f[i]);
			System.out.println(" out_tempmax: "+ tempMax +"  maxhigh: "+ maxHigh );
		}
    	return maxHigh;
    }

	private static void change(int[] mat, int i, int j) {
		int temp;
		temp = mat[i];
		mat[i] = mat[j];
		mat[j] = temp;
		
	}
	
	public static void main(String[] args) {
		
		int[] w = {3,10,7,5,8};
		int[] l = {4,6,5,2,7};
		int[] h = {5,6,2,4,7};
		int n = 5;
		int maxh = getHeight(w, l, h, n);
		System.out.println(maxh);
	}
}
