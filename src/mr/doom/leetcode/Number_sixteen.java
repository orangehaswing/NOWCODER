package mr.doom.leetcode;

import java.util.HashMap;

public class Number_sixteen {
	public int romanToInt(String s) {
		// Given a roman numeral, convert it to an integer.
		// Input is guaranteed to be within the range from 1 to 3999.

//		I 1
//		V 5
//		X 10
//		L 50
//		C 100
//		D 500
//		M 1000
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int preval = 0; //高位
		int res = 0; //最终结果
		for (int i = s.length()-1;i>=0;i--) {
			int curval = map.get(s.charAt(i));
			if(curval < preval) { //判断高位和低位值，若高位大于低位，则要减去低位值，否则相加
				res = res - curval;
			}else {
				res = res + curval;
			}
			preval = curval;
			
		}

		return res;
	}
}
