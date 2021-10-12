package B2_OuterClass;

import B_Extends.Z_AccessCtrl;

public class OuterClass extends Z_AccessCtrl {
	public OuterClass() {
		who = "Outer";
	}

	public void PrintProt() {
		this.printProtected();
	}
}