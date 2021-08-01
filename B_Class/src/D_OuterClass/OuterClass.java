package D_OuterClass;
import C_Extends.D_AccessCtrl;

//public static AccCtrl acx = new AccCtrl();

public class OuterClass extends D_AccessCtrl {
	public OuterClass(){
		who = "Outer";
	}
	public void PrintProt() {
		this.printProtected();
	}
}