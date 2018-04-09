package mr.doom.mianshijindian;

public class Number_Thirty_nine {
	public int countWays(int n) {
		// write code here
		// �и�С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ס�2�ס�3�ס�
		// ��ʵ��һ������������С���ж�������¥�ķ�ʽ��Ϊ�˷�ֹ������뽫���Mod 1000000007
		// ����һ��������int n���뷵��һ������������¥�ķ�ʽ������֤nС�ڵ���100000��
		//Fibonacci sequence f(n) = f(n-1)+f(n-2)+f(n-3); And f(1)=1,f(2)=2,f(3)=4
		//������k��̨��,��k>3ʱ������ÿ�ο�����1,2,3���������һ��Ӧ������1,2,3�е�һ��
		//case1�����һ����1����Ҳ��ǰ������k-1����k-1���Ŀ������Ϊ��A[k-1]��
		//ͬ�� case2,A[k-1], case3 A[k-3]
		//�Ӷ��У� A[k] = A[k-3] + A[k-2] + A[k-1]
		int[] arr = {1,2,4};
		if(n<=0) {
			return 0;
		}else if(n<=3) {
			return arr[n-1];
		}else {
			for (int i = 4; i <= n; i++) {
				int temp = ((arr[0]+arr[1])%1000000007+arr[2])%1000000007;
				arr[0] = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
			}
		}
		return arr[2];
	}
}
