package advance;

import java.io.IOException;

public class Stream_01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		byte[] buffer = new byte[1024];
		try {
			int len = System.in.read(buffer);
			String s = new String(buffer, 0, len);
			System.out.println("读到了"+len+"字节");
			System.out.println(s);
			System.out.println("s的长度是:"+s.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
