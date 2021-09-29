package A_Network;

import java.io.IOException;
import java.net.InetAddress;

public class A_DNS {
	public static void main(String[] args) throws IOException {
		String ipAddr;
		String DomainName = "google.com";

		// ������ �̸����� IP�ּҸ� ã��(DNS)
		InetAddress inet = InetAddress.getByName(DomainName);
		ipAddr = inet.getHostAddress();
		System.out.println(DomainName + "/" + ipAddr);

		// IP�ּҷ� ������ �̸� ã��(����)
		InetAddress inet2 = InetAddress.getByName(ipAddr);
		DomainName = inet2.getHostName();
		System.out.println(DomainName + "/" + ipAddr);
	}
}