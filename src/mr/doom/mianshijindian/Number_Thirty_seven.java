package mr.doom.mianshijindian;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Number_Thirty_seven {
	public double[] getLine(Point[] p, int n) {
        // write code here
		// 在二维平面上，有一些点，请找出经过点数最多的那条线。
		// 给定一个点集vector<point>p和点集的大小n,没有两个点的横坐标相等的情况,
		// 请返回一个vector<double>，代表经过点数最多的那条直线的斜率和截距。</double></point>
		Map<Double, Double> map = new HashMap<Double,Double>();
		
		double k = 0.0;
		double b = 0.0;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				k = ((double)(p[i].y - p[j].y)/(p[i].x - p[j].x));
				b= ((double)p[i].y - k*p[i].x); 
				map.put(k, b);
			}
		}
		
		int count = 0;
		
		Set<Double> set = map.keySet();
		for (Double val:set) {
			if(map.get(val) > count) {
				//TODO
			}
		}
		
		return null;
    }
}
