package mr.doom.mianshijindian;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Number_sixty_nine {
	public double[] getLine(Point[] p, int n) {
//		在二维平面上，有一些点，请找出经过点数最多的那条线。
//		给定一个点集vector<point>p和点集的大小n,没有两个点的横坐标相等的情况,
//		请返回一个vector<double>，代表经过点数最多的那条直线的斜率和截距。
//		</double></point>
		// write code here
		double[] db = new double[2];
		//使用map
		
		Map<Line, Integer> map = new HashMap<Line, Integer>();
		double k = 0;
		double b = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int count = 1;
				k = (p[i].y - p[j].y)/(p[i].x - p[j].x);
				b = p[i].y - k*p[i].x;
				Line line = new Line();
				line.k = k;
				line.b = b;
				
				if (map.containsKey(line)) {
					count = map.get(line);
					count++;
				}
				
				map.put(line, count);
				
			}
		}
		
		int max = 0;
		Set<Line> st = map.keySet();
		for (Line line : st) {
			if (map.get(line) >= max) {
				db[0] = line.k;
				db[1] = line.b;
			}
		}
		
		
		return db;
    }
	
	

}

