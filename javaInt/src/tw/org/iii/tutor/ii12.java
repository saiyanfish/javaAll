package tw.org.iii.tutor;

public class ii12 {

	public static void main(String[] args) {
		int month = 10;
		int day =0;
		//switch只能是short,byte,int,char,String,enum
		switch (month) {
		case 1,3,5,7,8,10,12:
			System.out.println("31天");
		day=31;
			break;
		case 2:
			System.out.println("28天");
			day=28;
			break;
		case 4,6,9,11:
			System.out.println("30天");
		day=30;
			break;
		default:
			System.out.println("XX");
			
			break;
		}
		System.out.printf("%d月有%d天",month,day);
	}
}
