package mr.doom.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Number_nine {
	public static boolean isPalindrome(int x) {
		// Determine whether an integer is a palindrome.
		// Do this without extra space.
		// click to show spoilers.
		
		//数字回文，不使用额外空间
		//直接比较两个整数是否相等
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
		
		
		//使用额外空间
//		if(x < 0) {
//			return false;
//		}
//		//集合的反转函数，比较
//		//实现反转还可以使用 StringBuild.append
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
