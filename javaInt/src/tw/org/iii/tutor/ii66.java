package tw.org.iii.tutor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ii66 {

	public static void main(String[] args) {
		try {
			Socket socket =new Socket(InetAddress.getByName("192.168.16.139"),9958);
			OutputStream oout= socket.getOutputStream();
			OutputStreamWriter ow =new OutputStreamWriter(oout);
			BufferedWriter bw =new BufferedWriter(ow);
			bw.write("朋友你好嗎？,tcp");
			bw.flush();
			bw.close();
			socket.close();
//			System.out.println("send:ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
