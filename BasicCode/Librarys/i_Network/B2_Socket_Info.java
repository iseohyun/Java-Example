package i_Network;

import java.io.IOException;
import java.net.Socket;

public class B2_Socket_Info {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		socket = new Socket("www.naver.com", 80);
		System.out.println(socket);

		System.out.println("== Server ========");
		System.out.println("Host : " + socket.getInetAddress().getHostName());
		System.out.println("IP   : " + socket.getInetAddress().getHostAddress());
		System.out.println("Port : " + socket.getPort());

		System.out.println("== Clinet ========");
		System.out.println("Host  : " + socket.getLocalAddress().getHostName());
		System.out.println("IP    : " + socket.getLocalAddress().getHostAddress());
		System.out.println("Port  : " + socket.getLocalPort());

		socket.close();
	}
}