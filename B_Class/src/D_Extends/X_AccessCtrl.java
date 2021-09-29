package D_Extends;

@SuppressWarnings("unused")
public class X_AccessCtrl {
	public String who = "Me";

	public void printPublic() {
		System.out.println(who + "> Public Function");
	}

	private void printPrivate() {
		System.out.println(who + "> private Function");
	}

	protected void printProtected() {
		System.out.println(who + "> protected Function");
	}

	void printDefault() {
		System.out.println(who + "> Default Function");
	}
}