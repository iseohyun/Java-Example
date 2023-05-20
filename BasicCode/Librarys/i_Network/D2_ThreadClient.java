package i_Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class D2_ThreadClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        Socket socket = null;
        try {
            socket = new Socket();

            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 4040));
            InputStream IS = socket.getInputStream();
            byte[] bt = new byte[10];
            int size = IS.read(bt);
            String buf = new String(bt, 0, size, "UTF-8");
            num = Integer.parseInt(buf);
            System.out.println("Client " + num);

            while (true) {
                System.out.print("> ");
                String message = input.nextLine();
                byte[] as = message.getBytes("UTF-8");
                OutputStream StrmOut = socket.getOutputStream();
                StrmOut.write(as);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            socket.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}