package tw.org.iii.tutor;

public class pokerv1 {

	public static void main(String[] args) {
//		long startTime =System.currentTimeMillis();
//		System.out.println(startTime);
		int count =52;
		int []poker =new int[count];
		for(int i=0;i<poker.length;i++) {
			int temp=(int)(Math.random()*52);
			
			//inspect mechanism
			boolean isRepeat=false;
			for(int j =0;j<i;j++) {
				if(temp==poker[j]) {
					//repeat
					isRepeat =true;
					break;
				}
				if(!isRepeat) {
					poker[i]=temp;
				}else {
					i--;
				}
			}
		}
		for(int v :poker) {
			System.out.println(v);
		}
//		System.out.println("---");
//		System.out.println(System.currentTimeMillis()-startTime);
	}
}
