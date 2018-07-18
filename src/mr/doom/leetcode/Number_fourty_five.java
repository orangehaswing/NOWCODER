package mr.doom.leetcode;

public class Number_fourty_five {
	public void reorderList(ListNode head) {
		// Given a singly linked list L: L 0→L 1→…→L n-1→L n,
		// reorder it to: L 0→L n →L 1→L n-1→L 2→L n-2→…
		//
		// You must do this in-place without altering the nodes' values.
		//
		// For example,
		// Given{1,2,3,4}, reorder it to{1,4,2,3}.
		
		
		if (head == null || head.next == null) {
			return;
		}
		
		
		//找中间节点
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		//反转后半段列表
		ListNode end = slow.next;
		slow.next = null;
		ListNode start = null;
		while(end != null) {
			ListNode temp = end.next;
			end.next  = start;
			start = end;
			end = temp;
		}
		// 合并列表
		ListNode first = head;
		end = start;
		
		while(first != null && end != null) {
			ListNode ftemp = first.next;
			ListNode etemp = end.next;
			first.next = end;
			first = ftemp;
			end.next = first;
			end = etemp;
		}
		
		
		
		
		
	}
}
