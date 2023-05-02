package tw.org.iii.tutor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ii53 {

	public static void main(String[] args) {
		String data = "peko,II\n";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file2.txt", true);
			fout.write(data.getBytes());
			fout.close();
			System.out.println("ok");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
