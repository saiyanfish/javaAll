package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class ii33 {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(13);
		Integer c = new Integer("13");
		Integer d = Integer.parseInt("13");
		Integer e = 10; // auto-boxing
		System.out.println(e.doubleValue());

		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(e + 12); // b,c => auto-unboxing
	}
}
