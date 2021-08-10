package A_Network;

import java.io.IOException;
import java.net.Socket;

public class C_Socket {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("www.naver.com", 80);
			System.out.println(socket);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
