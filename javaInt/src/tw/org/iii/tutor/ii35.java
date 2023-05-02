package tw.org.iii.tutor;

import java.util.HashSet;

import tw.org.iii.myclasses.Bike;

public class ii35 {

	public static void main(String[] args) {
		HashSet set =new HashSet();
		set.add("ii");
		set.add(new Bike());
		set.add(123); ///123 auto-boxing 
		set.add("ii");
		set.add(123);
		System.out.println(set.size());
		System.out.println(set.toString());
		
	}
}
