package A_Network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class G2_ThreadClient {
	final static String SERVER_ADDRESS = "192.168.123.12";
	final static int DEFAULT_PORT = 4040;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Client 1");
		
		Socket SocCli = null;
		try {
			SocCli = new Socket();
			 
			SocCli.connect(new InetSocketAddress(InetAddress.getLocalHost(), 4040));
			
			while(true) {
				System.out.print("> ");
				String message = input.nextLine();
				byte[] as = message.getBytes("UTF-8");
				OutputStream StrmOut = SocCli.getOutputStream();
				StrmOut.write(as);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SocCli.close();
			input.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
