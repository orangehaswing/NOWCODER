package mr.doom.mianshijindian;

public class Number_Ten {
	public boolean removeNode(ListNode pNode) {
		// 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
		// 给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true
		
		//该节点就是要删除的节点
		ListNode node = pNode;
		pNode = pNode.next;
		if (node.next == null) {
			return false;
		}
		return true;
	}
}
