package mr.doom.mianshijindian;

public class Number_Twenty_nine {
	public int calcCost(int A, int B) {
		// 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。
		// 给定两个整数int A，int B。请返回需要改变的数位个数。
		// write code here
		int num = A ^ B;
		int i = 0;
		for (; num != 0; i++) {
			num &= (num - 1);
		}
		return i;
	}
}
