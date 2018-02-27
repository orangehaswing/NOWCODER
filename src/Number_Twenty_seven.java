
public class Number_Twenty_seven {
	public String printBin(double num) {
		// 有一个介于0和1之间的实数，类型为double，返回它的二进制表示。
		// 如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
		// 给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
		// write code here
		double db = num;
		StringBuilder sb = new StringBuilder();
		sb.append("0.");		
		int count = 32;
		while (db != 0.0) {
			count--;
			if(count < 0) {
				return "Error";
			}
			db = db * 2;
			sb.append(String.valueOf((int) (db / 1)));
			db = db % 1;
		}

		return sb.toString();
	}
}
