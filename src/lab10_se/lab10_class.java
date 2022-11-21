package lab10_se;

public class lab10_class {
	
	public static int addint(int a, int b) {
		int c = a+b;
		return c;
	}
	public static String addstring(String a, String b) {
		String c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(addstring("hello", "world"));
		System.out.println(addint(1, 2));
		
	}

}
