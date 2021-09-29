package D2_OuterClass;

import D_Extends.X_AccessCtrl;

public class OuterClass extends X_AccessCtrl {
	public OuterClass() {
		who = "Outer";
	}

	public void PrintProt() {
		this.printProtected();
	}
}