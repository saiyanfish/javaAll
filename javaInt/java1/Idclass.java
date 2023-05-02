package tw.org.iii.myclasses;


public class Idclass {
	private String id;
	private static String letter = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	private static String [] address = {"台北市","台中市"};
	private static String []gender = {"男","女"};
	public Idclass() {
		this((int)(Math.random()*2) == 0);
	}
	///第一道敘述句只能super()｜｜this
	public Idclass(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}

	public Idclass(int area) {
		this((int)(Math.random()*2) == 0, area);
	}

	public Idclass(boolean isMale, int area) {
		String c1 = letter.substring(area, area + 1);
		StringBuilder sb = new StringBuilder(c1);
		sb.append(isMale?"1":"2");
		for (int i=0; i<7; i++) {
			sb.append((int)(Math.random()*10));
		}
		
		String temp = sb.toString();
		for (int i=0; i<10; i++) {
			if (checkId(temp + i)) {
				id = temp + i;
				break;
			}
		}
	}

	private Idclass(String id) {
		this.id =id;
	}
	public static Idclass createID(String id) {
		Idclass id001 =null;
		if(checkId(id)) {
			id001 =new Idclass(id);
		}
		return id001;
	}
	public String getId() {
		return id;
	}	
	public String getGender() {
		
		int aa=(Integer.parseInt(id.substring(1,2)));
		String zz =gender[aa];
		return zz;
	}
	public static boolean checkId(String id) {

		// 1.LEN =10
		// 2.C1=>A~Z
		// 3.C2=1,2,8,9
		// 4.C3-C10=>0~9
		boolean isRight = false;
		if (id.matches("[A-Z][1289][0-9]{8}")) {
//			char c1 =id.charAt(0);
//			if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c1)!=-1) {
//			}

			char c1 = id.charAt(0);
			int n12 = letter.indexOf(c1) + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));

			int sum = n1 * 1 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2 + n10 * 1
					+ n11 * 1;

			isRight = sum % 10 == 0;
		}
		return isRight;
	}
}
