package mr.doom.mianshijindian;

public class Number_sixty_three {
	public int getMaxSum(int[] A, int n) {
		// ����һ�������и����������飬���ҳ��ܺ������������С�
		// ����һ��int����A�������Сn���뷵�������������еĺ͡�
		// ��֤n�Ĵ�СС�ڵ���3000��
		// write code here
		int max = A[0];
		int res = A[0];
		for (int i = 1; i < n; i++) {
			//ǰi����maxֵ�����������������Ϊ��������ȥ
			if (max+A[i] > A[i]) { 
				max = max+A[i];  
			}
			else {
				max = A[i];
			}
			if (max > res) {
				res = max; //��¼�����
			}
		}
		
		return res;
    }
}
