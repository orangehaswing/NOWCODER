package mr.doom.mianshijindian;

public class Number_fifty_nine {
	public int getFrequency(String[] article, int n, String word) {
        // write code here
		// �����һ����Ч�ķ������ҳ�����ָ��������һƪ�����еĳ���Ƶ����
		// ����һ��string����article�������Сn��һ����ͳ�Ƶ���word��
		// �뷵�ظõ����������еĳ���Ƶ����
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (word.equals(article[i])) {
				count++;
			}
		}

		return count;
    }
}
