package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ii57 {

	public static void main(String[] args) {
		long start =System.currentTimeMillis();
		File src = new File("dir1/200w.gif");
		File trg =new File("dir2/23.gif");
		try {
			FileInputStream fin =new FileInputStream(src);
			byte [] buf =new byte[(int)src.length()];
			fin.read(buf);
			fin.close();
//			for(byte a:buf) {
//				System.out.println(a);
//			}
			//TODO S
			FileOutputStream fout =new FileOutputStream(trg);
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("finish3:"+(System.currentTimeMillis()-start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
