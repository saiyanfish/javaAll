package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ii71 {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://www.ispan.com.tw/img/home/home_employ.jpg");
			HttpURLConnection conn =(HttpURLConnection)url.openConnection();
			conn.connect();
			FileOutputStream fout =new FileOutputStream("dir1/iii.jpg");
			BufferedInputStream bin =new BufferedInputStream(conn.getInputStream());
			byte [] buf =new byte [4*1024];int len;
			while((len=bin.read(buf))!=-1) {
				fout.write(buf,0,len);
			}
			
			fout.flush();
			fout.close();
			bin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
