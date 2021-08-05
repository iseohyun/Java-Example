package D_Extends;
import D2_OuterClass.*;

public class D_AccessCtrl{
	static class Child extends X_AccessCtrl {
		Child(){
			who = "Child";
		}
	}
	
	public static void main(String[] args) {
		X_AccessCtrl ac = new X_AccessCtrl();
		ac.printPublic();
		ac.printProtected();
		ac.printDefault();
		//ac.printPrivate();
		
		Child ch = new Child();
		ch.printPublic();
		ch.printProtected();
		ch.printDefault();
		
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