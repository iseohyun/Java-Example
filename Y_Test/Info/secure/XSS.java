package secure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author Seohyun Jung
 *
 *         XSS(Cross Site Script)�� �����ڰ� ������ ���� �ڵ带 ���������ν�, �͸��� ����ڰ� �߸��� �ڵ带
 *         �����ϵ��� �ϴ� ���ݹ���̴�. Runtime.getRuntime().exec()�� ������ �����ϱ� ���� �ڵ��̴�.
 * 
 *         version�� �߸��� ���丮�� �����Ͽ� ������ �ʴ� ���α׷��� ����ǵ��� �� �� �ִ�.
 *
 */

public class XSS {
	public static void main(String[] args) {
		Properties props = new Properties();
		InputStream in = null;

//		props.load(in);
//		String version = props.getProperty("dir_type");
//		String cmd = new String("cmd.exe /K \"rmanDB.bat \"");
//		Runtime.getRuntime().exec(cmd + " c:\\prog��cmd\\" + version);	// version�� �Ǽ��ڵ尡 ���ԵǾ ��� �� �� ����.

		try {
			props.load(in);
			String version[] = { "1.0", "1.1" };
			int versionSelection = Integer.parseInt(props.getProperty("version"));

			String cmd = new String("cmd.exe /K \"rmanDB.bat \"");
			String vs = " ";

			// ���� �ڵ� : ������ ���͸� �̿��� ���͸��� ������ �� ����.
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
