package mr.doom.mianshijindian;

public class Number_Nine {

	public ListNode FindKthToTail(ListNode head, int k) {
		// 输入一个链表，输出该链表中倒数第k个结点
		if (head == null) {
			return head;
		}
		int count = 0;
		ListNode p = head;
		
		while(p !=null){
			p = p.next;
			count ++;
		}
		
		if (count < k) {
			return null;
		}
		ListNode I = head;
		for (int i = 0; i < count - k; i++) {
			I = I.next;
		}
		
		return I;
		
//		if (list == null)   return list;
//		 
//        ListNode node = list;
//        int count = 0;
//        while (node != null) {
//            count++;
//            node = node.next;
//        }
//        if (count < k)  return null;
// 
//        ListNode p = list;
//        for (int i = 0; i < count - k; i++) {
//            p = p.next;
//        }
//         
//        return p;
	}
}
