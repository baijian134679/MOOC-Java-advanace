package advance;

public class Main_02{
 
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}
class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock( int h, int m, int s) {
		hour.inValue(h);
		minute.inValue(m);
		second.inValue(s);
	}
	
	public void tick(){
		second.increase();
		if ( second.getValue()==0 ) {
			minute.increase();
			if ( minute.getValue()==0 ) {
				hour.increase();
			}
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour.getValue(),minute.getValue(),second.getValue());
	}
}

class Display {
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit ) {
			value = 0;
		}
	}
	
	public void inValue( int value ) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}