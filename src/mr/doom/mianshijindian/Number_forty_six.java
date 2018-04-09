package mr.doom.mianshijindian;

public class Number_forty_six {
	public static  int nQueens(int n) {
		// �����һ���㷨�����������n�ʺ����⡣
		// �����n�ʺ�����ָ��һ��nxn�������Ϸ���n�����ӣ�
		// ʹ��ÿ��ÿ�к�ÿ���Խ����϶�ֻ��һ�����ӣ�����ڷŵķ�������
		// ����һ��int n���뷵�ط���������֤nС�ڵ���15
		// write code here

		// �ݹ�ⷨ
		// �����̴洢Ϊһ��Nά����a[N]�������е�i��Ԫ�ص�ֵ�����i�еĻʺ�λ�ã�
		// ��������԰�����Ŀռ��ģѹ��ΪһάO(N)�����ж��Ƿ��ͻʱҲ�ܼ򵥣�
		// ����ÿ��ֻ��һ���ʺ�����������ֻռ��һ��Ԫ�ص�λ�ã��г�ͻ�Ͳ������ˣ�
		// ������г�ͻ���ж�һ���Ƿ���a[i]�뵱ǰҪ���ûʺ����j��ȼ��ɡ�
		// ����б�߳�ͻ��ͨ���۲���Է���������б���ϳ�ͻ�Ļʺ��λ�ö��й��ɼ��������ڵ����л����ľ���ֵ��ȣ�
		// ��| row �C i | = | col �C a[i] | ��
		// ����ĳ��λ���Ƿ���Է��ûʺ�������Ѿ������
		int[] a = new int[n]; //Nά����
		int[] count = {0}; //����ֵ Ϊ���������ڲ�ȫ��ʹ�ã�ʹ�����飬����ֻ��¼��һ��ֵ
		//�Ե�һ��û�зֱ�ֵ�����Ҹ�λ�����Ƿ���Է� 
		for (int i = 0; i < n; i++) {
			a[0] = i;
			getCount(a,1,count);  
		}
		
		return count[0];
	}
	
	//�ݹ� 
	//i:�� j:��
	private static void getCount(int[] a, int i, int[] count) {
		//�ݹ������־����ѯ������к����һ��
		if (a.length == i) {
			count[0] ++;
			return;
		}
		//��ÿһ�з��ûʺ�
		for (int j = 0; j < a.length; j++) {
			//ʹ��������ע�⣬���ڲ���Ҫ����У�����ֻ���ж��кͶԽ���
			if(check(a,i,j)) {
				//��������������������������һ�н����ж�
				a[i] = j;
				getCount(a, i+1, count);
			}
		}
	}
	
	private static boolean check(int[] a, int i, int j) {
		//���е�ֵ�����ϵ�ÿһ�н����ж�����ѭ����ѯ
		for (int k = 0; k < i; k++) {
			int temp = a[k];
			//���ж�
			if(temp == j) {
				return false;  
			}
			//б�Խ��ж�
			if(Math.abs(i - k) == Math.abs(temp - j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = nQueens(8);
		System.out.println("num is :" + num);
	}
}
