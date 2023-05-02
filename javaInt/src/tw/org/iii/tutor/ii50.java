package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ii50 {

	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("dir1/file1.txt");
//			
			for(int c =fin.read();c>=0;c =fin.read()) {
				System.out.print((char)c);
			}		
//			int c;
//			while((c=fin.read())!=-1) {
//				System.out.print((char)c);
//			}
			
			fin.close();
//			System.out.println("ok");
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
}

