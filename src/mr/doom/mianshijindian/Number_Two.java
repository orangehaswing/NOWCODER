package mr.doom.mianshijindian;

public class Number_Two {
	/*第二题：
	 * 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
	给定一个string iniString，请返回一个string，为翻转后的字符串。*/
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
