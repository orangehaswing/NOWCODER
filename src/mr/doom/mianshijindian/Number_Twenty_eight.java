package mr.doom.mianshijindian;

public class Number_Twenty_eight {
	public int[] getCloseNumber(int x) {
		// ��һ�������������ҳ�������Ʊ�ʾ��1�ĸ�����ͬ���Ҵ�С��ӽ�������������(һ���Դ�һ����С)
		// ����������int x���뷵��һ��vector�������������������С����ǰ������֤�𰸴��ڡ�
        // write code here
		int count = getcout(x);
		int a = x+1;
		int b = x-1;
		//�ۼ��ۼ��������
		while(count != getcout(a)) {
			a++;
		}
		while(count != getcout(b)) {
			b--;
		}
		
		int[] number = {b,a};
		return number;
    }
	
	 private int getcout(int result) {
		 //���ٷ��������1�ĸ�����ȥ�����ұߵ�1
		 //i.e 8��1000��= 7��0111��+ 1��0001��
		 int i = 0;
		 for (; result != 0; i++) {
			result &= (result -1);
		}
		 return i;
	}
}
