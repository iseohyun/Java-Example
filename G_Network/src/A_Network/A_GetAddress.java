package A_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class A_GetAddress {
	public static void main(String[] args) {
		try {
			InetAddress inet = InetAddress.getByName("google.co.kr");
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
