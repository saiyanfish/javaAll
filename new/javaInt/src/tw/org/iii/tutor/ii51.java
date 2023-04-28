package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ii51 {

	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("dir1/file1.txt");
//			
//			for(int c =fin.read();c>=0;c =fin.read()) {
//				System.out.print((char)c);
//			}		
			byte[]buf =new byte[3];
			int len;
			while((len=fin.read(buf))!=-1) {
				System.out.print(new String(buf,0,len));
			}
			
			fin.close();
//			System.out.println("ok");
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
}

