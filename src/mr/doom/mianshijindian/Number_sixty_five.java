package mr.doom.mianshijindian;

public class Number_sixty_five {
	public static int getFactorSuffixZero(int n) {
		// 请设计一个算法，计算n的阶乘有多少个尾随零。
		// 给定一个int n，请返回n的阶乘的尾零个数。保证n为正整数。
		// write code here
		int count = 0;
		int sum = 1;
		
		// 思路：刚开始做这道题的时候，我是先求出n！再计算有多少个0
		// 这样的复杂度很大，编译不通过，后来在编程之美中看到了思路，思路如下
		// n!可以质因数分解，由于2*5=10，所以尾零的个数只与2和5有关
		// 但是能被2整除的频率比被5整除的数高的多，所以尾零的个数其实只和5相关，
		// n！能被多少个5解，就有多少个0，
		// 这事，通过遍历（1到n)只要将能被5整除，就统计+1，最后统计的数，就是尾零的个数
		
		for (int i = 5; i <= n; i*=5) {
			count += n/i;
		}
		
		
		//超时
		// for (int i = n; i > 0; i--) {
		// sum = sum * i;
		// }
		//
		// while(sum%10 == 0) {
		// count ++;
		// sum = sum / 10;
		// }
		
		 return count;
    }
	
	public static void main(String[] args) {
		int a = 10;
		int num = getFactorSuffixZero(a);
		System.out.println(num);
	}
}
