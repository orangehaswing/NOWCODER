package mr.doom.mianshijindian;

public class Number_Thirty_Four {
	public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
		// ����ֱ������ϵ�ϵ�����ֱ�ߣ�ȷ��������ֱ�߻᲻���ཻ��
		// �߶���б�ʺͽؾ����ʽ��������double s1��double s2��double y1��double y2��
		// �ֱ����ֱ��1��2��б��(��s1,s2)�ͽؾ�(��y1,y2)���뷵��һ��bool���������������ֱ���Ƿ��ཻ��
		// ������ֱ���غ�Ҳ��Ϊ�ཻ��
		
		//��ͨ����������ȷ������Ǹ������㣬������==��
//		if(s1 != s2) {
//			return true;
//		}else {
//			if(y1 == y2) {
//				return true;
//			}else {
//				return false;
//			}
//		}
		
		//�мǲ�Ҫ��==��鸡�����Ƿ���ȣ�����Ӧ�ü�����߲�ֵ�Ƿ�С��ĳ����Сֵ������1e-6��
		double i = 1e-6;
		return Math.abs(s1-s2)>i||Math.abs(y1-y2)<i; 
    }
}
