package i_Network;

import java.io.IOException;
import java.net.InetAddress;

public class A_DNS {
    public static void main(String[] args) throws IOException {

        // 도메인 이름으로 IP주소를 찾기(DNS)
        String DomainName = "google.com";
        InetAddress inet = InetAddress.getByName(DomainName);
        String ipAddr = inet.getHostAddress();
        System.out.println(DomainName + "/" + ipAddr);
    }
}