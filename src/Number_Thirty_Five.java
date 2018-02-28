
public class Number_Thirty_Five {
	public int calc(int a, int b, int type) {
		// write code here
		// 请编写一个方法，实现整数的乘法、减法和除法运算(这里的除指整除)。只允许使用加号。
		// 给定两个正整数int a,int b,同时给定一个int type代表运算的类型，
		// 1为求a ＊ b，0为求a ／ b，-1为求a － b。请返回计算的结果，保证数据合法且结果一定在int范围内。
		int result = 0;
		switch (type) {
		case 1:
			int i = 0;
			while(i<b) {
				result += a;
				i++;
			}
			return result;
		case 0:
			int sum = 0;
			while(sum < a) {
				sum +=b;
				result ++;
			}
			//减1
			return result-1;
		case -1:
			//判断a b 大小  result有正负之分
			boolean flag = true;
			if(a < b) {
				int temp = a;
				a = b;
				b = temp;
				flag = false;
			}
			while(result+b < a) {
				result++;
			}
			return flag?result:-result;
		default:
			return result;
		}
		
	}
}
