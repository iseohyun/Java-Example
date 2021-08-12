package A_Network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C_Server {
	public static void main(String[] args) throws IOException{
		ServerSocket serv = new ServerSocket(7777);
		
		while(true) {
			Socket clnt = serv.accept();
			System.out.println(clnt);
			
			BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(clnt.getOutputStream()));
			buf.write("환영합니다.");
			buf.flush();
			
			clnt.close();
			buf.close();
		}
	}
}
