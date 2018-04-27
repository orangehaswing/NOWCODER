package mr.doom.leetcode;

public class Number_eight {
	public static String intToRoman(int num) {
		// Given an integer, convert it to a roman numeral.
		// Input is guaranteed to be within the range from 1 to 3999.

		// ����
		// ���������ǰ��������ִ���֮ǰʹ�õ�һ�����롣�������ֲ����߸�������ĸ�����֡�����1����X��10����C��100����M��1000����V��5����L��50����D��500���������ķ�����
		// ��ͬ��������д������ʾ����������Щ������ӵõ��������� ��=3��
		// С�������ڴ�����ֵ��ұߣ�����ʾ����������Щ������ӵõ��������� ��=8����=12��
		// С�����֣����� ��X �� C���ڴ�����ֵ���ߣ�����ʾ�������ڴ�����С���õ��������� ��=4����=9��
		// ��һ���������滭һ�����ߣ���ʾ�������ֵ 1,000 ��
		String[][] romanNumber = { 
				{ "","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "","M","MM","MMM"}
		};
		
		//�����λ��ʼ���㣬��ӵ��ַ���ĩβ
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
