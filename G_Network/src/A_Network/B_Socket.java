package A_Network;

import java.io.IOException;
import java.net.Socket;

public class B_Socket {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		socket = new Socket("www.naver.com", 80);
		System.out.println(socket);
		socket.close();
	}
}
