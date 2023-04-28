package tw.org.iii.tutor;

public class ii16 {

	public static void main(String[] args) {
		int p0, p1, p2, p3, p4, p5, p6;
//		p0=p1=p2=p3=p4=p5=p6=0;
		boolean ss = true;
		int[] pp;
		pp = new int[6];

		for (int i = 0; i < 100000; i++) {
			int pts = (int) (Math.random() * 9 + 1);
			
			switch (pts) {
			case 1:
				pp[0]++;
				break;
			case 2:
				pp[1]++;
				break;
			case 3:
				pp[2]++;
				break;
			case 4:
				pp[3]++;
				break;
			case 5:
				pp[4]++;
				break;
			case 6:
				pp[5]++;
				break;
			case 7:
				pp[3]++;
				break;
			case 8:
				pp[4]++;
				break;
			case 9:
				pp[5]++;
				break;
			default:
				ss = false;
				break;
			}

		}
		if (ss = true) {
			for (int i = 1; i < 7; i++) {
				int a = i - 1;
				System.out.println(String.format("%d點出現%d次", i, pp[a]));
			}
		}
		//for-each
		//for(int v :pp){
		//sysout(v);
		//}
//		System.out.printf("1點%d次,2點%d次,3點%d次,4點%d次,5點%d次,6點%d次", pp[0], pp[1], pp[2], pp[3], pp[4], pp[5]);

	}
}
