package B_Class;

public class E_Private {
	static class Class1{
		int val1;
		private int val2;
		
		void setVal2(int val) {
			val2 = val;
		}
		
		void showAll() {
			System.out.println("val1 : " + val1 + " / val2 : " + val2);
		}
	}
	
	public static void main (String[] args){
		Class1 c1 = new Class1();
		c1.val1 = 10;
		
		//c1.val2 = 10;
		
		c1.setVal2(20);
		
		c1.showAll();
	}
}
