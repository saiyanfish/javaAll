package tw.org.iii.tutor;

import tw.org.iii.myclasses.Idclass;

public class ii23 {
	public static void main(String[] args) {
		String id ="N111111114";
		if(Idclass.checkId(id)) {
			System.out.println("oo");
		}
		else {
			System.out.println("xx");
		}
		Idclass id1 =new Idclass();
		Idclass id2 =new Idclass(1);
		Idclass id3 =new Idclass(false);
		Idclass id4 =new Idclass(true,25);
		System.out.println(id1.getId());
		Idclass id5 =Idclass.createID("A123456798");
		System.out.println(id5.getId());
		System.out.println(id5.getGender());
		
	}
}
