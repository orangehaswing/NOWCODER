package mr.doom.mianshijindian;

public class Number_sixty_five {
	public static int getFactorSuffixZero(int n) {
		// �����һ���㷨������n�Ľ׳��ж��ٸ�β���㡣
		// ����һ��int n���뷵��n�Ľ׳˵�β���������֤nΪ��������
		// write code here
		int count = 0;
		int sum = 1;
		
		// ˼·���տ�ʼ��������ʱ�����������n���ټ����ж��ٸ�0
		// �����ĸ��ӶȺܴ󣬱��벻ͨ���������ڱ��֮���п�����˼·��˼·����
		// n!�����������ֽ⣬����2*5=10������β��ĸ���ֻ��2��5�й�
		// �����ܱ�2������Ƶ�ʱȱ�5���������ߵĶ࣬����β��ĸ�����ʵֻ��5��أ�
		// n���ܱ����ٸ�5�⣬���ж��ٸ�0��
		// ���£�ͨ��������1��n)ֻҪ���ܱ�5��������ͳ��+1�����ͳ�Ƶ���������β��ĸ���
		
		for (int i = 5; i <= n; i*=5) {
			count += n/i;
		}
		
		
		//��ʱ
		// for (int i = n; i > 0; i--) {
		// sum = sum * i;
		// }
		//
		// while(sum%10 == 0) {
		// count ++;
		// sum = sum / 10;
		// }
		
		 return count;
    }
	
	public static void main(String[] args) {
		int a = 10;
		int num = getFactorSuffixZero(a);
		System.out.println(num);
	}
}
