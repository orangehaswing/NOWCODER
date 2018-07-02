package mr.doom.leetcode;

import java.util.Arrays;

public class Number_twenty_nine {
	public static String longestCommonPrefix(String[] strs) {
		// Write a function to find the longest common prefix string
		// amongst an array of strings.
		if (strs == null || strs.length == 0) {
			return "";
		}
		
		int n = strs.length -1;
		StringBuffer sb = new StringBuffer();
		//�����Ƚϵ�һ�������һ���ַ����������ȣ����ַ����ĵ�һλ��ʼ
		Arrays.sort(strs);
		for (int i = 0; i < strs[0].length(); i++) {
			if (strs[0].charAt(i) == strs[n].charAt(i)) {
				sb.append(strs[0].charAt(i));
			}else {
				break;
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String[] strs = {"abcedfs","abcd","abd","ab","abc"};
		String st = longestCommonPrefix(strs);
		System.out.println(st);
	}
	
}
