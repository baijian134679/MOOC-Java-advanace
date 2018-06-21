package advance;

import java.util.Scanner;

public class Main_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction{
	int a;
	int b;
	double value;
	
	Fraction(int a, int b )
	{
		this.a = a;
		this.b = b;
	}
	
	double toDouble()
	{
		return ((double)a/b);
	}
	
	Fraction plus(Fraction r)
	{
		int fenzi = a*r.b+r.a*b;
		int fenmu = b*r.b;
		return new Fraction(fenzi, fenmu);
	}
	
	Fraction multiply(Fraction r)
	{
		return new Fraction(a*r.a, b*r.b);
	}

	int gcd(int a, int b) 
	{
		int temp;
		while ( b!=0 ) 
		{
			temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	

	void print() 
	{
		
		if(a==b)
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println( a/gcd(a,b)+"/"+b/gcd(a,b));
		}
	}

}