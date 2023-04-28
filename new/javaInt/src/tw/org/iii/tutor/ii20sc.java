package tw.org.iii.tutor;

import tw.org.iii.myclasses.Scooter;

public class ii20sc {
	public static void main(String[] args) {
		Scooter s1 =new Scooter("green");
		System.out.println(s1.getColor());
		s1.changGear(4);
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(s1.getSpeed());
		
		
	}
}
