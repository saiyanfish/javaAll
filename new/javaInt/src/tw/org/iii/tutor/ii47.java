package tw.org.iii.tutor;

import java.io.File;

public class ii47 {
	public static void main(String[] args) {
		File root =new File(".");
		System.out.println(root.getAbsolutePath());
		File dir1 =new File("./dir1");
		File dir2 =new File("dir2");
		if(dir2.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
	}

}
