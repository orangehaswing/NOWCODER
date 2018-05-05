package mr.doom.mianshijindian;

public class Number_fifty_nine {
	public int getFrequency(String[] article, int n, String word) {
        // write code here
		// 请设计一个高效的方法，找出任意指定单词在一篇文章中的出现频数。
		// 给定一个string数组article和数组大小n及一个待统计单词word，
		// 请返回该单词在文章中的出现频数。
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (word.equals(article[i])) {
				count++;
			}
		}

		return count;
    }
}
