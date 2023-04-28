package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ii55 {

	public static void main(String[] args) {
		try {
			long start =System.currentTimeMillis();
			FileInputStream fin =new FileInputStream("dir1/200w.gif");
			FileOutputStream fout =new FileOutputStream("dir2/22.gif");
			int b;
			while((b=fin.read())!=-1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish:"+((System.currentTimeMillis()-start)));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
