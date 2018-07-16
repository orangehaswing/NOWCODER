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
		// ���ȼ򵥽���һ��Anagram�����Ĺ��ʷ�����Anagrams��ָ�ɵߵ���ĸ˳����ɵĵ��ʣ���tea�����ɡ�eat����
		// ���Ĺ��ʷ���һ���ص㣺���������ĸ���������Ŀû�иı䣬ֻ�Ǹı�����ĸ������˳��
		// For example:
		// Input: ["tea","and","ate","eat","den"]
		// Output: ["tea","ate","eat"]
		
		ArrayList<String> res = new ArrayList<>();
		Map<String, ArrayList<String>> map = new HashMap<>();
		
		//���ֵ�˳�����������Map��key����ֵͬ�����ʾ�ǻ��Ĺ��ʷ�����ӽ�Map��
		for(String s: strs) {
			String key = sortString(s);
			if(!map.containsKey(key))
				map.put(key, new ArrayList<>());
			map.get(key).add(s);
		}
		
		//ȡ�����е�arraylist���ж�>1��ʾ����һ��ֵ������Ҫ������������
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
