package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class ii19 {

	public static void main(String[] args) {
		Bike bike =new Bike("red");
		bike.getColor();
		
		System.out.println(bike.getSpeed());
		while(true) {			
			if(bike.getSpeed()>7.0) {
				break;
			}
			bike.upSpeed(); 
		}
		System.out.println(bike.getSpeed());

}}
