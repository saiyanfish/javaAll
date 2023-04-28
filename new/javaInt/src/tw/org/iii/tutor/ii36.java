package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;

public class ii36 {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<>();
		set.add("iii");
		set.add("ii1");
		set.add("ii2");
		set.add("ii3");
		
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----");
		for(String v:set) {
			System.out.println(v);
		}
//		HashSet<String> lottery =new HashSet<>();
//		for(int i=1;i<50;i++) {
//			String x = Integer.toString(i);
//			lottery.add(x);
//		}
//		Iterator<String> lotIt =lottery.iterator();
//		for(int i=0;i<6;i++) {
//			System.out.println(lotIt.next());
//		}
	}
}
