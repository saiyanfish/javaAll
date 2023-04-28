package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ii64 {

	public static void main(String[] args) {
		byte[]buf =new byte[1024];
		try(DatagramSocket socket =new DatagramSocket(8888);) {
			DatagramPacket packet =new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			String urip  =packet.getAddress().getHostAddress();
			byte[]data=packet.getData();
			int len =packet.getLength();
			String message =new String(data,0,len);
			System.out.println(urip+":"+message);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
