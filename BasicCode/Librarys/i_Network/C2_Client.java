package i_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class C2_Client {
    public static void main(String[] args) throws IOException {
        // 자기자신("127.0.0.1")의 7777포트로 접속합니다.
        Socket Soc = new Socket("127.0.0.1", 7777);

        // 소켓에서 출력된 내용을 버퍼에 받아씁니다.
        BufferedReader buf = new BufferedReader(new InputStreamReader(Soc.getInputStream()));

        // 버퍼의 내용을 읽어옵니다.
        System.out.println(buf.readLine());

        // 통신을 종료합니다.
        Soc.close();
    }
}