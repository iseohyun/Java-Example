package A_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class C2_Client {
	public static void main(String[] args) throws IOException {
		Socket Soc = new Socket("192.168.123.34", 7777);

		BufferedReader buf = new BufferedReader(new InputStreamReader(Soc.getInputStream()));
		System.out.println(buf.readLine());

		Soc.close();
	}
}