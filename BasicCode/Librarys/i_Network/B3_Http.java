package i_Network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class B3_Http {
	public static void main(String[] args) throws IOException {
		// HTTPS를 사용하는 서버에는 리다이렉션된다.
		String DomainName = "google.com";
		Socket socket = new Socket(DomainName, 80);
		File file = new File(DomainName + ".html");
		OutputStream FileOut = new FileOutputStream(file);
		OutputStream NetSend = socket.getOutputStream();
		InputStreamReader NetReceive = new InputStreamReader(socket.getInputStream(), "utf-8");
		BufferedReader br = new BufferedReader(NetReceive);

		// Request page
		NetSend.write(("GET \r\n").getBytes());
		NetSend.flush();

		String line = null;
		while ((line = br.readLine()) != null) {
			byte[] binary = line.getBytes();
			FileOut.write(binary);
			System.out.println(line);
		}
		socket.close();
		NetReceive.close();
		FileOut.close();
	}
}