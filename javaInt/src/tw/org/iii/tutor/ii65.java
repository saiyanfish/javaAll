package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ii65 {

	public static void main(String[] args) {
		try {
			ServerSocket server =new ServerSocket(9958);
			Socket socket =server.accept();
			
			String ip =socket.getInetAddress().getHostAddress();
			System.out.println("ur:"+ip);
			InputStream ins =socket.getInputStream();
//			InputStreamReader insr =new InputStreamReader(ins);
			BufferedReader bread =new BufferedReader(new InputStreamReader(ins));
			String line;
			while((line=bread.readLine())!=null) {
				System.out.println(line);
			}
			bread.close();
			
			server.close();
			System.out.println("recieve:ok");
		} catch (Exception e) {
			System.out.println(e);
		}	
	}

}
