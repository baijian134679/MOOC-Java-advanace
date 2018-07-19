package advance;

public class exception_02 {

	public static void f() {
		int[] a = new int[10];
		a[10] = 10;
		System.out.println("hello");
	}
	
	public static void g() {
		f();
	}
	
	public static void h() {
		int i=10;
		if ( i<100 ) {
			g();
		}
	}
	
	public static void k() {
		try { 
			h();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("k()");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			k();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("main");
	}

}
