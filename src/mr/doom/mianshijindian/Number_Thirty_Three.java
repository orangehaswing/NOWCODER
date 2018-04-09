package mr.doom.mianshijindian;

public class Number_Thirty_Three {
	public double antsCollision(int n) {
        // write code here
		// 在n个顶点的多边形上有n只蚂蚁，这些蚂蚁同时开始沿着多边形的边爬行，请求出这些蚂蚁相撞的概率。
		// (这里的相撞是指存在任意两只蚂蚁会相撞)
		// 给定一个int n(3<=n<=10000)，代表n边形和n只蚂蚁，请返回一个double，为相撞的概率。
		
		//蚂蚁只有往同一方向爬才不会相撞（同位顺时针或逆）
		return 1-2/Math.pow(2, n);
    }
}
