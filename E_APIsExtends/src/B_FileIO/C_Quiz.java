package B_FileIO;
import java.io.*;
public class C_Quiz {
	public static void main(String[] args) {
try {
		String str = "Run E_IOStream > B_FileIO > B_MakeJavaFile";
		File file = new File("src\\B_FileIO\\C_Quiz.java");
		OutputStream stream = new FileOutputStream(file);
		byte[] binary = str.getBytes();
		stream.write(binary);
		stream.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}