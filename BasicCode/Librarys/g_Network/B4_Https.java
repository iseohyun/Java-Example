package g_Network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

public class B4_Https {
	public static void main(String[] args) throws IOException {
		String DomainName = "www.google.com";
		URL url = new URL("https://" + DomainName);
		File file = new File(DomainName + ".html");
		OutputStream FileOut = new FileOutputStream(file);
		InputStreamReader WebData = new InputStreamReader(url.openStream(), "UTF-8");
		BufferedReader html = new BufferedReader(WebData);

		String line;
		while ((line = html.readLine()) != null) {
			byte[] binary = line.getBytes();
			FileOut.write(binary);
			System.out.println(line);
		}

		FileOut.close();
		html.close();
	}
}