package stratagy;

import java.io.IOException;

enum SearchBtn {
	All, Image, News, Map
};

public class NoUse {
	public static void main(String[] args) throws IOException {
		Button btn = new Button();
		System.out.print("Input Number[1-4] : ");
		int mode = System.in.read() - '0';

		btn.clicked(mode);
	}

	static class Button {
		void clicked(int mode) {
			switch (mode) {
			case 1:
				System.out.println("Search all...");
				break;
			case 2:
				System.out.println("Search image...");
				break;
			case 3:
				System.out.println("Search news...");
				break;
			case 4:
				System.out.println("Search map...");
				break;
			}
		}
	}
}