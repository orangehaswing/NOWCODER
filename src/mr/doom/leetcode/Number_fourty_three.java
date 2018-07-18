package mr.doom.leetcode;

public class Number_fourty_three {
	public static double pow(double x, int n) {
		// Implement pow(x, n). x^n
		// �ݹ鷽ʽ

		if (n == 0) {
			return 1.0;
		} else if (n < 0) {
			return (1 / x) * pow(1 / x, -(n + 1));
		} else if (n%2 == 0){
			return pow(x*x, n/2);
		} else {
			return x*pow(x*x, n/2);
		}

		// ���Է��������ȷ��java.lang.StackOverflowError
		// x*pow(x,n-1);��ÿ���������ָ��Ӷȹ���
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
