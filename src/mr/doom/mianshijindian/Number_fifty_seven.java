package mr.doom.mianshijindian;

public class Number_fifty_seven {
    public int getLongest(String[] str, int n) {
		// ��һ�鵥�ʣ����дһ���������������ҳ����������ַ�����ɵ���Ĵ�A����A��������������ɵ�(���ظ�)��ĵ��ʡ�
		// ����һ��string����str��ͬʱ��������Ĵ�Сn���뷵������ʵĳ��ȣ���֤��������������ʴ��ڡ�
    	// write code here
    	//��Ŀ������
//    	int length = 0;
//    	for (int i = 0; i < n; i++) {
//    		for (int j = 0; j < n; j++) {
//    			if (str[j].indexOf(str[i])>0 && str[j].equals(str[i]) != true) {
//    				length = Math.max(str[j].length(), length);
//    			}
//			}
//		}
//    	return length;
    	//����
    	String temp = null;
    	for (int i = 0; i < n -1; i++) {
			for (int j = i+1; j < n; j++) {
				if (str[j].length() > str[i].length()) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
    	//���ʼ�з�
    	
    	
    	
    	return 1;
    }
}
