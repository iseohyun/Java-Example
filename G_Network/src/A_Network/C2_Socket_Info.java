package A_Network;

import java.io.IOException;
import java.net.Socket;

public class C2_Socket_Info {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("www.naver.com", 80);
			System.out.println(socket);
			
			System.out.println("==================");
			System.out.println("Server : " + socket.getInetAddress());
			System.out.println("Server : " + socket.getInetAddress().getHostName());
			System.out.println("Server : " + socket.getInetAddress().getHostAddress());
			System.out.println("Server : " + socket.getPort());
			
			System.out.println("==================");
			System.out.println("Client : " + socket.getLocalAddress());
			System.out.println("Client : " + socket.getLocalAddress().getHostName());
			System.out.println("Client : " + socket.getLocalAddress().getHostAddress());
			System.out.println("Client : " + socket.getLocalPort());
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
