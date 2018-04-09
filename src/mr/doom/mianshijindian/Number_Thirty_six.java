package mr.doom.mianshijindian;
public class Number_Thirty_six {
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
		// 在二维平面上，有两个正方形，请找出一条直线，能够将这两个正方形对半分。
		// 假定正方形的上下两条边与x轴平行。
		// 给定两个vecotrA和B，分别为两个正方形的四个顶点。
		// 请返回一个vector，代表所求的平分直线的斜率和截距，保证斜率存在
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
    	d[0] = (coor[3]-coor[1])/(coor[2]-coor[0]);  //x y值求截距
    	d[1] = coor[3] - d[0]*coor[2];
    	
    	return d;
    }
}
