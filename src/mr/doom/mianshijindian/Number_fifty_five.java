package mr.doom.mianshijindian;

public class Number_fifty_five {
    public int[] findNext(int[] A, int n) {
		// ����������һ��int���飬�����ҳ�������ÿ��Ԫ�ص���һ���������Ԫ�ء�
		// ����һ��int����A������Ĵ�Сn���뷵��һ��int���飬����ÿ��Ԫ�ر��������һ��Ԫ��,
		// ����������Ϊ-1����֤������Ԫ�ؾ�Ϊ��������
        // write code here
    	int[] b =new int[n];
    	for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (A[i] < A[j]) {
					b[i] = A[j];
					break;
				}
				b[i] = -1;	
			}
		}
    	return b;
    }
}
