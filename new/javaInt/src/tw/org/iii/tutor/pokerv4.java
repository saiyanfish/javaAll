package tw.org.iii.tutor;
import java.util.ArrayList;
import java.util.Collections;
public class pokerv4 {

	public static void main(String[] args) {
		ArrayList<Integer> poker = new ArrayList<>();
		for (int i=0; i<10; i++) poker.add(i);
		for (Integer v: poker) {
			System.out.println(v);
		}
		System.out.println("-----");
		Collections.shuffle(poker);
		for (Integer v: poker) {
			System.out.println(v);
		}
	}
	
}
