package C_Extends;
import D_OuterClass.*;

class ChildAcc extends D_AccessCtrl {
	ChildAcc(){
		who = "Child";
	}
}

public class D1_AccessTest{
	public static void main(String[] args) {
		D_AccessCtrl ac = new D_AccessCtrl();
		ac.printPublic();
		ac.printProtected();
		ac.printDefault();
		//ac.printPrivate();
		
		ChildAcc ca = new ChildAcc();
		ca.printPublic();
		ca.printProtected();
		ca.printDefault();
		
		OuterClass oc = new OuterClass();
		oc.printPublic();
		oc.printProtected();
		//oc.printDefault();
		
		OuterClassEx ocx = new OuterClassEx();
		ocx.acx.who = "Out(Ex)";
		ocx.acx.printPublic();
		ocx.acx.printProtected();
		ocx.acx.printDefault();
		//ocx.ac.printprotected();
	}
}