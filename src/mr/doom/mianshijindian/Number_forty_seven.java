package mr.doom.mianshijindian;

public class Number_forty_seven {
    public int getHeight(int[] w, int[] l, int[] h, int n) {
		
		// ��һ�����ӣ�ÿ�����ӿ�Ϊwi����Ϊdi����Ϊhi��
		// ������Ҫ�����Ӷ�������������Ϊ��ʹ�����������Ӳ�������������ӵĿ��Ⱥͳ��ȱ���С����������ӡ�
		// ��ʵ��һ������������ܶѳ�����ߵĸ߶ȣ�����ĸ߶ȼ����������������ӵĸ߶�֮�͡�
		// ��������int����w,l,h���ֱ��ʾÿ�����ӿ������͸ߣ�
		// ͬʱ�������ӵ���Ŀn���뷵���ܶѳɵ���ߵĸ߶ȡ���֤nС�ڵ���500��
        // write code here
    	
    	if(n <= 0) {
    		return 0;
    	}
    	//f[i]Ϊ��0��ʼ�������i-1�����ӣ���i-1��һ�������룩�����㳤�����������߶�
    	int[] f = new int[501];
    	
    	//����0-(n-1)�����տ��ȴӴ���С����
    	for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(w[i] < w[j]) {
					change(w,i,j);
					change(h,i,j);
					change(l,i,j);
				}
			}
		}
    	
    	//��ȡ���߶��㷨

    	f[0] = h[0];  
    	//��¼���߶ȣ�һ��ʼ�ǿ������ֵ���ӵĸ߶�
    	int maxHigh = f[0];
    	
    	for (int i = 1; i < n; i++) {
    		f[i] = h[i];
    		//tempMax��¼�����i-1������ʱ�ɴﵽ�����߶�
			int tempMax = 0;
			for (int j = i-1; j >= 0; j--) {
				if(w[i] < w[j] && l[i] < l[j]) {
					tempMax = Math.max(tempMax, f[j]);  //��i��ǰ���ɷ��µ��������߶ȼ�¼����
				} 
			}
			f[i] += tempMax; 
			maxHigh = Math.max(maxHigh, f[i]);
		}
    	return maxHigh;
    }

	private void change(int[] mat, int i, int j) {
		int temp;
		temp = mat[i];
		mat[i] = mat[j];
		mat[j] = temp;
		
	}
}