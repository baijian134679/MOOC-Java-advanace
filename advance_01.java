package advance;

import java.util.ArrayList;
import java.util.HashSet;

class Value{
	private int i;
	public void set( int i ) { this.i = i; }
	public int get() { return i; }
	public String toString() { return ""+i; } //任何类加入toString会自动转换
	
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
		System.out.println(s); // 没有重复的元素，同集合的核心
		// 不排序的集合，同数学集合
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
//		int[] ia = new int[10];//直接就创建了10个int类型的数组
//		String[] a = new String[10]; //创建了10个String类的管理者，并没指向
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
