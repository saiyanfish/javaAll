package tw.org.iii.tutor;

public class ii26 {
	public static void main(String[] args) {
		byte b1 =123;
		int i1 =b1;
		int i2 =128;
		byte b2 =(byte)i2; ///喪失其精度
		System.out.println(b2);
		System.out.println("-----");
		byte b3=127;
		b3++;
		b3+=1;
		
		System.out.println(b3);
	}
}
