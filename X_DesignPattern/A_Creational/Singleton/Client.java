package Singleton;

/**
 * @author Seohyun Jung
 * 
 * 		싱글톤 패턴 : 한번만 생성이 된 후에 여러개의 모드에서 가져와야 하는 경우에 사용
 * 			메모리를 아끼고, 코드를 간결하게 함.
 * 
 */

@SuppressWarnings("static-access")
public class Client {
	public static void main(String[] args) {
    	views view = new views();
    	view.main.Setting.MenuBar = MenuPos.top;

    	System.out.println(view.setting.MenuBar + " / "+ view.setting.ViewMode);
    	
    	view.login.Setting.ViewMode = ViewColor.Dark;
    	
    	System.out.println(view.setting.MenuBar + " / "+ view.setting.ViewMode);
    	
    	view.premium.Setting.MenuBar = MenuPos.left;
    	
    	System.out.println(view.setting.MenuBar + " / "+ view.setting.ViewMode);
    }
}

class views{	
	MainPage main  = new MainPage();
	loginPage login = new loginPage();
	PremiumPage premium = new PremiumPage();
	static PageSetting setting = new PageSetting();
	
	class MainPage {
		Button next;
		View news;
		Button login;
		PageSetting Setting = setting;
	}
	
	class loginPage{
		Input ID;
		Input PW;
		Button SignIn;
		Button ForgetPW;
		PageSetting Setting = setting;
	}
	
	class PremiumPage{
		View Video;
		Input chatting;
		Button like;
		PageSetting Setting = setting;
	}
	
	static class PageSetting {
		ViewColor ViewMode;	// Dark, White, Pupple
		MenuPos  MenuBar;	// bottom, top, left, right
		PageSetting() {
			ViewMode = ViewColor.White;
			MenuBar = MenuPos.bot;
		}
	}
	
	class Button{}
	class Menu{}
	class Input{}
	class View{}
}