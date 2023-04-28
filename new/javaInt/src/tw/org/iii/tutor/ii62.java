package tw.org.iii.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ii62 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips =InetAddress.getAllByName("www.yahoo.com");
			for(InetAddress ip:ips) {
				System.out.println(ip.getHostAddress());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
