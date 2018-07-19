package advance;

class OpenException extends Exception {}

class CloseException extends OpenException {}

class NewException extends Exception {}

public class exception_04 {
	public exception_04() throws OpenException {}
	public void f() throws OpenException {}
	public static void main(String[] args) {
	}

}

class NewClass extends exception_04{
	public NewClass() throws OpenException, NewException {}
	public void f() {}
	public static void main(String[] args) {
		try {
			exception_04 p = new NewClass();
			p.f();
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}