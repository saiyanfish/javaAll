package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;

import javax.sound.sampled.Mixer;

public class It1 {
	public static void main(String[] args) {
		try {
			URL url =new URL("http://checkip.amazonaws.com");
			BufferedReader bread =new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer sb =new StringBuffer();
			String line;
			while((line=bread.readLine())!=null) {
				sb.append(line);
			}
			line =sb.toString();
			System.out.println(line);
			 InetAddress ip = InetAddress.getByName("checkip.amazonaws.com");
	            System.out.println("Public IP Address: " + ip.getHostAddress());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

