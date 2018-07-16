package mr.doom.leetcode;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_fourty {
	public ArrayList<String> anagrams(String[] strs) {
		// Given an array of strings, return all groups of strings that are anagrams.
		// Note: All inputs will be in lower-case.
		//
		// 首先简单介绍一下Anagram（回文构词法）。Anagrams是指由颠倒字母顺序组成的单词，“tea”会变成“eat”。
		// 回文构词法有一个特点：单词里的字母的种类和数目没有改变，只是改变了字母的排列顺序。
		// For example:
		// Input: ["tea","and","ate","eat","den"]
		// Output: ["tea","ate","eat"]
		
		ArrayList<String> res = new ArrayList<>();
		Map<String, ArrayList<String>> map = new HashMap<>();
		
		//按字典顺序排序，如果在Map的key有相同值，则表示是回文构词法，添加进Map。
		for(String s: strs) {
			String key = sortString(s);
			if(!map.containsKey(key))
				map.put(key, new ArrayList<>());
			map.get(key).add(s);
		}
		
		//取出所有的arraylist，判断>1表示多余一个值，就需要返回这个结果。
		for(String s: map.keySet()) {
			ArrayList<String> list = map.get(s);
			if(list.size() > 1) {
				res.addAll(list);
			}
		}

		return res;
	}

	private String sortString(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
