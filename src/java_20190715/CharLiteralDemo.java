package java_20190715;

public class CharLiteralDemo {
	public static void  main (String[] args) {
		char c1 = '\uAE40';
		char c2 = '\uC601';
		char c3 = '\uBB34';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		char c4 = 'A';
		System.out.println(c4);
		
		String path = "aa\bbb";
		System.out.println(path);
		
		String path1 = "aa\tbb";
		System.out.println(path1);
	}

}
