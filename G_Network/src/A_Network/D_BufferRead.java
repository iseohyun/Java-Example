package A_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class D_BufferRead {
	public static void main(String[] args) throws UnknownHostException, IOException{
		Socket socket = new Socket("google.com", 80);
		BufferedReader br =
				new BufferedReader(
						new InputStreamReader(socket.getInputStream(), "utf-8"));
		
		OutputStream out = socket.getOutputStream();
		
		
		// Request page
		out.write(("GET \n").getBytes());
		out.flush();
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		socket.close();
		out.close();
	}
}
