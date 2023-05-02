package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ii52 {

	public static void main(String[] args) {
		try {
			File src =new File("dir1/file1.txt");
			FileInputStream fin =new FileInputStream(src);
//			
//			for(int c =fin.read();c>=0;c =fin.read()) {
//				System.out.print((char)c);
//			}		
			byte[]buf =new byte[(int)src.length()];
			int len;
			fin.read(buf);
			System.out.println(new String(buf));
			fin.close();
//			System.out.println("ok");
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
}

