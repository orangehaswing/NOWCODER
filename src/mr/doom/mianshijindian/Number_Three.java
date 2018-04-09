package mr.doom.mianshijindian;
import java.util.Arrays;

public class Number_Three {

	@SuppressWarnings("null")
	public boolean checkSam(String stringA, String stringB) {
		// write code here
		// 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，
		// 能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
		// 给定一个string stringA和一个string stringB，请返回一个bool，
		// 代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。
		// 用到Arrays排序，比较排序结果是否相同
		// char[] c1 = stringA.toCharArray();
		// char[] c2 = stringB.toCharArray();
		// if (c1.length != c2.length) {
		// return false;
		// }
		// Arrays.sort(c1);
		// Arrays.sort(c2);
		// if (Arrays.equals(c1, c2)) {
		// return true;
		// }
		// return false;
		// ------------------------------------//
		// 用字母所对应的ASCII码存放 出现该字母的次数
		int[] a = new int[256];
		if (stringA.length() != stringB.length()) {
			return false;
		}
		for (int i = 0; i < stringA.length(); i++) {
			a[stringA.charAt(i)]++;
			a[stringB.charAt(i)]--;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
