package mr.doom.mianshijindian;

public class Number_Thirty_eight {
	public static int findKth(int k) {
        // write code here
		// ��һЩ����������ֻ��3��5��7�������һ���㷨���ҳ����еĵ�k������
		// ����һ����int k���뷵�ص�k��������֤kС�ڵ���100
		//Ѱ�ҳ��������㷨
		//�㷨һ
//		int i = 3;
//		int temp = 0;
//		while(k > 0) {
//			temp = i;
//			while(temp%3==0)
//				temp/=3;
//			while(temp%5==0)
//				temp/=5;
//			while(temp%7==0)
//				temp/=7;
//			if(temp == 1) {
//				k--;
//			}
//		i++;	
//		}
//		return i-1;
		
		//�㷨��
		 k=k+1;
		int[] array = new int[k];
		for (int i = 0; i < k; i++) {
			array[i] = 1;
		}
		int count = 1;
		
		while(true) {
			int base3 = 0;
			int base5 = 0;
			int base7 = 0;
			for (int i = 0; i < count; i++) {
				if(array[i]*3>array[count-1]) {
					base3 = array[i]*3;
					break;
				}
			}
			for (int i = 0; i < count; i++) {
				if(array[i]*5>array[count-1]) {
					base5 = array[i]*5;
					break;
				}
			}
			for (int i = 0; i < count; i++) {
				if(array[i]*7>array[count-1]) {
					base7 = array[i]*7;
					break;
				}
			}
			//�ӵ�һ������ʼ�棬����array[0] = 1,��Ҫ�ڿ�ͷ��� k=k+1;
			array[count] = Math.min(Math.min(base3, base5), base7);
			count++;
			if(count == k) {
				return array[count-1];
			}
		}
			
    }
}
