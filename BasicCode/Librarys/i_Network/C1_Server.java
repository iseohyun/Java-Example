package i_Network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C1_Server {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("resource")
        // 포트 7777을 사용하여 서버를 생성합니다.
        ServerSocket serv = new ServerSocket(7777);

        while (true) {
            // 서버를 개통하고 접속자가 있을 때까지 대기합니다.
            Socket clnt = serv.accept();

            // 접속자 정보를 출력합니다.
            System.out.println(clnt);

            // 버퍼 출력을 소켓 출력으로 연결합니다. 버퍼에 출력하면 소켓으로 출력됩니다.
            BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(clnt.getOutputStream()));

            // 접속자에게 "..."메시지를 보냅니다.
            buf.write("환영합니다.");

            // 버퍼를 비웁니다.
            buf.flush();

            // 연결을 해제합니다.
            clnt.close();
            buf.close();

            // 루프를 통해 다음 연결을 대기합니다.
        }
    }
}