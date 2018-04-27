package mr.doom.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Number_nine {
	public static boolean isPalindrome(int x) {
		// Determine whether an integer is a palindrome.
		// Do this without extra space.
		// click to show spoilers.
		
		//���ֻ��ģ���ʹ�ö���ռ�
		//ֱ�ӱȽ����������Ƿ����
		if(x < 0) {
			return false;
		}
		
		int reverse = 0;
		int t = x;
		while(t>0) {
			reverse = reverse*10 + x%10;
			t /= 10;
		}
		
		return reverse == x;
		
		
		//ʹ�ö���ռ�
//		if(x < 0) {
//			return false;
//		}
//		//���ϵķ�ת�������Ƚ�
//		//ʵ�ַ�ת������ʹ�� StringBuild.append
//		ArrayList<Integer> num = new ArrayList<Integer>();
//		while(x > 0) {
//			num.add(x%10);
//			x = x/10;
//		}
//		ArrayList<Integer> num1 = new ArrayList<Integer>(num);
//		Collections.reverse(num);
//		
//		for (int j = 0; j < num.size(); j++) {
//			if(num.get(j) != num1.get(j)) {
//				return false;
//			}
//		}
//		return true;
	}
	
	public static void main(String[] args) {
		boolean flag = isPalindrome(123454321);
	}
}
