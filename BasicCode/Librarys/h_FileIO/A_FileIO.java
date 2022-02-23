package h_FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class A_FileIO {
	public static void main(String[] args) {
		try {
			String test = "hello world";
			byte[] binary = test.getBytes();
			File file = new File("d:\\test.txt");
			OutputStream stream = new FileOutputStream(file);
			stream.write(binary);
			stream.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
