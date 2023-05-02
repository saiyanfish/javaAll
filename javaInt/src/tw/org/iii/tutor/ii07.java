package tw.org.iii.tutor;

public class ii07 {

	public static void main(String[] args) {
		double temp = Math.random();
		System.out.println(temp);
		double sc = temp * 101;
		int scor = (int) sc;
		System.out.println(scor);
		int score = (int) (Math.random() * 49 + 1);
		System.out.println(score);
		if (score > 300) {
			System.out.println("PASS");
		} else {
			System.out.println("Down");
		}
	}

}
