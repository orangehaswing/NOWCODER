package mr.doom.mianshijindian;

public class Number_fifty_four {

	public static int countNumberOf2s(int n) {
		// ���дһ�����������0��n(����n)������2�����˼��Ρ�
		// ����һ��������n���뷵��0��n��������2�����˼��Ρ�
		// write code here
		// ÿһλ�����Ƚ� ʱ�临�Ӷ�̫�� ûͨ��
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

		// leetcode�����㷨

		int count = 0;
		for (int i = 1; i <= n; i *= 10) {
			//֮���Բ�8������Ϊ����λΪ0����a/10==(a+8)/10��
			//����λ>=2����8�������λλ��Ч����ͬ��(a/10+1)
			int a = n / i, b = n % i;
			count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
		}
		return count;
	}

}
