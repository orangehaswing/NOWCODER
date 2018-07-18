package mr.doom.leetcode;

public class Number_fourty_three {
	public static double pow(double x, int n) {
		// Implement pow(x, n). x^n
		// 递归方式

		if (n == 0) {
			return 1.0;
		} else if (n < 0) {
			return (1 / x) * pow(1 / x, -(n + 1));
		} else if (n%2 == 0){
			return pow(x*x, n/2);
		} else {
			return x*pow(x*x, n/2);
		}

		// 测试方法结果正确，java.lang.StackOverflowError
		// x*pow(x,n-1);对每个迭代出现复杂度过高
		// if (n == 0) {
		// return 1.0;
		// } else if (n < 0) {
		// return (1 / x) * pow(1 / x, -(n + 1));
		// } else {
		// return x * pow(x, n - 1);
		// }

	}

	public static void main(String[] args) {
		double a = pow(-2, -2);
		System.out.println("a :" + a);
	}
}
