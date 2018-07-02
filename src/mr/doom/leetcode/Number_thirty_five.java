package mr.doom.leetcode;

public class Number_thirty_five {
	public int totalNQueens(int n) {
		// Follow up for N-Queens problem.
		// Now, instead outputting board configurations,
		// return the total number of distinct solutions.
		
		// �ݹ�ⷨ
		// �����̴洢Ϊһ��Nά����a[N]�������е�i��Ԫ�ص�ֵ�����i�еĻʺ�λ�ã�
		// ��������԰�����Ŀռ��ģѹ��ΪһάO(N)�����ж��Ƿ��ͻʱҲ�ܼ򵥣�
		// ����ÿ��ֻ��һ���ʺ�����������ֻռ��һ��Ԫ�ص�λ�ã��г�ͻ�Ͳ������ˣ�
		// ������г�ͻ���ж�һ���Ƿ���a[i]�뵱ǰҪ���ûʺ����j��ȼ��ɡ�
		// ����б�߳�ͻ��ͨ���۲���Է���������б���ϳ�ͻ�Ļʺ��λ�ö��й��ɼ��������ڵ����л����ľ���ֵ��ȣ�
		// ��| row �C i | = | col �C a[i] | ��
		int num = nQueen(n); 
		return num;
	}
	
	public int nQueen(int n) {
		int[] a = new int[n]; //Nά����
		int[] count = {0}; //��¼����ֵ��ֻ�õ�count[0], ��������ڲ�ͬ�����иı�ֵ���ֲ������޷�ʵ��
		
		for (int i = 0; i < n; i++) {
			a[0] = i;
			getCount(a,1,count);
		}
		return count[0];
	}
	
	public void getCount(int[] a, int i, int[] count) {
		if (a.length == i) {
			count[0] ++;
			return;
		}
		
		for (int j = 0; j < a.length; j++) {
			if (check(a,i,j)) {
				a[i] = j;
				getCount(a, i+1, count);
			}
		}
	}
	
	public boolean check(int[] a, int i, int j) {
		for (int k = 0; k < i; k++) {
			int temp = a[k];
			
			if (temp == j) {
				return false;
			}
			
			if (Math.abs(i - k) == Math.abs(temp - j)) {
				return false;
			}
		}
		return true;
	}
	
}
