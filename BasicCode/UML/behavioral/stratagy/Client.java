package behavioral.stratagy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Seohyun Jung
 * 
 *		전략패턴 : 기능이 추가 되더라도, '기능추가'를 이용하여
 *			코딩량이 늘어나지 않고, 관리가 쉽도록 하는 전략
 *
 *		예를 들어, 아래에서는 btn.add()를 추가/삭제만으로 기능이 추가가 되었다면,
 *			무전략에서는 추가해야하는 기능(또는 파일)에 찾아가서 기능을 구현 또는 변경해야하므로,
 *			변경점이 혼잡해지고 관리가 어려워짐.
 *
 */

public class Client {
	public static void main(String[] args) throws IOException {
		Button btn = new Button();
		btn.add("Search all...");
		btn.add("Search image...");
		btn.add("Search news...");
		btn.add("Search map...");

		System.out.print("Input Number[1-4] : ");
		int mode = System.in.read() - '1';

		btn.clicked(mode);
	}

	static class Button {
		ArrayList<String> func = new ArrayList<String>();

		void clicked(int mode) {
			System.out.println(func.get(mode));
		}

		void add(String function) {
			func.add(function);
		}
	}
}