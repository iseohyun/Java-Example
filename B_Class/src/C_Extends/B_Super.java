package C_Extends;
class ParentSu {
	int a = 10;
}

class ChildSu extends ParentSu {
	int a = 20;
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class B_Super{
	public static void main(String[] args) {
		ChildSu ch = new ChildSu();
		ch.display();
	}
}