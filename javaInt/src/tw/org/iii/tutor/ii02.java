package tw.org.iii.tutor;

import java.util.Scanner;

public class ii02 {

	public static void main(String[] args) {
		//INPUT =>10 +3 =13
		Scanner scanner =new Scanner(System.in);
		System.out.print("x=:");
		int x =scanner.nextInt();
		System.out.print("y=:");
		int y =scanner.nextInt();
		int r =x +y;
		int z =x*y;
		int a =x/y;
		int q =x%y;
		System.out.println(String.format("%d+%d=%d",x,y,r));
		System.out.printf("%d*%d=%d\n",x,y,z);
		System.out.printf("%d/%d=%d餘數=%d\n",x,y,a,q);
//		System.out.printf("餘數:%d\n",q );
//		System.out.println(r);
	}

}
