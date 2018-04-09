package mr.doom.mianshijindian;

public class Number_fifty_seven {
    public int getLongest(String[] str, int n) {
		// 有一组单词，请编写一个程序，在数组中找出由数组中字符串组成的最长的串A，即A是由其它单词组成的(可重复)最长的单词。
		// 给定一个string数组str，同时给定数组的大小n。请返回最长单词的长度，保证题意所述的最长单词存在。
    	// write code here
    	//题目理解错误
//    	int length = 0;
//    	for (int i = 0; i < n; i++) {
//    		for (int j = 0; j < n; j++) {
//    			if (str[j].indexOf(str[i])>0 && str[j].equals(str[i]) != true) {
//    				length = Math.max(str[j].length(), length);
//    			}
//			}
//		}
//    	return length;
    	//排序
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
    	//最长开始切分
    	
    	
    	
    	return 1;
    }
}
