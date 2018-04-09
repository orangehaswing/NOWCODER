package mr.doom.mianshijindian;
import java.rmi.dgc.Lease;

public class Number_Eleven {
	public ListNode partition(ListNode pHead, int x) {
		// 编写代码，以给定值x为基准将链表分割成两部分，
		// 所有小于x的结点排在大于或等于x的结点之前
		// 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
		// 注意：分割以后保持原来的数据顺序不变。
		
		//创建链表
		ListNode small = new ListNode(-1);
		ListNode big = new ListNode( -1);
		//记下链表头
		ListNode smallhead = small;
		ListNode bighead = big;
		
		while(pHead != null){
			if (pHead.val < x) {
				//节点赋值
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
