package mr.doom.leetcode;

public class Number_fourty_two {
	public ListNode insertionSortList(ListNode head) {
		// Sort a linked list using insertion sort.

		// 插入排序就是不断的向一个已经排序的列表中(此处为代码中的sortedList)添加新的节点，
		// 并且保证添加节点后的列表仍然有序。
		// 一开始的时候sortedList为空，需要遍历输入链表（也就是未排序链表，
		// 此处为形参head）的每一个节点，每遍历一个，sortedList加一个。
		// cur代表的就是你当前要加入sortedlist的节点。
		// cur要插入的位置在sortedList的哪里呢？就是此处代码中node的后面。
		// 经过这么一轮，一个节点就被加入到了sortlist。之后同理。
		
		if (head == null) {
			return null;
		}

		return head;
	}
}
