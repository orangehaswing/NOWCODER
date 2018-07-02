package mr.doom.leetcode;

public class Number_thirty_one {
	public  static String addBinary(String a, String b) {
		// Given two binary strings, return their sum (also a binary string).
		//
		// For example,
		// a ="11"
		// b ="1"
		// Return"100".
		
		//直接字符串补齐，相加
		StringBuffer res = new StringBuffer();
		int length = Math.max(a.length(), b.length());
		if (a.length() < length) {
			
		}
		
		if (b.length() < length) {
			
		}
		
		
		return null;
		
		//字符串  ——> 数字 ——> 二进制 ——> 字符串
		// 该思路出现的问题：
		// parse解析报错
		// java.lang.NumberFormatException
		// java.lang.Long.parseLong
		// 转换太复杂
		// 可以考虑直接从字符串转换

//		int i = Integer.parseInt(a);
//		int j = Integer.parseInt(b);
//		int rea = 0,reb = 0,sum = 0;
//		int count = 0;
//		
//		sum = i + j;
		
		
//		while(i != 0) {
//			rea += i%10*Math.pow(2, count);
//			count++;
//			i = i/10;
//		}
//		
//		count = 0;
//		while(j != 0) {
//			reb += j%10*Math.pow(2, count);
//			count++;
//			j = j/10;
//		}
		
//		return Integer.toBinaryString(sum);
	}
	
	public static void main(String[] args) {
		String s = null;
		s = addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", 
				"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
	}
	
}
