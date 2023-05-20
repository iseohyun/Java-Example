package i_Network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class B2_Http {
    public static void main(String[] args) throws IOException {
        // HTTPS를 사용하는 서버에는 리다이렉션된다.
        String DomainName = "google.com";
        Socket socket = new Socket(DomainName, 80);

        // 도메인 이름과 확장자 .html을 가진 파일 객체 생성
        File file = new File(DomainName + ".html");

        // 파일에 데이터를 출력하기 위한 OutputStream 객체 생성
        OutputStream FileOut = new FileOutputStream(file);

        // 소켓의 출력 스트림을 가져오는 OutputStream 객체 생성
        OutputStream NetSend = socket.getOutputStream();

        // 소켓의 입력 스트림을 가져와서 인코딩을 지정한 InputStreamReader 객체 생성
        InputStreamReader NetReceive = new InputStreamReader(socket.getInputStream(), "utf-8");

        // InputStreamReader를 BufferedReader로 감싸서 한 줄씩 읽을 수 있는 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(NetReceive);

        // Request page
        NetSend.write(("GET \r\n").getBytes());
        NetSend.flush();

        // 한줄씩 읽어와서 파일에 작성
        String line = null;
        while ((line = br.readLine()) != null) {
            byte[] binary = line.getBytes();
            FileOut.write(binary);
            System.out.println(line);
        }

        // 소켓 종료
        socket.close();
        NetReceive.close();
        FileOut.close();
    }
}