package tw.org.iii.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.Socket;

public class ii67 {

	public static void main(String[] args) {
		try {
			File source =new File("dir1/ball.png");
			BufferedInputStream bin =new BufferedInputStream(new FileInputStream(source));
			byte[] buf =new byte[(int)source.length()];
			bin.read(buf);
			bin.close();
			System.out.println("rd ok");
			
			Socket socket =new Socket(InetAddress.getByName("10.0.104.190"), 9999);
			BufferedOutputStream bout =new BufferedOutputStream(socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			socket.close();
			System.out.println("sd ok");
		} catch (Exception e) {
			
		}
	}

}
