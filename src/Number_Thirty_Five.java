
public class Number_Thirty_Five {
	public int calc(int a, int b, int type) {
		// write code here
		// ���дһ��������ʵ�������ĳ˷��������ͳ�������(����ĳ�ָ����)��ֻ����ʹ�üӺš�
		// ��������������int a,int b,ͬʱ����һ��int type������������ͣ�
		// 1Ϊ��a �� b��0Ϊ��a �� b��-1Ϊ��a �� b���뷵�ؼ���Ľ������֤���ݺϷ��ҽ��һ����int��Χ�ڡ�
		int result = 0;
		switch (type) {
		case 1:
			int i = 0;
			while(i<b) {
				result += a;
				i++;
			}
			return result;
		case 0:
			int sum = 0;
			while(sum < a) {
				sum +=b;
				result ++;
			}
			//��1
			return result-1;
		case -1:
			//�ж�a b ��С  result������֮��
			boolean flag = true;
			if(a < b) {
				int temp = a;
				a = b;
				b = temp;
				flag = false;
			}
			while(result+b < a) {
				result++;
			}
			return flag?result:-result;
		default:
			return result;
		}
		
	}
}
