package mr.doom.mianshijindian;
public class Number_Nineteen {
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
		// 对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。
		// 给定图中的两个结点的指针
		// UndirectedGraphNode* a,UndirectedGraphNode* b(请不要在意数据类型，图是有向图),
		// 请返回一个bool，代表两点之间是否存在一条路径(a到b或b到a)。
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
