package mr.doom.mianshijindian;

public class Number_Thirty_Three {
	public double antsCollision(int n) {
        // write code here
		// ��n������Ķ��������nֻ���ϣ���Щ����ͬʱ��ʼ���Ŷ���εı����У��������Щ������ײ�ĸ��ʡ�
		// (�������ײ��ָ����������ֻ���ϻ���ײ)
		// ����һ��int n(3<=n<=10000)������n���κ�nֻ���ϣ��뷵��һ��double��Ϊ��ײ�ĸ��ʡ�
		
		//����ֻ����ͬһ�������Ų�����ײ��ͬλ˳ʱ����棩
		return 1-2/Math.pow(2, n);
    }
}
