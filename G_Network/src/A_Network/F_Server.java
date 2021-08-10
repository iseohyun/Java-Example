package A_Network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class F_Server {
	public static void main(String[] args) {
		ServerSocket serv = null;
		Socket clnt = null;
		while(true) {
			try {
				serv = new ServerSocket(7777);
				clnt = serv.accept();
				
				System.out.println(clnt.getInetAddress().getHostName());
				System.out.println(clnt.getPort());
				
				BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(clnt.getOutputStream()));
				buf.write("환영합니다.");
				buf.flush();
			}catch(IOException e){
				
			}finally {
				try {
					serv.close();
					clnt.close();
				}catch(IOException ee) {
				}
			}
		}
	}
}
