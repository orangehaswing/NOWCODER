package mr.doom.mianshijindian;

public class Number_fifty_one {
	public int[] exchangeAB(int[] AB) {
		// ���дһ�������������ڲ�ʹ���κ���ʱ������ֱ�ӽ�����������ֵ��
		// ����һ��int����AB��������Ԫ�غ͵�һ��Ԫ��Ϊ��������ֵ���뷵�ؽ���������顣
        // write code here
		
		//ʹ���߼����� ��� ��ͬΪ0 ��ͬΪ1
		AB[1] = AB[0] ^ AB[1];
		AB[0] = AB[0] ^ AB[1];
		AB[1] = AB[0] ^ AB[1];
		
		return AB;
    }
}
