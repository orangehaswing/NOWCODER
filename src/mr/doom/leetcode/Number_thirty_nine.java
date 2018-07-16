package mr.doom.leetcode;

import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;

public class Number_thirty_nine {
	public int lengthOfLongestSubstring(String s) {
		// Given a string, find the length of the longest substring without repeating
		// characters.
		//
		// For example, the longest substring without repeating letters
		// for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest
		// substring is "b", with the length of 1.

		int len = s.length();
		if (len == 0 || s == null) {
			return 0;
		}

		/*
		 *     "滑动窗口"      
		 * 	        比方说 abcabccc 当你右边扫描到abca的时候你得把第一个a删掉得到bca，
		 *     然后"窗口"继续向右滑动，每当加到一个新char的时候，左边检查有无重复的char，     
		 * 	        然后如果没有重复的就正常添加，
		 *     有重复的话就左边扔掉一部分（从最左到重复char这段扔掉），在这个过程中记录最大窗口长度
		 */
		int maxlen = 0;
		int left = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < len; i++) {
			char sc = s.charAt(i);
			left = Math.max(left, (map.containsKey(sc)) ? map.get(sc) + 1 : 0);
			maxlen = Math.max(maxlen, i - left + 1);
			map.put(sc, i);
		}

		return maxlen;
	}

}
