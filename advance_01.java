package advance;

import java.util.ArrayList;
import java.util.HashSet;

class Value{
	private int i;
	public void set( int i ) { this.i = i; }
	public int get() { return i; }
	public String toString() { return ""+i; } //�κ������toString���Զ�ת��
	
}

public class advance_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("frist");
		a.add("second");
		a.add("frist");
		System.out.println(a);
		System.out.println("-----------");
		HashSet<String> s = new HashSet<String>();
		s.add("frist");
		s.add("second");
		s.add("frist");
		System.out.println(s); // û���ظ���Ԫ�أ�ͬ���ϵĺ���
		// ������ļ��ϣ�ͬ��ѧ����
		System.out.println("-----------");
		Value v = new Value();
		v.set(10);
		System.out.println(v);
//		Value[] a = new Value[10];
//		for ( int i=0; i<a.length; i++ ) {
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for( Value v : a ) {
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for( Value v : a ) {
//			System.out.println(v.get());
//		}
//		int[] ia = new int[10];//ֱ�Ӿʹ�����10��int���͵�����
//		String[] a = new String[10]; //������10��String��Ĺ����ߣ���ûָ��
//		System.out.println(ia[0]+2);
//		System.out.println(a[0]);
//		String s[] = null;
////		System.out.println(s.length);
//		for ( int i=0; i<ia.length; i++ ) {
//			ia[i] = i;
//		}
//		for ( int k : ia) {
//			System.out.println(k);
//		}
//		for ( int i=0; i<s.length; i++ ) {
//			s[i] = ""+i;
//		}
//		for ( String k: s) {
//			System.out.println(k);
//		}
	}

}
