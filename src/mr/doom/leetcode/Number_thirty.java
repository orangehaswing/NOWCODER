package mr.doom.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Number_thirty {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		// Given a collection of intervals, merge all overlapping intervals.
		//
		// For example,
		// Given[1,3],[2,6],[8,10],[15,18],
		// return[1,6],[8,10],[15,18].

		//����������
		//TODO
		//������
		
		//�Ƚ�endֵ��ȡ���
		
		for (int i = 0; i < intervals.size()-1;) {
			if (intervals.get(i).end >= intervals.get(i+1).start) {
				intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
//				intervals.get(i).start = Math.min(intervals.get(i).start, intervals.get(i+1).start);
				intervals.remove(i+1);
				continue;
			}
			i++;
		}
		
		return intervals;
	}
}
