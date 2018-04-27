package suanfa;

import java.util.Scanner;

public class beibaowenti {
	static int n = 5;
	static int[] fs= {5,4,3,5,2};
	static int[] sj = {5,4,6,3,1};
	static int zsj = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()) {
//			n=sc.nextInt();
//			fs=new int[n];
//			sj=new int[n];
//			for(int i =0;i<n;i++)
//				fs[i]=sc.nextInt();
//			for(int i =0;i<n;i++)
//				sj[i]=sc.nextInt();
//			zsj=sc.nextInt();
//		}

		int value = knap(10);
		System.out.println(value);
	}
	
	public static int knap(int cap) {
		int i,space,max,t;
		for (i = 0,max=0; i < n; i++) {
			if ((space = cap - sj[i]) >= 0) {
				if((t = knap(space) + fs[i]) > max) {
					max = t;
				}
			}
		}
		return max;
	}
}
