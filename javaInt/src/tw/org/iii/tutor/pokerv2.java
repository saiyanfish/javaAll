package tw.org.iii.tutor;

public class pokerv2 {

	public static void main(String[] args) {
//		long startTime =System.currentTimeMillis();
//		System.out.println(startTime);
		int count = 52;
		int[] poker = new int[count];
		boolean isRepeat;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			do {
				temp = (int) (Math.random() * 52);

		// inspect mechanism
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
		// repeat
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			poker[i] = temp;
		}
		for (int v : poker) {
			System.out.println(v);
		}
//		ÏSystem.out.println("---");
//		System.out.println(System.currentTimeMillis()-startTime);
		//發牌
		
	}
}
