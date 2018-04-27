package mr.doom.leetcode;

public class Number_nineteen {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// Merge two sorted linked lists and return it as a new list.
		// The new list should be made by splicing together
		// the nodes of the first two lists.
		
		//特殊条件
		if(l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		//设置头节点
		ListNode l3 = new ListNode(0);
		ListNode head = l3;
		
		//对l1，l2进行比较，排序
		while(l1 != null && l2 != null ) {
			if (l1.val <= l2.val) {
				head.next = l1;
				l1 = l1.next;
			}else {
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;
		}
		if (l1 == null) {
			head.next = l2;
		}
		if (l2 == null) {
			head.next = l1;
		}
		
		return l3.next;
		
	}
}
