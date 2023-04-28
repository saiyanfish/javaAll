package tw.org.iii.myclasses;

public class Scooter extends Bike {
	

	public Scooter(String a) {
		super(a);
		
	}

	private int gear;

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * gear * 1.2;
//		super.upSpeed();
	}

	public int changGear(int newgear) {
		if (newgear >= 0 && newgear <= 4) {
			gear = newgear;

		}
		return gear;
	}

}
