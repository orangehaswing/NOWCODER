package mr.doom.mianshijindian;

public class Number_sixty_six {
	public int findString(String[] str, int n, String x) {
        // write code here
		// ��һ���Ź�����ַ������飬���������в�����һЩ���ַ�����
		// �����һ���㷨���ҳ������ַ�����λ�á��㷨�Ĳ��Ҳ��ֵĸ��Ӷ�Ӧ��Ϊlog����
		// ����һ��string����str,ͬʱ���������Сn����Ҫ���ҵ�string x��
		// �뷵�ظô���λ��(λ�ô��㿪ʼ)��
		if (str.length == 0 || n <= 0) {
			return -1;
		}
		
		int start = 0;
		int end = n-1;
		int mid = 0;
		while(start <= end) {
			mid = start + (end - start)/2;
			//�����ո����
			if(str[mid].equals(" ")) {
				int index = mid;
				while(index >= start && str[index].equals(" ")) {
					index--;
				}
				if (index < start) {
					start = mid + 1; //midǰȫ�ǿո�
				}
				
				if(str[index].compareTo(x) < 0) {
					start = mid + 1;
				}else if(str[index].compareTo(x) > 0){
					end = index -1;
				}else if (str[mid].compareTo(x) == 0) {
					return mid;
				}
				
			}else {  //���ǿո�ֱ���ж�
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
