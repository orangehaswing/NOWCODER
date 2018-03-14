import java.util.Stack;

public class Number_forty_five {
	public boolean chkParenthesis(String A, int n) {
		// 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
		// 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
		// write code here
		char[] c = A.toCharArray();
		int len = 0;
		for (int i = 0; i < n; i++) {
			if(c[i] == '(') {
				len ++;
			}else if(c[i] == ')') {
				len --;
			}else {
				return false;
			}
		}
		
		if(len != 0) {
			return false;
		}
		return true;
    }
}
