
public class Number_forty {
	public int countWays(int x, int y) {
        // write code here
		// ��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ�
		// �����һ���㷨������������ж������߷���
		// ��������������int x,int y���뷵�ػ����˵��߷���Ŀ����֤x��yС�ڵ���12��
		
		int[][] arr= new int[x][y];
		for (int j = 0; j < y; j++) {
			arr[0][j] = 1;
		}
		for (int i = 0; i < x; i++) {
			arr[i][0] = 1;
		}
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		return arr[x-1][y-1];
    }
}
