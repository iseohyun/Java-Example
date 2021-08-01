package C_Extends;
class ParentSu2 {
	int a = 10;
	ParentSu2() {
		a = 15;
	}
	ParentSu2(int n) {
		a = n;
	}
	void add1() {
		a++;
	}
}

class ChildSu2 extends ParentSu2 {
	int a = 20;
	ChildSu2(){
		super();
	}
	ChildSu2(int n) {
		super(n);
		this.a = 100;
	}
	void display() {
		System.out.println("Parent : "+ super.a +" /Child : " + this.a);
	}
}

public class B1_SuperInit{
	public static void main(String[] args) {
		ChildSu2 ch = new ChildSu2();
		ChildSu2 ch2 = new ChildSu2(50);
		ch.display();
		ch2.display();
	}
}
