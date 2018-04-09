package mr.doom.mianshijindian;

public class Number_fifty_four {

	public static int countNumberOf2s(int n) {
		// 请编写一个方法，输出0到n(包括n)中数字2出现了几次。
		// 给定一个正整数n，请返回0到n的数字中2出现了几次。
		// write code here
		// 每一位单独比较 时间复杂度太大 没通过
		// int count = 0;
		// for (int i = 2; i <= n; i++) {
		// int j = i;
		// while (j > 0) {
		// if (j % 10 == 2)
		// count++;
		// j /= 10;
		// }
		// }
		// return count;

		// leetcode经典算法

		int count = 0;
		for (int i = 1; i <= n; i *= 10) {
			//之所以补8，是因为当百位为0，则a/10==(a+8)/10，
			//当百位>=2，补8会产生进位位，效果等同于(a/10+1)
			int a = n / i, b = n % i;
			count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
		}
		return count;
	}

}
