package mr.doom.mianshijindian;
import java.util.Arrays;

public class Number_Three {

	@SuppressWarnings("null")
	public boolean checkSam(String stringA, String stringB) {
		// write code here
		// ���������ַ��������д����ȷ������һ���ַ������ַ��������к�
		// �ܷ�����һ���ַ���������涨��СдΪ��ͬ�ַ����ҿ����ַ����ص�ո�
		// ����һ��string stringA��һ��string stringB���뷵��һ��bool��
		// ���������Ƿ��������к����ͬ����֤�����ĳ��ȶ�С�ڵ���5000��
		// �õ�Arrays���򣬱Ƚ��������Ƿ���ͬ
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
		// ����ĸ����Ӧ��ASCII���� ���ָ���ĸ�Ĵ���
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
