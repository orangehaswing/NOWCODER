package mr.doom.mianshijindian;

public class Number_Two {
	/*�ڶ��⣺
	 * ��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)��
	����һ��string iniString���뷵��һ��string��Ϊ��ת����ַ�����*/
	//my Algorithm code
	public String reverseString(String iniString) {
        // write code here
            char temp;
        int len = iniString.length();
        int halflen = len / 2;
        char[] array = new char[iniString.length()];
        array = iniString.toCharArray();
        for (int i = 0; i < halflen; i++) {
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len -1 - i] = temp;
        }
        iniString = String.valueOf(array);
        return iniString;
    }
	
	/*  if(iniString.trim().length() == 0||iniString == null) {
          return  "";
      }
      StringBuilder sb = new StringBuilder("");
      for(int j=iniString.length()-1;j>=0;j--) {
          sb.append(iniString.charAt(j));
      }
      return sb.toString();*/
	
//	 return new StringBuffer(s).reverse().toString();
}
