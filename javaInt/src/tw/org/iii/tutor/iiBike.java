package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.myclasses.Bike;

public class iiBike {
	
	public static void main(String[] args) {
try {
	long a= System.currentTimeMillis();
	File file =new File("dir1/200w.gif");
	FileInputStream fin =new FileInputStream(file);
	FileOutputStream fout =new FileOutputStream("dir1/s2.gif");
	byte[] buf =new byte[1024*1024];
	
	int len;
	while((len=fin.read(buf))!=-1) {
		fout.write(buf,0,len);
	}
	fin.close();
	fout.flush();
	fout.close();
	System.out.println(System.currentTimeMillis()-a);
} catch (Exception e) {
	e.printStackTrace();
}
	
	}
}
