package C_Extends;
class ParentOr {
    void display() {
    	System.out.println("�θ� Ŭ������ display() �޼ҵ��Դϴ�."); 
    }
}

class ChildOr extends ParentOr {
    void display() {
    	System.out.println("�ڽ� Ŭ������ display() �޼ҵ��Դϴ�.");
    }
}


public class C_Overriding {
	public static void main(String[] args) {
		ParentOr pa = new ParentOr();
		pa.display();
		ChildOr ch = new ChildOr();
		ch.display();
		ParentOr pc = new ChildOr();
		pc.display(); 
		// Child cp = new Parent();
    }
}