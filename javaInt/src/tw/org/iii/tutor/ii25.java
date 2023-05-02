package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class ii25 {
	public static void main(String[] args) {
		String str1 ="ii";
		String str2 ="ii";
		String str3 =new String("ii");
		String str4 =new String("ii");
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4)); ///比字串內容
		System.out.println(str3==str4);  ///比物件
		Bike b1 =new Bike();
		Bike b2 =new Bike();
		Integer ii =new Integer(33);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		Bike b3 =b2;
		System.out.println(b2.equals(b3));
		System.out.println(b2 ==b3);
		//hashCode()>>>equals()
		
	}
}
