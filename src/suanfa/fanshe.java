package suanfa;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class fanshe {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		 Class<?> c = methodClass.class;
	        Object object = c.newInstance();
	        Method[] methods = c.getMethods();
	        Method[] declaredMethods = c.getDeclaredMethods();
	        //��ȡmethodClass���add����
	        Method method = c.getMethod("add", int.class, int.class);
	        //getMethods()������ȡ�����з���
	        System.out.println("getMethods��ȡ�ķ�����");
	        for(Method m:methods)
	            System.out.println(m);
	        //getDeclaredMethods()������ȡ�����з���
	        System.out.println("getDeclaredMethods��ȡ�ķ�����");
	        for(Method m:declaredMethods)
	            System.out.println(m);
	}
}
class methodClass {
    public final int fuck = 3;
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a+b;
    }
}
