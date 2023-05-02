package tw.org.iii.tutor;

import java.util.LinkedList;
import java.util.List;

public class ii38list {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(3);
		list.add(10);
		list.add(3);
		list.add(15);
		System.out.println(list.get(2));
		System.out.println("-----");
		
		list.add(2,7);
		System.out.println(list);
	}

}
