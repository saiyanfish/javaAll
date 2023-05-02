package tw.org.iii.tutor;

public class ii13 {

	public static void main(String[] args) {
		int i=0;
		for(printBrad();i<10;printII()) {
			System.out.println(i++);
		}
		
		
	}
	static void printBrad() {
		System.out.println("Brad");
	}
	static void printII() {
		System.out.println("----");
	}
	static void printLot() {
		int lot =(int)(Math.random()*49+1);
		System.out.println(lot);
	}
	
}
