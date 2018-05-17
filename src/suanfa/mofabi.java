package suanfa;

public class mofabi {
public static void main(String[] args) {
	int n = 11;
	String st = null;
	st = func(n);
	System.out.println(st);
}

private static String func(int n) {
	
	StringBuffer sb = new StringBuffer();
	
	while(n != 0) {
		if (n%2 == 1) {
			n = (n-1)/2;
			sb.append("1");
		}else {
			n = (n-2)/2;
			sb.append("2");
		}
	}
	
	return sb.reverse().toString();
}
}
