package tw.org.iii.tutor;

public class ii99 {

	public static void main(String[] args) {
		
		for(int i=1;i<10;printI()) {
			for(int o=2;o<6;) {
				int x =o*i;
				System.out.print(String.format("%d*%d=%d\t|",o,i,x));
				o++;
			}
			i++;

		}
		System.out.println("--------------------------------------");
		for(int i=1;i<10;printI()) {
			for(int o=6;o<10;) {
				int x =o*i;
				System.out.print(String.format("%d*%d=%d\t|",o,i,x));
				o++;
			}
			i++;

		}
	}
	static void printI() {
		System.out.println("");
	}
	
}
