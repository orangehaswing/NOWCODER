public class Nubmber_Five {

	public String zipString(String iniString) {
		// �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ�
		// ���磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3����
		// ��ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
		// ����һ��string iniStringΪ��ѹ���Ĵ�(����С�ڵ���10000)��
		// ��֤�����ַ����ɴ�СдӢ����ĸ��ɣ�����һ��string��
		// Ϊ�����ѹ�����δ�仯�Ĵ���
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < iniString.length() - 1; i++) {
			if (iniString.charAt(i) == iniString.charAt(i + 1)) {
				count++;
			} else {
				sb.append(iniString.charAt(i));
				sb.append(count);
				count = 1;
			}
		}

		sb.append(iniString.charAt(iniString.length() - 1));
		if (count > 1) {
			sb.append(count);
		}

		return sb.toString().length() >= iniString.length() ? iniString : sb
				.toString();

		// ---------------------------------------------------//
		// int low = 0 , high = 0 ;
		// int len = iniString.length();
		// StringBuilder sb = new StringBuilder();
		// char c = ' ';
		// int count = 0;
		// while(low < len){
		// high = low;
		// c = iniString.charAt(low);
		// while((high < len)&&(iniString.charAt(high) == c)){
		// high ++;
		// }
		// count = high - low ;
		// sb.append(c);
		// sb.append(count);
		// low = high;
		// }
		// return (sb.toString().length() < len)?sb.toString():iniString;

		
//		 if(iniString==null||iniString.length()==0){
//	            return "";
//	        }
//	        StringBuilder strB=new StringBuilder();
//	        char[] iniStr=iniString.toCharArray();
//	        char p;
//	        p=iniStr[0];
//	        int count=1;
//	        for(int i=1;i<iniStr.length;i++){
//	            if(p==iniStr[i]){
//	                count++;
//	            }
//	            else{
//	                strB.append(p+""+count);
//	                p=iniStr[i];
//	                count=1;
//	            }
//	        }
//	        strB.append(p+""+count);
//	        if(strB.toString().length()>=iniString.length()){
//	            return iniString;
//	        }
//	        return strB.toString();
	}
}
