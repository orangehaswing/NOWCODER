package mr.doom.mianshijindian;

public class Number_sixty_one {
	public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
		// ����һ��СдӢ����ĸ��ɵ��ַ���s��һ�������϶�СдӢ���ַ���������p��
		// �����һ����Ч�㷨������p�е�ÿһ���϶��ַ������ж����Ƿ�Ϊs���Ӵ���
		// ����һ��string����p�����Ĵ�Сn��ͬʱ����string s��Ϊĸ�����뷵��һ��bool���飬
		// ÿ��Ԫ�ش���p�еĶ�Ӧ�ַ����Ƿ�Ϊs���Ӵ���
		// ��֤p�еĴ�����С�ڵ���8����p�еĴ��ĸ���С�ڵ���500��ͬʱ��֤s�ĳ���С�ڵ���1000��
		boolean[] check = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			if (s.contains(p[i])) {
				check[i] = true;
			}else {
				check[i] = false;
			}
		}
		return check;
    }
}
