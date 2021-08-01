package B_Class;

class InitBlock {
	static int classVar = 10;
	int instanceVar = 10;

	static { classVar = 20; }
	{ instanceVar = 20; }
	InitBlock() { instanceVar = 30; }
}
public class C2_methodType {
	public static void main(String[] argv) {
		System.out.println(InitBlock.classVar);
		InitBlock myInit = new InitBlock();
		System.out.println(myInit.instanceVar);
		System.out.println(myInit.classVar);
	}
}
