package mr.doom.mianshijindian;
public class Number_Thirty_six {
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
		// �ڶ�άƽ���ϣ������������Σ����ҳ�һ��ֱ�ߣ��ܹ��������������ζ԰�֡�
		// �ٶ������ε�������������x��ƽ�С�
		// ��������vecotrA��B���ֱ�Ϊ���������ε��ĸ����㡣
		// �뷵��һ��vector�����������ƽ��ֱ�ߵ�б�ʺͽؾ࣬��֤б�ʴ���
    	double[] coor = new double[4];
    	for (int i = 0; i < A.length; i++) {
			coor[0] += A[i].x;
			coor[1] += A[i].y;
			coor[2] += B[i].x;
			coor[3] += B[i].y;
		}
    	coor[0] = coor[0]/4;
    	coor[1] = coor[1]/4;
    	coor[2] = coor[2]/4;
    	coor[3] = coor[3]/4;
    	
    	double[] d = new double[2];
    	d[0] = (coor[3]-coor[1])/(coor[2]-coor[0]);  //x yֵ��ؾ�
    	d[1] = coor[3] - d[0]*coor[2];
    	
    	return d;
    }
}
