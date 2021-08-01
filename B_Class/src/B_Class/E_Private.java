package B_Class;

class ClassPrivate{
	int val1;
	private int val2;
	
	void setVal2(int val) {
		val2 = val;
	}
	
	void showAll() {
		System.out.println("val1 : " + val1 + " / val2 : " + val2);
	}
}

public class E_Private {
	public static void main (String[] args){
		ClassPrivate cp = new ClassPrivate();
		cp.val1 = 10;
		//cp.val2 = 10;
		cp.setVal2(20);
		
		cp.showAll();
	}
}
