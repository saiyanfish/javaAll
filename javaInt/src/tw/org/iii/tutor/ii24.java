package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class ii24 {
	public static void main(String[] args) {
		String s1 ="ii";
		String s2 =s1.concat("infinite");
		String s3 =s1.replace('i','a' );
		System.out.println(s3);
		System.out.println("------");
		
		 int a =10,b=3;
		 System.out.println(a==b);
		 String str1 ="II";
		 String str2 ="II";
		 System.out.println(str1==str2);
		 String str3 =new String("II");
		 String str4 =new String("II");
		 System.out.println(str3==str4);
		 System.out.println(str1==str3);
		 System.out.println(str3); ///呼叫toString
		 System.out.println("-----");
		 Bike b1 =new Bike();
		 Bike b2 =new Bike();
		 System.out.println(b1==b2);
		 System.out.println(b1);
	}
}
