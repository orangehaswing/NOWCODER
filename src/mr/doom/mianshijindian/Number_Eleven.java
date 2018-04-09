package mr.doom.mianshijindian;
import java.rmi.dgc.Lease;

public class Number_Eleven {
	public ListNode partition(ListNode pHead, int x) {
		// ��д���룬�Ը���ֵxΪ��׼������ָ�������֣�
		// ����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ
		// ����һ�������ͷָ�� ListNode* pHead���뷵���������к�������ͷָ�롣
		// ע�⣺�ָ��Ժ󱣳�ԭ��������˳�򲻱䡣
		
		//��������
		ListNode small = new ListNode(-1);
		ListNode big = new ListNode( -1);
		//��������ͷ
		ListNode smallhead = small;
		ListNode bighead = big;
		
		while(pHead != null){
			if (pHead.val < x) {
				//�ڵ㸳ֵ
				small.next = pHead;
				small = small.next;
			}else{
				big.next = pHead;
				big = big.next;
			}
			pHead = pHead.next;
		}
		
		small.next = bighead.next;
		big.next = null;
		return smallhead.next;
	}
}
