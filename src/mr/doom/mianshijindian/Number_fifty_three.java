package mr.doom.mianshijindian;

public class Number_fifty_three {
	public int getMax(int a, int b) {
		// 请编写一个方法，找出两个数字中最大的那个。条件是不得使用if-else等比较和判断运算符。
		// 给定两个int a和b，请返回较大的一个数。若两数相同则返回任意一个。
        // write code here

		b = a-b;//此时b>>31为1则b小于0即a<b,若b>>31为0 则a>b
		a -= b&(b>>31); //若a<b a=a-(a-b),若a>b a=a-0 
		return a;
    }
}
