package D_OuterClass;

public class OuterAcc {
	public static void main(String[] str) {
		OuterClass oc = new OuterClass();
		oc.who = "X_me";
		oc.printPublic();
		oc.PrintProt();
		
		OuterClassEx ocx = new OuterClassEx(); 
		ocx.acx.who = "another me";
		ocx.acx.printPublic();
	}
}
