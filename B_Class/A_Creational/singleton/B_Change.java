package singleton;

enum ViewColor {
	Dark, White, Pupple
}

enum MenuPos {
	bot, top, left, right
}

public class B_Change {
	public static void main(String[] args) {
		viewx view = new viewx();
		view.main.setting.MenuBar = MenuPos.right;

		System.out.println(view.setting.MenuBar + " / " + view.setting.ViewMode);

		view.login.setting.ViewMode = ViewColor.Dark;

		System.out.println(view.setting.MenuBar + " / " + view.setting.ViewMode);

		view.premium.setting.MenuBar = MenuPos.left;

		System.out.println(view.setting.MenuBar + " / " + view.setting.ViewMode);
	}
}

class viewx {
	PageSetting setting;
	MainPage main;
	loginPage login;
	PremiumPage premium;

	viewx() {
		setting = new PageSetting(ViewColor.White, MenuPos.bot);
		main = new MainPage(setting);
		login = new loginPage(setting);
		premium = new PremiumPage(setting);
	}

	class MainPage {
		Button next;
		View news;
		Button login;
		PageSetting setting;

		MainPage(PageSetting init) {
			setting = init;
		}
	}

	class loginPage {
		Input ID;
		Input PW;
		Button SignIn;
		Button ForgetPW;
		PageSetting setting;

		loginPage(PageSetting init) {
			setting = init;
		}
	}

	class PremiumPage {
		View Video;
		Input chatting;
		Button like;
		PageSetting setting;

		PremiumPage(PageSetting init) {
			setting = init;
		}
	}

	class PageSetting {
		ViewColor ViewMode; // Dark, White, Pupple
		MenuPos MenuBar; // bottom, top, left, right

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