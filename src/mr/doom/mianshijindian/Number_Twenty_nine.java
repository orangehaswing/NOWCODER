package mr.doom.mianshijindian;

public class Number_Twenty_nine {
	public int calcCost(int A, int B) {
		// ��дһ��������ȷ����Ҫ�ı伸��λ�����ܽ�����Aת�������B��
		// ������������int A��int B���뷵����Ҫ�ı����λ������
		// write code here
		int num = A ^ B;
		int i = 0;
		for (; num != 0; i++) {
			num &= (num - 1);
		}
		return i;
	}
}
