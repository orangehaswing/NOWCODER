package mr.doom.mianshijindian;

public class Number_sixty_four {
	public static int[] findElement(int[][] mat, int n, int m, int x) {
		// ��һ��NxM���������󣬾�����к��ж��Ǵ�С��������ġ�
		// �����һ����Ч�Ĳ����㷨�����Ҿ�����Ԫ��x��λ�á�
		// ����һ��int�������mat��ͬʱ��������Ĵ�Сn��m�Լ���Ҫ���ҵ�Ԫ��x��
		// �뷵��һ����Ԫ���飬�����Ԫ�ص��кź��к�(�����㿪ʼ)��
		// ��֤Ԫ�ػ��졣
        // write code here
		int a = 0;
		int b = m - 1;
		
		// ������������������
		// �����Ͻǿ�ʼ��ÿ�ν�����ֵ�����Ͻǵ�ֵ�Ƚϣ�
		// ����������Ͻǵ�ֵ����ֱ��ȥ��1�У�������ȥ��1�С�
		while(a < n && b >= 0) {
			//ȥ��������
			if (mat[a][b] > x) {
				b--;
			}else if (mat[a][b] < x) { //ȥ����һ��
				a ++;
			}else if (mat[a][b] == x) {
				break;
			}
		}
		
		
		// ��Ϊÿһ�����򣬶��ַ�����
		// for (int i = 0; i < n; i++) {
		// int left = 0;
		// int right = m-1;
		// int mid = 0;
		// while(left <= right) {
		// mid = (left + right)/2;
		// System.out.println("mat " + mat[i][mid]);
		// if (x > mat[i][mid]) {
		// left = mid + 1;
		// }else if(x < mat[i][mid]) {
		// right = mid -1;
		// }else if (x == mat[i][mid]) {
		// a = i;
		// b = mid;
		// break;
		// }
		// }
		// }
		
		//�����ⷨ
		// for (int i = 0; i < n; i++) {
		// for (int j = 0; j < m; j++) {
		// if (x == mat[i][j]) {
		// a = i;
		// b = j;
		// }
		// }
		// }
		int array[] = {a,b};
		return array;
    }
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[] a = findElement(arr, 3, 3, 4);
		System.out.println(a[0]+ "    " + a[1]);
	}
}
