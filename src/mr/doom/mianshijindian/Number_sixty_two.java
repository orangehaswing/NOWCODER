package mr.doom.mianshijindian;

public class Number_sixty_two {
	public int count(int[] A, int n) {
        // write code here
		// ��һ�������������������������飬��ǰ��һ�����ں���һ�����֣����������������һ������ԡ�
		// �����һ����Ч���㷨��������������е�����Ը�����
		// ����һ��int����A�����Ĵ�Сn���뷵��A�е�����Ը�������֤nС�ڵ���5000��
		int num = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j < n; j++) {
				if (A[i]>A[j]) {
					num++;
				}
			}
		}

		return num;
    }
}
