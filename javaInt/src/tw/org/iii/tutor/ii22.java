package tw.org.iii.tutor;

public class ii22 {

	public static void main(String[] args) {
		String s1 ="IA";
		System.out.println(s1);
		System.out.println("IA".charAt(1));
		String s2 =new String();
		byte[]b1 = new byte[]{97,98,99,100};
//		byte[]b1 = {97,98,99,100};
		byte[]b2;
		b2 =new byte[] {65,66,67,68};
		String s3 =new String(b1);
		System.out.println(s3);
		String s4 =new String(b2);
		System.out.println(s4);
		
	}

}
