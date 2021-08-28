package Quiz;

import java.io.UnsupportedEncodingException;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T07Q05_Security {
	public String encriString(String usr) throws UnsupportedEncodingException {
		String CyperMsg = null;
		String key = "22df3023sf~2;asn!@#/>as";
		if(key != null) {
			byte[] bToEncrypt = usr.getBytes("UTF-8");
		}
		return CyperMsg;
	}
	
	public static void main(String[] args) {
		
	}
}