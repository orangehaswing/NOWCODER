package mr.doom.mianshijindian;

public class Number_Thirty {

	public int exchangeOddEven(int x) {
		// ���д���򽻻�һ�����Ķ����Ƶ�����λ��ż��λ����ʹ��Խ�ٵ�ָ��Խ�ã�
		// ����һ��int x���뷵�ؽ��������int��
		// write code here
		//������ȡ����λ��ż��λ
		//���ơ����ƽ�����ż����ӻ�����
		// ��0xAAAAAAAA��x�����������λ������(ż��λ������Ϊ0)
		// ��0x 55555555 ��x�������ż��λ������(����λ������Ϊ0)

		return (((x & 0xaaaaaaaa) >> 1 | (x & 0x55555555) << 1));
	}
}