package mr.doom.mianshijindian;

public class Number_Thirty_Four {
	public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
		// 给定直角坐标系上的两条直线，确定这两条直线会不会相交。
		// 线段以斜率和截距的形式给出，即double s1，double s2，double y1，double y2，
		// 分别代表直线1和2的斜率(即s1,s2)和截距(即y1,y2)，请返回一个bool，代表给定的两条直线是否相交。
		// 这里两直线重合也认为相交。
		
		//能通过，但不正确。如果是浮点运算，不能用==号
//		if(s1 != s2) {
//			return true;
//		}else {
//			if(y1 == y2) {
//				return true;
//			}else {
//				return false;
//			}
//		}
		
		//切记不要用==检查浮点数是否相等，而是应该检查两者差值是否小于某个极小值，例如1e-6。
		double i = 1e-6;
		return Math.abs(s1-s2)>i||Math.abs(y1-y2)<i; 
    }
}
