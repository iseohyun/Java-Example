package A_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class F2_Client {
	public static void main(String[] args) {
		Socket my = null;
		try {
			my = new Socket("127.0.0.1", 7777);
			BufferedReader buf= new BufferedReader(new InputStreamReader(my.getInputStream()));
			System.out.println(buf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
