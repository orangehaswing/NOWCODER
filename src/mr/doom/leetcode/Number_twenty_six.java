package mr.doom.leetcode;

public class Number_twenty_six {
	public int singleNumber(int[] A) {
		// Given an array of integers,
		// every element appears three times except for one.
		// Find that single one.
		
//		x ^ 0s = x      x & 0s = 0      x | 0s = x
//		x ^ 1s = ~x     x & 1s = x      x | 1s = 1s
//		x ^ x  = 0      x & x  = x      x | x  = x
		
		// 每个元素出现两次，则用异或：x ^ 0s = x x ^ x  = 0 最终剩下的就是只出现一次的值
		// 每个元素出现三次，只有一个元素出现一次或两次
		// 从两个元素的计算可以知道，利用二进制的异或操作，可以消去相同两个元素bit位，
		// 同样的，可以模拟出现3次就抵消为0的操作：
		// 用ones来记录只出现过一次的bits，用twos来记录只出现过两次的bits，
		// three = ones&twos，只要消去3次的bits
		
		//TODO
		int ones = 0;
		int twos = 0;
		int threes = 0;
		
		for (int i = 0; i < A.length; i++) {
			int t = A[i];
			twos = twos | (ones&t);
			ones = ones^t;
			threes = ones & twos;
			ones = ones & (~threes);
			twos = twos & (~threes);	
		}
		
		return ones;
    }
}
