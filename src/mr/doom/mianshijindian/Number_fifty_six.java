package mr.doom.mianshijindian;

public class Number_fifty_six {
	public static int getDistance(String[] article, int n, String x, String y) {
		// write code here
		// ��һƪ�����ں�������ʣ��ָ����������ʣ������һ����Ч�㷨���ҳ��������������ʵ���̾���
		// (����������ĵ�����,Ҳ��������������������λ�õĲ�ľ���ֵ)��
		// ����һ��string����article�������������£�ͬʱ�������µĵ�����n�ʹ����ҵ���������x��y��
		// �뷵���������ʵ���̾��롣��֤�������ʾ������г����Ҳ���ͬ��ͬʱ��֤���µ�����С�ڵ���1000��
		
		// ��ÿ�γ��ֵĵ��ʼ�¼��Ȼ��Ƚϳ���
		int cot1 = 0;
		int j = 0;
		int cot2 = 0;
		int k = 0;
		int div = 1000;
		for (int i = 0; i < n; i++) {
			if (article[i].equals(x)) {
				cot1 = i;
				j = 1;
			}else if(article[i].equals(y)) {
				cot2 = i;
				k = 1;
			}
			if((cot1 != 0)&&(cot2 != 0)) {
				div = Math.min(div, Math.abs(cot1 - cot2));
			}
		}
		
		return div;
	}
}
