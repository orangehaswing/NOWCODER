package mr.doom.mianshijindian;

import java.util.ArrayList;

public class Number_sixty_eight {
	public int countWays(int n) {
		// ���������޵�Ӳ�ң���ֵΪ25�֡�10�֡�5�ֺ�1�֣����д�������n���м��ֱ�ʾ����
		// ����һ��int n���뷵��n���м��ֱ�ʾ������֤nС�ڵ���100000��
		// Ϊ�˷�ֹ������뽫��Mod 1000000007��
		// write code here

		// TODO
		// ˼·��
		// link��http://www.cnblogs.com/python27/archive/2013/09/05/3303721.html
		// �������ֻ��һ��Ӳ�ҵĻ�����ôֻ��һ�ֽⷨ
		// ���������������ǰһ��Ӳ�ҵĻ�����������һ��Ӳ����ô�ҵĽⷨ�ͱ��������
		//
		// ����ģ���� �����ҵ�Ӳ��ֻ����ֵ1 2 ��ô��Ҫ��ϳ���ֵΪ�� �ж����ֽⷨ��
		// 1.����ֻ����ֵ1��Ӳ�� ��ô���� 1 1 1 �������1�ֽ���
		// 2.����������Ҫ����ֵΪ2��Ӳ����������ֵ1Ӳ�ҵĻ����� ��ô�͵��� 1 1 ���� 2 ��ʱ�Ѿ�����2�ֽⷨ��
		// 3.��ô��ʱ������1����ֵΪ2��Ӳ�Ұ���������˵�����ǿ�����������ֵΪ2��Ӳ�ҵģ��������Ǽ��������� �� 1 2 1 1�Ļ�����
		// ���������˵�����λ�ô�ʱ���Ƿ���һ����ֵ2��Ӳ�ҷ��ִ�ʱ������1����ֵ1��Ӳ�� ��һ����ֵ2��Ӳ�ң����������ܹ�����������ֻ����2��
		// 1 2 2 1 ��ô����������������4��λ�� ����������1�� ��ֵ2��Ӳ�ң���ô���ǵõ� ��1 2 2 3 Ϊʲô�� �ҵ�λ���ľ���3������
		// �ã����������������� ��һ���Ǿ���ȫ������ֵ1��Ӳ�Ҵﵽ��4 �ڶ����� ����ֵ 1 1 2�ﵽ��4 ������������2 2 �ﵽ��4
		// �ɴ����ǿ�����dp[n+1]���洢��� ����dp[0] = 1; Ϊʲô�ҵ�dp[0]Ҫ����1�أ�����Ϊ���ǵ�һ��ʹ��ĳһ��
		// Ӳ����ֵ��ʱ����Ҫ��0��ֵ�Ļ�������1���������ǵ�dp[0] = 1����Ϊ������������ġ� ��ô��������������dp[]����ĺ���
		// ��������������ǰ��ʹ�õ�����Ӳ�ҵ������Լ�����n���� 1.��1 1 1 1�� 2.��1 2 2 1�� 3.��1 2 2 3��
		// 1.λ�ö���1������������һ����ֵһ��Ӳ���Լ����ǵ���λ��2����������ֵ1��Ӳ��
		// 2.λ�ö���2������������1.�Ļ�����������ֵ2��Ӳ�ҵ�����2�������Ǵ�ʱ����2�ַ���

		int[] coins = { 1, 5, 10, 25 };
		int[] dp = new int[100001];
		dp[0] = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = coins[i]; j <= n; j++) {
				dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
			}
		}

		return dp[n];

	}
}