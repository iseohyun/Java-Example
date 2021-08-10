package A_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class B_LocalHost {
	public static void main(String[] args) {
		try {
			InetAddress inet = InetAddress.getByName("google.co.kr");
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
			System.out.println("----------------------------");
			inet = InetAddress.getByName("172.217.25.67");
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
			System.out.println("----------------------------");
			inet = InetAddress.getLoopbackAddress();
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
		} catch (UnknownHostException e) {
			System.out.println("주소를 찾을 수 없습니다.");
		}
	}
}
