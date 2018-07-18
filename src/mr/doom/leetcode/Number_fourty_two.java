package mr.doom.leetcode;

public class Number_fourty_two {
	public ListNode insertionSortList(ListNode head) {
		// Sort a linked list using insertion sort.

		// ����������ǲ��ϵ���һ���Ѿ�������б���(�˴�Ϊ�����е�sortedList)����µĽڵ㣬
		// ���ұ�֤��ӽڵ����б���Ȼ����
		// һ��ʼ��ʱ��sortedListΪ�գ���Ҫ������������Ҳ����δ��������
		// �˴�Ϊ�β�head����ÿһ���ڵ㣬ÿ����һ����sortedList��һ����
		// cur����ľ����㵱ǰҪ����sortedlist�Ľڵ㡣
		// curҪ�����λ����sortedList�������أ����Ǵ˴�������node�ĺ��档
		// ������ôһ�֣�һ���ڵ�ͱ����뵽��sortlist��֮��ͬ��
		
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode temp = new ListNode(0);
		ListNode p,q,t;
		
		while(head != null) {
			p = temp;
			q = p.next;
			t = head;
			head = head.next;
			while(q != null && q.val < t.val) {
				p = p.next;
				q = q.next;
			}
			t.next = q;
			p.next = t;
		}

		return temp.next;
	}
}
