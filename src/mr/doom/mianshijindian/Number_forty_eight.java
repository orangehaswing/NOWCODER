package mr.doom.mianshijindian;
import java.util.ArrayList;

public class Number_forty_eight {
	public int getResult(int n, int m) {
		// 约瑟夫问题是一个非常著名的趣题，
		// 即由n个人坐成一圈，按顺时针由1开始给他们编号。
		// 然后由第一个人开始报数，数到m的人出局。
		// 现在需要求的是最后一个出局的人的编号。
		// 给定两个int n和m，代表游戏的人数。
		// 请返回最后一个出局的人的编号。保证n和m小于等于1000。
		// write code here

		// 解析：
		// 先把问题稍微改变一下，并不影响原意：
		// 问题描述：n个人（编号0~(n-1))，从0开始报数，报到(m-1)的退出，剩下的人继续从0开始报数。求胜利者的编号。
		// web link:http://www.cnblogs.com/void/archive/2011/04/21/2024377.html

		int s = 0;
		for (int i = 2; i <= n; i++) {
			s = (s + m) % i;
		}

		return s + 1;
	}
}
