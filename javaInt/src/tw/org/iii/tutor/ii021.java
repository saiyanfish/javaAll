package tw.org.iii.tutor;

import java.util.Scanner;

public class ii021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x=");
		int i =scanner.nextInt();
		System.out.println("y=");
		int o =scanner.nextInt();
		int r =i*o;
		System.out.println(String.format("%d*%d=%d",i,o,r));
	}
}
