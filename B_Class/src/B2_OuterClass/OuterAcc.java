package B2_OuterClass;

public class OuterAcc {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.who = "X_me";
		oc.printPublic();
		oc.PrintProt();

		OuterClassEx ocx = new OuterClassEx();
		ocx.acx.who = "another me";
		ocx.acx.printPublic();
	}
}