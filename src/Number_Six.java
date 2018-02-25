
public class Number_Six {

	public int[][] transformImage(int[][] mat, int n) {
		// ��һ����NxN�����ʾ��ͼ������ÿ��������һ��int��ʾ��
		// ���дһ���㷨���ڲ�ռ�ö����ڴ�ռ�������(����ʹ�û������)��
		// ��ͼ��˳ʱ����ת90�ȡ�
		// ����һ��NxN�ľ��󣬺;���Ľ���N,�뷵����ת���NxN����,
		// ��֤NС�ڵ���500��ͼ��Ԫ��С�ڵ���256��
		
//		�������·�ת���ٰ������Խ��߷�ת
//		 1 2 3                 7 8 9            7 4 1
//		 4 5 6    ��>       4 5 6  --->    8 5 2
//		 7 8 9                 1 2 3            9 6 3
//		�������ʱ�뷭ת���ȷ����Խ��ߣ������·�ת
		int temp;
		if (n != mat.length || n != mat[0].length) {
			return null;
		}
		
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[n-1-i][j];
				mat[n-1-i][j] = temp;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		return mat;
        
    }

}
