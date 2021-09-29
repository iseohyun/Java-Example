package A_Network;

import java.io.IOException;
import java.net.InetAddress;

public class A_DNS {
	public static void main(String[] args) throws IOException {
		String ipAddr;
		String DomainName = "google.com";

		// 도메인 이름으로 IP주소를 찾기(DNS)
		InetAddress inet = InetAddress.getByName(DomainName);
		ipAddr = inet.getHostAddress();
		System.out.println(DomainName + "/" + ipAddr);

		// IP주소로 도메인 이름 찾기(실패)
		InetAddress inet2 = InetAddress.getByName(ipAddr);
		DomainName = inet2.getHostName();
		System.out.println(DomainName + "/" + ipAddr);
	}
}