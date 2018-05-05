package mr.doom.mianshijindian;

public class Number_fifty_eight {
	public int addAB(int A, int B) {
		// 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
		// 给定两个int A和B。请返回A＋B的值
        // write code here
		
		// 二进制加法。发现一个特点。
		// 位的异或运算跟求'和'的结果一致：
		// 异或 1^1=0 1^0=1 0^0=0     
		// 求和 1+1=0 1+0=1 0+0=0
		
		// 位的与运算跟求'进位‘的结果一致：
		// 位与 1&1=1 1&0=0 0&0=0
		// 进位 1+1=1 1+0=0 0+0=0
		// 于是可以用异或运算和与运算来表示加法
		
		// A^B是不考虑进位的结果，（A&B）<<1是求得的进位
		// 因此A^B+（A&B）<<1的结果就是和，只要（A&B）<<1=0，两项就变成了一项，不需要加法了
		int xor ,and;
		while(B != 0) {
			xor = A^B;
			and = (A&B)<<1;
			A = xor;
			B = and;
		}
		return A;
    }
}
