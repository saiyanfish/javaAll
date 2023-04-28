package tw.org.iii.tutor;

import java.util.Random;

//@SuppressWarnings("unused")
public class pokerv3 {

	public static void main(String[] args) {
		int [] poker;
		poker = new int[52];
		for(int i=0;i<poker.length;i++) {
			poker[i]=i;
		};
		for(int v:poker) {
			System.out.println(v)
			;
		}
		for(int i=51;i>0;i--) {
			int z =(int)(Math.random()*(i+1));
			int temp;
			temp =poker[i];
			poker[i]=poker[z];
			poker[z]=temp;
		}
		System.out.println("------");
		for(int card:poker) {
			System.out.println(card)
			;
		}
	}

}
