package mr.doom.mianshijindian;
import java.util.ArrayList;

public class Number_forty_eight {
	public int getResult(int n, int m) {
		// Լɪ��������һ���ǳ�������Ȥ�⣬
		// ����n��������һȦ����˳ʱ����1��ʼ�����Ǳ�š�
		// Ȼ���ɵ�һ���˿�ʼ����������m���˳��֡�
		// ������Ҫ��������һ�����ֵ��˵ı�š�
		// ��������int n��m��������Ϸ��������
		// �뷵�����һ�����ֵ��˵ı�š���֤n��mС�ڵ���1000��
		// write code here

		// ������
		// �Ȱ�������΢�ı�һ�£�����Ӱ��ԭ�⣺
		// ����������n���ˣ����0~(n-1))����0��ʼ����������(m-1)���˳���ʣ�µ��˼�����0��ʼ��������ʤ���ߵı�š�
		// web link:http://www.cnblogs.com/void/archive/2011/04/21/2024377.html

		int s = 0;
		for (int i = 2; i <= n; i++) {
			s = (s + m) % i;
		}

		return s + 1;
	}
}
