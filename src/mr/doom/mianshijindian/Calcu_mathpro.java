package mr.doom.mianshijindian;
import java.math.BigInteger;

public class Calcu_mathpro {
	public static void main(String[] args) {
//		BigInteger a = new BigInteger("1");
//		BigInteger b = new BigInteger("1");
//		BigInteger c = new BigInteger("1");
//		
//		BigInteger sum = new BigInteger("1");
//		BigInteger res = new BigInteger("1");
		
		double i = 1.0;
		double j = 1.0;
		double k = 1.0;
		
		double sum1=0,sum2=0,sum3=0;
		long count = 1;
		System.out.println("start");
		
			while(i <1000000) {
				while(j<1000000) {
					while(k<1000000) {
						if(Math.abs(i/(j+k)+j/(i+k)+k/(j+i)-4)<1e-8) {
							System.out.println("i"+i+"j"+j+"k"+k);
							System.out.println(Math.abs(i/(j+k)+j/(i+k)+k/(j+i)));
						}
						k++;
						
					}
					j++;
					k=1.0;
				}
				i++;
				j=1.0;
				k=1.0;
			}
	
		
		System.out.println("finsh"+" sum1:"+sum1+" sum2:"+sum1+" sum3:"+sum1);
	}
	
}
