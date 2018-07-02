package mr.doom.leetcode;

public class Number_twenty_seven {
	public static int[] plusOne(int[] digits) {
		// Given a number represented as an array of digits,
		// plus one to the number.
		for (int i = digits.length-1;i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			}else {
				digits[i]++;
				break;
			}
		}
		
		int[] array = new int[digits.length+1];
		
		if (digits[0] == 0) {
			array[0] = 1;
			for (int i = 1; i < array.length; i++) {
				array[i] = digits[i-1];
			}
			return array;
		}
		
		return digits;
    }
	
	
	public static void main(String[] args) {
		int[] a = {9};
		a = plusOne(a);
		for (int i : a) {
			System.out.println("a" + i);
		}
		
	}
}
