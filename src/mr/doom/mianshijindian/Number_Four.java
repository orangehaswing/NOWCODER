package mr.doom.mianshijindian;

public class Number_Four {

	public static String replaceSpace(String iniString, int length) {
		//���� ʹ��������ʽ�󣬷���ֵString��Ϊ�滻����ַ���
		// ���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20����
		// �ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��
		// ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�
		// ����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��
//		iniString.replaceAll(" ", "%20");
//		return iniString;
		return iniString.replaceAll(" ", "%20");
    }

}
