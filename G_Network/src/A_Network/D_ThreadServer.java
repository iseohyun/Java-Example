package A_Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

class userThread extends Thread {
	Socket SS;
	int ID;
	
	userThread(Socket SS, int ID) {
		this.SS = SS;
		this.ID = ID;
	}
	
	public void run() {
		try {
			OutputStream Send = SS.getOutputStream();
			Send.write(Integer.toString(ID).getBytes());
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		while(true) {
			try {
				InputStream IS = SS.getInputStream();
				byte[] bt = new byte[256];
				int size = IS.read(bt);
				String buf = new String(bt, 0, size, "UTF-8");
				
				System.out.println(ID + " > " + buf);
			} catch (IOException e) {
				System.out.println("-- " + ID + " user OUT");
			}
		}
	}
}

class connectTread extends Thread {
	@SuppressWarnings("resource")
	public void run() {
		try {
			int Count = 1;
			ServerSocket MSS = new ServerSocket();
			MSS.bind(new InetSocketAddress(InetAddress.getLocalHost(), 4040));
			System.out.println("- Server Opened.");

			while(true) {
				Socket SS = MSS.accept();
				System.out.println("--" + Count + " user login");
				userThread ust = new userThread(SS, Count);
				ust.start();
				Count++;
			}
		}catch(IOException e) {
		}
	}
}

public class D_ThreadServer {
	public static void main(String[] args) throws IOException{
		connectTread cnt = new connectTread();
		cnt.start();
	}
}
