package mr.doom.mianshijindian;

public class Number_fifty_six {
	public static int getDistance(String[] article, int n, String x, String y) {
		// write code here
		// 有一篇文章内含多个单词，现给定两个单词，请设计一个高效算法，找出文中这两个单词的最短距离
		// (即最少相隔的单词数,也就是两个单词在文章中位置的差的绝对值)。
		// 给定一个string数组article，代表所给文章，同时给定文章的单词数n和待查找的两个单词x和y。
		// 请返回两个单词的最短距离。保证两个单词均在文中出现且不相同，同时保证文章单词数小于等于1000。
		
		// 把每次出现的单词记录，然后比较长度
		int cot1 = 0;
		int j = 0;
		int cot2 = 0;
		int k = 0;
		int div = 1000;
		for (int i = 0; i < n; i++) {
			if (article[i].equals(x)) {
				cot1 = i;
				j = 1;
			}else if(article[i].equals(y)) {
				cot2 = i;
				k = 1;
			}
			if((cot1 != 0)&&(cot2 != 0)) {
				div = Math.min(div, Math.abs(cot1 - cot2));
			}
		}
		
		return div;
	}
}
