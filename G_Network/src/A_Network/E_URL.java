package A_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

public class E_URL {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		URL url = new URL("http://google.com");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
		
		String line;
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
}
