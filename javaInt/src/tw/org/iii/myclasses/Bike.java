package tw.org.iii.myclasses;

import java.io.Serializable;

public class Bike extends Object implements Serializable{
	protected  double speed;
	private String color;
	public Bike() {

	}
	public Bike(String a) {
		System.out.println("Bike()");
		color =a;
	}
	public String getColor() {
		return color;

	}
	public void upSpeed() {
		speed =speed < 1 ? 1 :speed*1.2;
	}
	public void downSpeed() {
		speed = speed<1 ? 0 :speed*0.7;
	}
	public double getSpeed() {
		return speed;
	}
	@Override
	public String toString() {
		return "Bike"+speed;
	}
}
