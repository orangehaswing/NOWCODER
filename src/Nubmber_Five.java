public class Nubmber_Five {

	public String zipString(String iniString) {
		// 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
		// 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
		// 若压缩后的字符串没有变短，则返回原先的字符串。
		// 给定一个string iniString为待压缩的串(长度小于等于10000)，
		// 保证串内字符均由大小写英文字母组成，返回一个string，
		// 为所求的压缩后或未变化的串。
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
