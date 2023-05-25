package tw.org.iii.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.LinkedList;

public class ii63 {

	public static void main(String[] args) {
	
		byte[] data ="87？".getBytes();
		
		try {
			DatagramSocket socket =new DatagramSocket();
			DatagramPacket packet =new DatagramPacket(data,data.length,InetAddress.getByName("10.0.104.255"),8888);
			socket.send(packet);
			socket.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
}
