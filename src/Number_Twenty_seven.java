
public class Number_Twenty_seven {
	public String printBin(double num) {
		// ��һ������0��1֮���ʵ��������Ϊdouble���������Ķ����Ʊ�ʾ��
		// ����������޷���ȷ����32λ���ڵĶ����Ʊ�ʾ�����ء�Error����
		// ����һ��double num����ʾ0��1��ʵ�����뷵��һ��string����������Ķ����Ʊ�ʾ���ߡ�Error����
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
