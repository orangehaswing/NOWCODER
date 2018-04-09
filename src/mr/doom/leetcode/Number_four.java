package mr.doom.leetcode;

public class Number_four {
	public int reverse(int x) {
//		Reverse digits of an integer.
//		Example1: x = 123, return 321
//		Example2: x = -123, return -321
//		click to show spoilers.
		
		boolean flag = false;
		if(x < 0) {
			x = Math.abs(x);
			flag = true;
		}
		
		int res = 0;
		while(x > 0) {
			//关键算法，每次得出结果后进位
			res = res*10 + x%10;
			x = x/10;
		}
		
		return (flag == false)?res:-res;
    }
}
