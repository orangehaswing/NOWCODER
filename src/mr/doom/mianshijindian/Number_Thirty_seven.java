package mr.doom.mianshijindian;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Number_Thirty_seven {
	public double[] getLine(Point[] p, int n) {
        // write code here
		// �ڶ�άƽ���ϣ���һЩ�㣬���ҳ������������������ߡ�
		// ����һ���㼯vector<point>p�͵㼯�Ĵ�Сn,û��������ĺ�������ȵ����,
		// �뷵��һ��vector<double>��������������������ֱ�ߵ�б�ʺͽؾࡣ</double></point>
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
