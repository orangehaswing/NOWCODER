package mr.doom.mianshijindian;

public class Number_Ten {
	public boolean removeNode(ListNode pNode) {
		// ʵ��һ���㷨��ɾ�����������м��ĳ����㣬�ٶ���ֻ�ܷ��ʸý�㡣
		// ������ɾ���Ľڵ㣬��ִ��ɾ�����������ýڵ�Ϊβ�ڵ㣬����false�����򷵻�true
		
		//�ýڵ����Ҫɾ���Ľڵ�
		ListNode node = pNode;
		pNode = pNode.next;
		if (node.next == null) {
			return false;
		}
		return true;
	}
}
