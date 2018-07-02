package mr.doom.leetcode;

public class Number_twenty_six {
	public int singleNumber(int[] A) {
		// Given an array of integers,
		// every element appears three times except for one.
		// Find that single one.
		
//		x ^ 0s = x      x & 0s = 0      x | 0s = x
//		x ^ 1s = ~x     x & 1s = x      x | 1s = 1s
//		x ^ x  = 0      x & x  = x      x | x  = x
		
		// ÿ��Ԫ�س������Σ��������x ^ 0s = x x ^ x  = 0 ����ʣ�µľ���ֻ����һ�ε�ֵ
		// ÿ��Ԫ�س������Σ�ֻ��һ��Ԫ�س���һ�λ�����
		// ������Ԫ�صļ������֪�������ö����Ƶ���������������ȥ��ͬ����Ԫ��bitλ��
		// ͬ���ģ�����ģ�����3�ξ͵���Ϊ0�Ĳ�����
		// ��ones����¼ֻ���ֹ�һ�ε�bits����twos����¼ֻ���ֹ����ε�bits��
		// three = ones&twos��ֻҪ��ȥ3�ε�bits
		
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
