package mr.doom.mianshijindian;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Number_sixty_nine {
	public double[] getLine(Point[] p, int n) {
//		�ڶ�άƽ���ϣ���һЩ�㣬���ҳ������������������ߡ�
//		����һ���㼯vector<point>p�͵㼯�Ĵ�Сn,û��������ĺ�������ȵ����,
//		�뷵��һ��vector<double>��������������������ֱ�ߵ�б�ʺͽؾࡣ
//		</double></point>
		// write code here
		double[] db = new double[2];
		//ʹ��map
		
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

