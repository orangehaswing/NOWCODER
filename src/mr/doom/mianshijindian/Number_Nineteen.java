package mr.doom.mianshijindian;
public class Number_Nineteen {
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
		// ����һ������ͼ����ʵ��һ���㷨���ҳ�����֮���Ƿ����һ��·����
		// ����ͼ�е���������ָ��
		// UndirectedGraphNode* a,UndirectedGraphNode* b(�벻Ҫ�����������ͣ�ͼ������ͼ),
		// �뷵��һ��bool����������֮���Ƿ����һ��·��(a��b��b��a)��
        // write code here
		
		return check(a,b) || check(b,a);
    }

	private boolean check(UndirectedGraphNode a, UndirectedGraphNode b) {
		if(a == b) {
			return true;
		}
		
		if(a.neighbors != null) {
			for (int i = 0; i < a.neighbors.size(); i++) {
				return check(a.neighbors.get(i), b);
			}
		}
		
		return false;
	}
}
