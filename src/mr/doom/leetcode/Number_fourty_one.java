package mr.doom.leetcode;
import java.util.ArrayList;
import java.util.Arrays;

public class Number_fourty_one {
	ArrayList<ArrayList<Integer>> res;
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		
		// Given a collection of numbers, return all possible permutations.
		//
		// For example,
		// [1,2,3]have the following permutations:
		// [1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2], and[3,2,1].
		if(num == null || num.length < 1) {
			return null;
		}
		
		res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(num);
		
		func(list, num);
		
		return res;
	}

	private void func(ArrayList<Integer> list, int[] num) {
		
		if(list.size() == num.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		
		for (int i = 0; i < num.length; i++) {
			if (!list.contains(num[i])) {
				list.add(num[i]);
				func(list, num);
				list.remove(list.size()-1);
			}
		}
		
	}

	
}
