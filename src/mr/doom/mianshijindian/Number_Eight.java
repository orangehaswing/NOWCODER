package mr.doom.mianshijindian;
public class Number_Eight {

	public boolean checkReverseEqual(String s1, String s2) {
		// �ٶ����Ƕ�֪���ǳ���Ч���㷨�����һ�������Ƿ�Ϊ�����ַ������Ӵ���
		// �뽫����㷨��д��һ�����������������ַ���s1��s2��
		// ���д������s2�Ƿ�Ϊs1��ת���ɣ�Ҫ��ֻ�ܵ���һ�μ���Ӵ��ĺ�����
		// ���������ַ���s1,s2,�뷵��boolֵ����s2�Ƿ���s1��ת���ɡ�
		// �ַ������ַ�ΪӢ����ĸ�Ϳո����ִ�Сд���ַ�������С�ڵ���1000��
		
		//����S1�������бض��ܰ���S2�Ӵ�
		if (s1.length() != s2.length()) {
			return false;
		}
		
		String st = s1+s1;
		if (st.contains(s2)) {
			return true;
		}
		return false;
	}

}
