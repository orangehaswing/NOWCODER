package mr.doom.mianshijindian;

public class Number_Twenty_six {
	public int binInsert(int n, int m, int j, int i) {

		// write code here
		// ������32λ����n��m�����д�㷨��m�Ķ�������λ���뵽n�Ķ����Ƶĵ�j����iλ,
		// ���ж����Ƶ�λ���ӵ�λ������λ����0��ʼ��
		// ����������int n��int m��ͬʱ����int j��int i��
		// ���������������뷵�ز������������֤n�ĵ�j����iλ��Ϊ�㣬
		// ��m�Ķ�����λ��С�ڵ���i-j+1��
		m = m << j;

		return m | n;
	}
}
