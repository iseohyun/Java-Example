package Singleton;

/**
 * @author Seohyun Jung
 * 
 * 		�̱��� ���� : �ѹ��� ������ �� �Ŀ� �������� ��忡�� �����;� �ϴ� ��쿡 ���
 * 			�޸𸮸� �Ƴ���, �ڵ带 �����ϰ� ��.
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