package mr.doom.mianshijindian;

public class Number_sixty_six {
	public int findString(String[] str, int n, String x) {
        // write code here
		// 有一个排过序的字符串数组，但是其中有插入了一些空字符串，
		// 请设计一个算法，找出给定字符串的位置。算法的查找部分的复杂度应该为log级别。
		// 给定一个string数组str,同时给定数组大小n和需要查找的string x，
		// 请返回该串的位置(位置从零开始)。
		if (str.length == 0 || n <= 0) {
			return -1;
		}
		
		int start = 0;
		int end = n-1;
		int mid = 0;
		while(start <= end) {
			mid = start + (end - start)/2;
			//遇到空格情况
			if(str[mid].equals(" ")) {
				int index = mid;
				while(index >= start && str[index].equals(" ")) {
					index--;
				}
				if (index < start) {
					start = mid + 1; //mid前全是空格
				}
				
				if(str[index].compareTo(x) < 0) {
					start = mid + 1;
				}else if(str[index].compareTo(x) > 0){
					end = index -1;
				}else if (str[mid].compareTo(x) == 0) {
					return mid;
				}
				
			}else {  //不是空格直接判断
				if (str[mid].compareTo(x) > 0) {
					end = mid-1;
				}else if(str[mid].compareTo(x) < 0) {
					start = mid+1;
				}else if(str[mid].compareTo(x) == 0){
					return mid;
				}
			}
			
		}
		
		return -1;
    }
}
