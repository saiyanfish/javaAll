package tw.org.iii.tutor;

import tw.org.iii.myclasses.BCrypt;

public class ii75 {

	public static void main(String[] args) {
		String password ="123456";
		String hwpsd= BCrypt.hashpw(password, BCrypt.gensalt());
		System.out.println(hwpsd);
		
		if(BCrypt.checkpw("123456", "$2a$10$UI5KTkSnv4iOcbJer4CilOaLcJsqHsVZ.qirTQUc6RM0EyNqa5sz2")) {
			System.out.println("ok");
		}else {
		System.out.println("xx");}

	}

}
