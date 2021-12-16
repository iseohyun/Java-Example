package create.singleton;

public class A_Regular {
	public static void main(String[] args) {
		viewN view = new viewN();
		view.main.setting.MenuBar = MenuPos.right;

		System.out.println(view.setting.MenuBar + " / " + view.setting.ViewMode);

		view.login.setting.ViewMode = ViewColor.Dark;

		System.out.println(view.setting.MenuBar + " / " + view.setting.ViewMode);

		view.premium.setting.MenuBar = MenuPos.left;

		System.out.println(view.setting.MenuBar + " / " + view.setting.ViewMode);
	}
}

class viewN {
	PageSetting setting;
	MainPage main;
	loginPage login;
	PremiumPage premium;

	viewN() {
		setting = new PageSetting(ViewColor.White, MenuPos.bot);
		main = new MainPage();
		login = new loginPage();
		premium = new PremiumPage();
	}

	class MainPage {
		Button next;
		View news;
		Button login;
		PageSetting setting;

		MainPage() {
			setting = new PageSetting();
		}
	}

	class loginPage {
		Input ID;
		Input PW;
		Button SignIn;
		Button ForgetPW;
		PageSetting setting;

		loginPage() {
			setting = new PageSetting();
		}
	}

	class PremiumPage {
		View Video;
		Input chatting;
		Button like;
		PageSetting setting;

		PremiumPage() {
			setting = new PageSetting();
		}
	}

	class PageSetting {
		ViewColor ViewMode; // Dark, White, Pupple
		MenuPos MenuBar; // bottom, top, left, right

		PageSetting() {
			ViewMode = ViewColor.Dark;
			MenuBar = MenuPos.top;
		}

		PageSetting(ViewColor c, MenuPos p) {
			ViewMode = c;
			MenuBar = p;
		}
	}

	class Button {
	}

	class Menu {
	}

	class Input {
	}

	class View {
	}
}