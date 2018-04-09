package mr.doom.mianshijindian;

public class Number_Twlve {
	public ListNode plusAB(ListNode a, ListNode b) {
//		有两个用链表表示的整数，每个结点包含一个数位。
//		这些数位是反向存放的，也就是个位排在链表的首部。
//		编写函数对这两个整数求和，并用链表形式返回结果。
		if(a == null && b == null){
			return null;
		}
		int A = 0;
		int B = 0;
		int Sum = 0;
		ListNode sum = new ListNode(-1);
		ListNode sumHead = sum;
		//a链表相加
		for (int i = 0; a != null; i++) {
			A += a.val*Math.pow(10, i);
			a = a.next;
		}
		//b链表相加
		for (int j = 0; b != null; j++) {
			B += b.val*Math.pow(10, j);
			b = b.next;
		}
		
		Sum = A + B;
		int last = 0;
		while(Sum != 0){
			//求余数
			last  = Sum % 10; 
			//去处余数
			Sum = Sum /10;
			//创建链表下个节点，把余数值放入
			sum.next = new ListNode(last);
			sum = sum.next;
		}
		return sumHead.next;
		
	}
}
