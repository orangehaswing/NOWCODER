package mr.doom.mianshijindian;

public class Number_Twlve {
	public ListNode plusAB(ListNode a, ListNode b) {
//		�������������ʾ��������ÿ��������һ����λ��
//		��Щ��λ�Ƿ����ŵģ�Ҳ���Ǹ�λ����������ײ���
//		��д������������������ͣ�����������ʽ���ؽ����
		if(a == null && b == null){
			return null;
		}
		int A = 0;
		int B = 0;
		int Sum = 0;
		ListNode sum = new ListNode(-1);
		ListNode sumHead = sum;
		//a�������
		for (int i = 0; a != null; i++) {
			A += a.val*Math.pow(10, i);
			a = a.next;
		}
		//b�������
		for (int j = 0; b != null; j++) {
			B += b.val*Math.pow(10, j);
			b = b.next;
		}
		
		Sum = A + B;
		int last = 0;
		while(Sum != 0){
			//������
			last  = Sum % 10; 
			//ȥ������
			Sum = Sum /10;
			//���������¸��ڵ㣬������ֵ����
			sum.next = new ListNode(last);
			sum = sum.next;
		}
		return sumHead.next;
		
	}
}
