import java.util.Stack;

public class Number_forty_five {
	public boolean chkParenthesis(String A, int n) {
		// ����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���
		// ����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���
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
