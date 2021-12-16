package secure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author Seohyun Jung
 *
 *         XSS(Cross Site Script)는 공격자가 서버에 공격 코드를 삽입함으로써, 익명의 사용자가 잘못된 코드를
 *         수행하도록 하는 공격방식이다. Runtime.getRuntime().exec()가 공격을 수행하기 위한 코드이다.
 * 
 *         version에 잘못된 디렉토리를 삽입하여 원하지 않는 프로그램이 수행되도록 할 수 있다.
 *
 */

public class XSS {
	public static void main(String[] args) {
		Properties props = new Properties();
		InputStream in = null;

//		props.load(in);
//		String version = props.getProperty("dir_type");
//		String cmd = new String("cmd.exe /K \"rmanDB.bat \"");
//		Runtime.getRuntime().exec(cmd + " c:\\prog一cmd\\" + version);	// version에 악성코드가 삽입되어도 방어 할 수 없다.

		try {
			props.load(in);
			String version[] = { "1.0", "1.1" };
			int versionSelection = Integer.parseInt(props.getProperty("version"));

			String cmd = new String("cmd.exe /K \"rmanDB.bat \"");
			String vs = " ";

			// 방어용 코드 : 정해진 디렉터리 이외의 디렉터리에 접근할 수 없다.
			if (versionSelection == 0) {
				vs = version[0];
			} else if (versionSelection == 1) {
				vs = version[1];
			} else {
				vs = version[1];
			}

			Runtime.getRuntime().exec(cmd + "c:\\prog_cmd\\" + vs);
		} catch (IOException e) {
		}
	}
}
