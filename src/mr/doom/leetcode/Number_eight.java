package mr.doom.leetcode;

public class Number_eight {
	public static String intToRoman(int num) {
		// Given an integer, convert it to a roman numeral.
		// Input is guaranteed to be within the range from 1 to 3999.

		// 规则
		// 罗马数字是阿拉伯数字传入之前使用的一种数码。罗马数字采用七个罗马字母作数字、即Ⅰ（1）、X（10）、C（100）、M（1000）、V（5）、L（50）、D（500）。记数的方法：
		// 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
		// 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
		// 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9；
		// 在一个数的上面画一条横线，表示这个数增值 1,000 倍
		String[][] romanNumber = { 
				{ "","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "","M","MM","MMM"}
		};
		
		//从最高位开始计算，添加到字符串末尾
		String res = "";
		for (int i = 3; i >=0; i--) {
			res =res +  romanNumber[i][ (num/(int)(Math.pow(10, i)))];
			num = (int) (num%(Math.pow(10, i)));
		}
		
		return res;
	}
	
	
	
	public static void main(String[] args) {
		String st = intToRoman(10);
		System.out.println("st is " + st);
	}
}
