package mr.doom.mianshijindian;

public class Number_fifty_two {
	public boolean checkWon(int[][] board) {
		// ����һ�������ľ��������̣������һ����Ч�㷨�жϵ�ǰ����Ƿ��ʤ��
		// ����һ����ά����board������ǰ���̣�
		// ����Ԫ��Ϊ1�Ĵ����ǵ�ǰ��ҵ����ӣ�Ϊ0��ʾû�����ӣ�Ϊ-1�����ǶԷ���ҵ����ӡ�
		// write code here
		//��
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += board[i][j];
			}
			if(sum == 3) {
				return true;
			}
		}
		//��
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += board[j][j];
			}
			if(sum == 3) {
				return true;
			}
		}
		//б�Խ�
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += board[i][i];
			if(sum1 == 3) {
				return true;
			}
		}
		//��б�Խ�
		int sum2 = 0;
		for (int i = 0; i < 3; i++) {
			sum2 = board[i][2-i];
			if (sum2 == 3) {
				return true;
			}
		}
		
		return false;
    }
}
